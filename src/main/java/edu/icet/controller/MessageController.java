package edu.icet.controller;


import edu.icet.Model.dto.Users;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public Users sendMessage(Users users){
        return users;

    }
}
