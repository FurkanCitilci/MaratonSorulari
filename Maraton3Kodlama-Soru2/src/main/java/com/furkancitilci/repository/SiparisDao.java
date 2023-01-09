package com.furkancitilci.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.furkancitilci.entity.Siparis;
import com.furkancitilci.utilty.HibernateUtil;

public class SiparisDao {
	
	public List<Siparis> getAll(){
			
			Transaction transaction = null;
			List<Siparis> list = null;								
			
			try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
				
				transaction = session.beginTransaction();			
				
				list = session.createQuery("select siparis from Siparis siparis").list();				
				
				transaction.commit();						
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}			
			}
			
			return list;
	}

	public void save(Siparis siparis) throws Exception {
		
		
		Transaction transaction = null;		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
		
			transaction = session.beginTransaction();			
			session.save(siparis);	
			transaction.commit();					
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new Exception("kayıt başarısız!");
		}
	}
	
}
