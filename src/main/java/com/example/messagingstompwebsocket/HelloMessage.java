package com.example.messagingstompwebsocket;

public class HelloMessage {

	private String message;

	private String roomId;

	public HelloMessage() {
	}

	public HelloMessage(String message, String roomId) {
		this.roomId = roomId;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
