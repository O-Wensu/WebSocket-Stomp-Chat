package com.example.messagingstompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

	private SimpMessagingTemplate msgOperation;

	public GreetingController(SimpMessagingTemplate msgOperation) {
		this.msgOperation = msgOperation;
	}

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage helloMessage) throws Exception {
		Thread.sleep(500); // simulated delay
		msgOperation.convertAndSend("/topic/greetings" + helloMessage.getRoomId(), helloMessage);
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(helloMessage + "!"));
	}
}
