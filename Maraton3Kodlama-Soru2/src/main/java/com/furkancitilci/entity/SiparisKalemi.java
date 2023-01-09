package com.furkancitilci.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class SiparisKalemi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	private Urun urun;
	@ManyToOne(cascade = CascadeType.ALL)
	private Siparis siparis;
	
	private int siparisAdedi;

	public SiparisKalemi() {
		
	}

	public SiparisKalemi(Urun urun, int siparisAdedi) {
		super();
		this.urun = urun;
		this.siparisAdedi = siparisAdedi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Urun getUrun() {
		return urun;
	}

	public void setUrun(Urun urun) {
		this.urun = urun;
	}

	public int getSiparisAdedi() {
		return siparisAdedi;
	}

	public void setSiparisAdedi(int siparisAdedi) {
		this.siparisAdedi = siparisAdedi;
	}
	
	

	
	
	
	
	

}
