package com.furkancitilci.singletonfactory;

public class CarFactory {
	
	public ICar aracUretim(String carType) {
		
		if(carType == null || carType.isEmpty())
			return null;
		
		switch (carType) {
		case ICar.TICARİ:
			return new CarTicari();
		case ICar.SPOR:
			return new CarSpor();
		case ICar.SEDAN:
			return new CarSedan();
		case ICar.HATCHBACK:
			return new CarHatchBack();


		default:
			throw new IllegalArgumentException("Unknow car Type :" + carType);
		}
	}

}
