package com.furkancitilci.observer;

public class SubscriberHaberlesmeci implements ObserverSonar, ObserverYanginSondurucu {

	@Override
	public void update(MessageYanginSondurucu m) {

		System.out.println("Haberleşme Ekranı Yangın söndürme alarmı aldı--->" + m.getMessageContent());
		
	}

	@Override
	public void update(MessageSonar m) {
		System.out.println("Haberleşme Ekranı Sonar alarmı aldı--->" + m.getMessageContent());
		
	}

}
