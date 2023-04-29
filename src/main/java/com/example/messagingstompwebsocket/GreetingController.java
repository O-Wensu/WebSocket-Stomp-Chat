package com.example.messagingstompwebsocket;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
@RequiredArgsConstructor
public class GreetingController {

	private final SimpMessagingTemplate msgOperation;

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage helloMessage) throws Exception {
		Thread.sleep(500); // simulated delay
		msgOperation.convertAndSend("/topic/greetings" + helloMessage.getRoomId(), helloMessage);
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(helloMessage + "!"));
	}
}
