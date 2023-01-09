package com.furkancitilci.singletonfactory;

public class Singleton {
	
	private static CarFactory carFactory;
	
	public static CarFactory getCarFactory() {
		if(carFactory==null) {
			carFactory = new CarFactory();
		}
		return carFactory;
	}

}
