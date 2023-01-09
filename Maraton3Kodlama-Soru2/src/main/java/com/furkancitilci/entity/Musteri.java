package com.furkancitilci.entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Musteri {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToMany(fetch = FetchType.EAGER,mappedBy="musteri")	
	private List<Siparis> siparisler;
	private String musteriAd;
	private String musteriSoyAd;
	
	
	public Musteri() {
		
	}



	public Musteri(String musteriAd, String musteriSoyAd) {
		super();
		this.musteriAd = musteriAd;
		this.musteriSoyAd = musteriSoyAd;
	}


	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMusteriAd() {
		return musteriAd;
	}


	public void setMusteriAd(String musteriAd) {
		this.musteriAd = musteriAd;
	}


	public String getMusteriSoyAd() {
		return musteriSoyAd;
	}


	public void setMusteriSoyAd(String musteriSoyAd) {
		this.musteriSoyAd = musteriSoyAd;
	}
	
	
	

}
