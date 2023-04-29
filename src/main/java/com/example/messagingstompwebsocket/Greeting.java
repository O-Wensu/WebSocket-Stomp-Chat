package com.example.messagingstompwebsocket;

import lombok.extern.slf4j.Slf4j;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Greeting {

	private String content;

	public Greeting(String content) {
		this.content = content;
	}
}
