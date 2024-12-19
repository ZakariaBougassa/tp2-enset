package ma.enset.chatbotservice;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZAKARIA
 **/
@RestController
public class ChatbotController {

    private ChatClient chatClient;

    public ChatbotController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping(value = "/chatone", produces = MediaType.TEXT_PLAIN_VALUE)
    public String chatone(String question){
        return chatClient.prompt().user(question).call().content();
    }
}
