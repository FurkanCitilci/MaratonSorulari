package com.furkancitilci.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherSonar implements SubjectSonar{

	private List<ObserverSonar> observers = new ArrayList<>();
	
	@Override
	public void attach(ObserverSonar o) {

		observers.add(o);
		
	}

	@Override
	public void detach(ObserverSonar o) {

		observers.remove(o);
	}

	@Override
	public void notifyUpdate(MessageSonar m) {
		for (ObserverSonar o : observers) {
			o.update(m);
		}
		
	}

}
