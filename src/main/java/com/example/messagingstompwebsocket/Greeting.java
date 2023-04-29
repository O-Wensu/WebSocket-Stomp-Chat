package com.example.messagingstompwebsocket;

import lombok.extern.slf4j.Slf4j;

public class Greeting {

	private String content;

	public Greeting() {
	}

	public Greeting(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

}
