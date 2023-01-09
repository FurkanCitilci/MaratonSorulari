package com.furkancitilci.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Urun {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name = "urun_id", referencedColumnName = "id")
	private SiparisKalemi siparisKalemi;
	private String urunAdi;
	private int urunFiyati;
	
	
	public Urun() {
		
		
	}


	public Urun(String urunAdi, int urunFiyati) {
		super();
		this.urunAdi = urunAdi;
		this.urunFiyati = urunFiyati;
	}


	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUrunAdi() {
		return urunAdi;
	}


	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}


	public int getUrunFiyati() {
		return urunFiyati;
	}


	public void setUrunFiyati(int urunFiyati) {
		this.urunFiyati = urunFiyati;
	}
	
	

}
