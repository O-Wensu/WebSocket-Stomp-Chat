package com.example.messagingstompwebsocket;

public class HelloMessage {

	private String message;

	private String roomId;

	public HelloMessage(String message, String roomId) {
		this.roomId = roomId;
		this.message = message;
	}
}
