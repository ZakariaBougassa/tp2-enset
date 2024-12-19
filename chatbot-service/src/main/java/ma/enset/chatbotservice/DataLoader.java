package ma.enset.chatbotservice;

import jakarta.annotation.PostConstruct;
import org.springframework.ai.document.Document;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.reader.pdf.PagePdfDocumentReader;
import org.springframework.ai.transformer.splitter.TextSplitter;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

/**
 * @author ZAKARIA
 **/
@Component
public class DataLoader {

    @Value("classpath:/pdfs/banque.pdf")
    private Resource pdfFile;
    @Value("banque.json")
    private String fileStore;


    private VectorStore vectorStore;
    private JdbcClient jdbcClient;

    public DataLoader(VectorStore vectorStore, JdbcClient jdbcClient) {
        this.vectorStore = vectorStore;
        this.jdbcClient = jdbcClient;
    }

    //@Bean
    SimpleVectorStore simpleVectorStore(EmbeddingModel embeddingModel){
        SimpleVectorStore vectorStore = new SimpleVectorStore(embeddingModel);
        String storePath = Path.of("src", "main", "resources", "store").toAbsolutePath()+"/"+fileStore;
        File bdStore = new File(storePath);
        if (!bdStore.exists()){
            PagePdfDocumentReader documentReader = new PagePdfDocumentReader(pdfFile);
            List<Document> documents = documentReader.get();
            TextSplitter textSplitter = new TokenTextSplitter();
            List<Document> chunks = textSplitter.split(documents);
            vectorStore.accept(chunks);
            vectorStore.save(bdStore);

        }else {
            vectorStore.load(bdStore);
        }
        return vectorStore;
    }

    @PostConstruct
    public void init(){
        Integer count = jdbcClient.sql("select count(*) from vector_store")
                .query(Integer.class).single();
        if (count == 0){
            PagePdfDocumentReader documentReader = new PagePdfDocumentReader(pdfFile);
            List<Document> documents = documentReader.get();
            TextSplitter textSplitter = new TokenTextSplitter();
            List<Document> chunks = textSplitter.split(documents);
            vectorStore.accept(chunks);
        }

    }


}
