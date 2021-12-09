package fr.lernejo.chat;
import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {
    ChatMessageRepository repo = new ChatMessageRepository();
    public void onMessage(String message){
        //System.out.println(message);
        repo.addChatMessage(message);
    }
}
