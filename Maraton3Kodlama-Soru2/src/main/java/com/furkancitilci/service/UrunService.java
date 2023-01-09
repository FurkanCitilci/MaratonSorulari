package com.furkancitilci.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.furkancitilci.entity.Urun;
import com.furkancitilci.repository.UrunDao;
import com.furkancitilci.utilty.HibernateUtil;

public class UrunService {
	
	private UrunDao urunDao;
	
	
	
	public UrunService() {
		urunDao = new UrunDao();
	}



	public void save(Urun urun) throws Exception {
		
		
		urunDao.save(urun);

	}
	
}	
	
	

