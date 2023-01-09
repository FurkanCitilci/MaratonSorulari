package com.furkancitilci.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.furkancitilci.entity.Siparis;
import com.furkancitilci.repository.SiparisDao;
import com.furkancitilci.utilty.HibernateUtil;

public class SiparisService {
	
	private SiparisDao siparisDao;
	
	public SiparisService() {
		siparisDao = new SiparisDao();
	}
	
	public List<Siparis> getAll(){
		
		return siparisDao.getAll();
}

	public void save(Siparis siparis) throws Exception {
	
	
	siparisDao.save(siparis);
}


}
