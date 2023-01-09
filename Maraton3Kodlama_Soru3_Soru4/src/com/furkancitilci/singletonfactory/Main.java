package com.furkancitilci.singletonfactory;

public class Main {
	
	
	public static void main(String[] args) {
		
		CarFactory carFactory = Singleton.getCarFactory();
		
		carFactory.aracUretim(ICar.TICARİ).uretim();
		carFactory.aracUretim(ICar.SPOR).uretim();
		carFactory.aracUretim(ICar.SEDAN).uretim();
		carFactory.aracUretim(ICar.HATCHBACK).uretim();
		
	}
	
	

}
