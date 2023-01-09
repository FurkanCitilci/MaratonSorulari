package com.furkancitilci.observer;

public interface SubjectYanginSondurucu {
	
	public void attach(ObserverYanginSondurucu o);
	public void detach(ObserverYanginSondurucu o);
	public void notifyUpdate(MessageYanginSondurucu m);

}
