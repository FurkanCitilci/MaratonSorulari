package com.furkancitilci.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherOksijenSensoru implements SubjectOksijenSensoru {

	private List<ObserverOksijenSensoru> observers = new ArrayList<>();
	
	@Override
	public void attach(ObserverOksijenSensoru o) {

		observers.add(o);
		
	}

	@Override
	public void detach(ObserverOksijenSensoru o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(MessageOksijenSensoru m) {

		for (ObserverOksijenSensoru o : observers) {
			o.update(m);
			
		}
		
	}

}
