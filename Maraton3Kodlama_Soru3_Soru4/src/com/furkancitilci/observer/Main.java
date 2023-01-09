package com.furkancitilci.observer;

public class Main {

	public static void main(String[] args) {

		SubscriberKaptan skaptan = new SubscriberKaptan();
		SubscriberHaberlesmeci sHaberlesmeci = new SubscriberHaberlesmeci();
		SubscriberTorpido sTorpido = new SubscriberTorpido();
		
		PublisherSonar pSonar = new PublisherSonar();
		PublisherOksijenSensoru pOksijen = new PublisherOksijenSensoru();
		PublisherYanginSondurucu pYangin = new PublisherYanginSondurucu();
		
		pSonar.attach(skaptan);
		pSonar.attach(sHaberlesmeci);
		pSonar.attach(sTorpido);
		pSonar.notifyUpdate(new MessageSonar("Sonar mesaj :", "Triton 3300/3", 40, 100, "GüneyBatı"));
		pOksijen.attach(skaptan);
		pOksijen.notifyUpdate(new MessageOksijenSensoru("Oksijen Sensoru: ", "%50", "KuzeyDoğu"));
		pYangin.attach(skaptan);
		pYangin.attach(sHaberlesmeci);
		pYangin.notifyUpdate( new MessageYanginSondurucu("Yangın Sensoru: ", "Batı", 27));
		
		
		
		
		

	}

}
