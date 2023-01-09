package com.furkancitilci.service;



import com.furkancitilci.entity.Musteri;
import com.furkancitilci.repository.MusteriDao;


public class MusteriService {
	
	private MusteriDao musteriDao;

	public MusteriService() {
		
		musteriDao = new MusteriDao();
	}
	
	public void save(Musteri musteri)  {
		
		
		try {
			musteriDao.save(musteri);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public Musteri getById(int id) throws Exception {
	
		return musteriDao.getById(id);
	}
	
	public void namedQueryFindById(int id) {
		musteriDao.namedQueryFindById(id);			
	}
	
	

}
