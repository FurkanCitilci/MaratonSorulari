package com.furkancitilci.repository;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.furkancitilci.entity.Musteri;
import com.furkancitilci.utilty.HibernateUtil;


public class MusteriDao {
	
	public void save(Musteri musteri) throws Exception {
		
		
		Transaction transaction = null;		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(musteri);
			transaction.commit();					
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new Exception("kayıt başarısız!");
		}
		
	}
	
	public Musteri getById(int id) throws Exception {
		Transaction transaction = null;
		Musteri musteri = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {			
			// start transaction
			transaction = session.beginTransaction();			
			// get  object
			musteri = session.get(Musteri.class, id);			
			// commit transaction
			transaction.commit();									
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw new Exception("kayıt başarısız!");
		}
		
		return musteri;
	}
	
	
	
	public void namedQueryFindById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		EntityManager entityManager = session.getEntityManagerFactory().createEntityManager();
		
		TypedQuery<Musteri> query = entityManager.createNamedQuery("Musteri.findById", Musteri.class);
		
		query.setParameter("id", id);
		List<Musteri> list = query.getResultList();
		list.forEach(System.out::println);				
	}
	
	

}
