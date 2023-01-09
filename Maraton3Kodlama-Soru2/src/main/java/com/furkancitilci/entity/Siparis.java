package com.furkancitilci.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Siparis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(cascade = CascadeType.ALL)
	private Musteri musteri;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="siparis")
	private List<SiparisKalemi> siparisKalemleri;

	public Siparis() {
		
	}

	public Siparis(Musteri musteri, List<SiparisKalemi> siparisKalemleri) {
		super();
		this.musteri = musteri;
		this.siparisKalemleri = siparisKalemleri;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public List<SiparisKalemi> getSiparisKalemleri() {
		return siparisKalemleri;
	}

	public void setSiparisKalemleri(List<SiparisKalemi> siparisKalemleri) {
		this.siparisKalemleri = siparisKalemleri;
	}
	
	
	
	
	
	

}
