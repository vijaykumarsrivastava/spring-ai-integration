package com.vijay.spring.boot.ai.spring_ai_integration.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.spring.boot.ai.spring_ai_integration.service.ChatService;

/**
 * Controller exposing patient-related APIs.
 */
@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ChatController {
    
    @Autowired
    ChatService chatService;
    
    @PostMapping("/chat")
    public String chat(@RequestBody String msg) {
    	System.out.println("Chat endpoint called, invoking ChatService..." + msg);
    	String chat = chatService.chat(msg);
    	System.out.println("ChatService response: " + chat);
    	return chat;
    }

}
