package com.furkancitilci.observer;

public interface SubjectOksijenSensoru {
	
	public void attach(ObserverOksijenSensoru o);
	public void detach(ObserverOksijenSensoru o);
	public void notifyUpdate(MessageOksijenSensoru m);

}
