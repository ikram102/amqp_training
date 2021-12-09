package fr.lernejo.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageRepository {
    List<String> list = new ArrayList<>();
    public void addChatMessage(String message){
        list.add(message);
    }

    public List<String> getLastTenMessages(){
        if (list.size()<10){
            return list;
        }
        else {
            List<String> arr= list.subList(list.size()-10, list.size());
            return arr;
        }
    }


}
