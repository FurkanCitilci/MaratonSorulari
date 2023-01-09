package com.furkancitilci.observer;

public class MessageYanginSondurucu {
	
	final String messageContent;
	final String lokasyon;
	final double sicaklik;
	
	
	public MessageYanginSondurucu(String messageContent, String lokasyon, double sicaklik) {
		super();
		this.messageContent = messageContent;
		this.lokasyon = lokasyon;
		this.sicaklik = sicaklik;
	}
	
	public String getMessageContent() {
		return "MessageYanginSondurucu [messageContent=" + messageContent + ", lokasyon=" + lokasyon + ", sicaklik="
				+ sicaklik + "]";
		
	}

	

	
	
}
