package com.furkancitilci.observer;

public class SubscriberKaptan implements ObserverOksijenSensoru, ObserverSonar, ObserverYanginSondurucu{

	@Override
	public void update(MessageYanginSondurucu m) {
		
		System.out.println("Kaptan Ekranı Yangın söndürme alarmı--->" + m.getMessageContent());
		
	}

	@Override
	public void update(MessageSonar m) {

		System.out.println("Kaptan Ekranı Sonar alarmı--->" + m.getMessageContent());
		
	}

	@Override
	public void update(MessageOksijenSensoru m) {
		System.out.println("Kaptan Ekranı Oksijen Söndürme alarmı--->" + m.getMessageContent());
		
	}

}
