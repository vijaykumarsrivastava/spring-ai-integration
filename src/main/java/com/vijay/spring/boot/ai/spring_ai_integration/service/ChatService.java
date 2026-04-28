package com.vijay.spring.boot.ai.spring_ai_integration.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

	@Autowired
	private ChatClient chatClient;

	public String chat(String message) {
		return chatClient.prompt().user(message).call().content();
	}

}
