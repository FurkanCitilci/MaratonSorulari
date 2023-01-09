package com.furkancitilci.observer;

public class SubscriberTorpido implements ObserverSonar {

	@Override
	public void update(MessageSonar m) {
		System.out.println("Torpido Merkezi Sonar alarmı aldı--->" + m.getMessageContent());
		
	}

}
