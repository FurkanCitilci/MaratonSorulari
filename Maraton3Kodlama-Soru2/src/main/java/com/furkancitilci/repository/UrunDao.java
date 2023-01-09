package com.furkancitilci.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.furkancitilci.entity.Urun;
import com.furkancitilci.utilty.HibernateUtil;

public class UrunDao {
	
	public void save(Urun urun) throws Exception {
		
		
		Transaction transaction = null;		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
		
			transaction = session.beginTransaction();			
			session.save(urun);	
			transaction.commit();					
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new Exception("kayıt başarısız!");
		}
		
	}
	
	

}
