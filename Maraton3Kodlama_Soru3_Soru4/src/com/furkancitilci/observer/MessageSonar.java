package com.furkancitilci.observer;

public class MessageSonar {
	
	final String messageContent;
	final String denizAltiTipi;
	final int denizAltiHizi;
	final int aracinUzakligi;
	final String aracinYonu;
	
	
	public MessageSonar(String messageContent, String denizAltiTipi, int denizAltiHizi, int aracinUzakligi,
			String aracinYonu) {
		super();
		this.messageContent = messageContent;
		this.denizAltiTipi = denizAltiTipi;
		this.denizAltiHizi = denizAltiHizi;
		this.aracinUzakligi = aracinUzakligi;
		this.aracinYonu = aracinYonu;
	}




	public String getMessageContent() {

		return "MessageSonar [messageContent=" + messageContent + ", denizAltiTipi=" + denizAltiTipi
				+ ", denizAltiHizi=" + denizAltiHizi + ", aracinUzakligi=" + aracinUzakligi + ", aracinYonu="
				+ aracinYonu + "]";
	}


	
	
	

}
