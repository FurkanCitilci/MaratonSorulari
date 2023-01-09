package com.furkancitilci.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherYanginSondurucu implements SubjectYanginSondurucu{

	private List<ObserverYanginSondurucu> observers = new ArrayList<>();
	
	@Override
	public void attach(ObserverYanginSondurucu o) {
		observers.add(o);
		
	}

	@Override
	public void detach(ObserverYanginSondurucu o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(MessageYanginSondurucu m) {
		for (ObserverYanginSondurucu o : observers) {
			o.update(m);
			
		}
		
	}

}
