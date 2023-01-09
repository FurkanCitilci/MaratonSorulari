package com.furkancitilci.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.furkancitilci.entity.Siparis;
import com.furkancitilci.entity.SiparisKalemi;
import com.furkancitilci.utilty.HibernateUtil;

public class SiparisKalemiDao {
	
	public void save(SiparisKalemi siparisKalemi) throws Exception {
		
		
		Transaction transaction = null;		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
		
			transaction = session.beginTransaction();			
			session.save(siparisKalemi);	
			transaction.commit();					
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new Exception("kayıt başarısız!");
		}
	}

}
