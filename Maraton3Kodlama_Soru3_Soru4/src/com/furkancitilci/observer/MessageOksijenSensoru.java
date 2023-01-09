package com.furkancitilci.observer;

public class MessageOksijenSensoru {

	final String messageContent;
	final String oksijenSeviyesi;
	final String lokasyon;
	
	
	public MessageOksijenSensoru(String messageContent, String oksijenSeviyesi, String lokasyon) {
		super();
		this.messageContent = messageContent;
		this.oksijenSeviyesi = oksijenSeviyesi;
		this.lokasyon = lokasyon;
	}
	
	
	public String getMessageContent() {
		return "MessageOksijenSensoru [messageContent=" + messageContent + ", oksijenSeviyesi=" + oksijenSeviyesi
				+ ", lokasyon=" + lokasyon + "]";
		
	}


	
	
	
	
	
}
