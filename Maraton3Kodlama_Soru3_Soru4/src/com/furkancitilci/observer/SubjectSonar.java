package com.furkancitilci.observer;

public interface SubjectSonar {
	
	public void attach(ObserverSonar o);
	public void detach(ObserverSonar o);
	public void notifyUpdate(MessageSonar m);

}
