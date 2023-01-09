package com.furkancitilci.service;



import com.furkancitilci.entity.SiparisKalemi;
import com.furkancitilci.repository.SiparisKalemiDao;


public class SiparisKalemiService {
	
	private SiparisKalemiDao siparisKalemiDao;
	
	
	public SiparisKalemiService() {
		siparisKalemiDao = new SiparisKalemiDao();
	}
	
	public void save(SiparisKalemi siparisKalemi) {
		
		try {
			siparisKalemiDao.save(siparisKalemi);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
