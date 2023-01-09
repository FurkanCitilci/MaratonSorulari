package com.furkancitilci.view;

import java.util.Arrays;
import java.util.List;

import com.furkancitilci.entity.Musteri;
import com.furkancitilci.entity.Siparis;
import com.furkancitilci.entity.SiparisKalemi;
import com.furkancitilci.entity.Urun;
import com.furkancitilci.service.MusteriService;
import com.furkancitilci.service.SiparisKalemiService;
import com.furkancitilci.service.SiparisService;
import com.furkancitilci.service.UrunService;
import com.furkancitilci.utilty.HibernateUtil;

public class Main {
	
	private static MusteriService musteriService;
	private static UrunService urunService;
	private static SiparisService siparisService;
	private static SiparisKalemiService siparisKalemiService;
	
	
	
	public static void main(String[] args) {
		
		//HibernateUtil.getSessionFactory().openSession();
		
		musteriService = new MusteriService();
		urunService = new UrunService();
		siparisService = new SiparisService();
		siparisKalemiService = new SiparisKalemiService();
		
		
		Musteri m1 = new Musteri("Ali", "Kaya");
		Musteri m2 = new Musteri("Veli", "Özkan");
		
		
		Urun u1 = new Urun("Iphone 11", 17000);
		Urun u2 = new Urun("Samsung s21", 18000);
		Urun u3 = new Urun("LG Led TV", 8500);
		Urun u4 = new Urun("Arçelik Süpürge", 2500);
		
		
		SiparisKalemi sk1 = new SiparisKalemi(u1,1);
		SiparisKalemi sk2 = new SiparisKalemi(u2,2);
		Siparis s1 = new Siparis(m1, Arrays.asList(sk1,sk2));
		
		SiparisKalemi sk3 = new SiparisKalemi(u2,2);
		SiparisKalemi sk4 = new SiparisKalemi(u3,1);
		Siparis s2 = new Siparis(m2, Arrays.asList(sk3,sk4));
		
		SiparisKalemi sk5 = new SiparisKalemi(u4,2);
		Siparis s3 = new Siparis(m1,Arrays.asList(sk5));
		
		Siparis s4 = new Siparis(m2, Arrays.asList(new SiparisKalemi(u1,1)));
		Siparis s5 = new Siparis(m2, Arrays.asList(new SiparisKalemi(u2,1)));
		
		
		try {
//			musteriService.save(m1);
//			musteriService.save(m2);
//			urunService.save(u1);
//			urunService.save(u4);
//			urunService.save(u4);
//			urunService.save(u4);
			siparisService.save(s1);
			siparisService.save(s2);
			siparisService.save(s3);
			siparisService.save(s4);
			siparisService.save(s5);
			siparisKalemiService.save(sk1);
			siparisKalemiService.save(sk2);
			siparisKalemiService.save(sk3);
			siparisKalemiService.save(sk4);
			siparisKalemiService.save(sk5);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		List<Siparis> siparisler = siparisService.getAll();
		
			for (Siparis s : siparisler) {
				int top =0;
				System.out.println();
				System.out.println("Sipariş ID :" + s.getId());
				System.out.println("Müşteri: " + s.getMusteri().getMusteriAd() + " " + s.getMusteri().getMusteriSoyAd() + " Müşteri ID: " + s.getMusteri().getId());
				for(SiparisKalemi sk : s.getSiparisKalemleri()) {
					System.out.println("Ürün :" + sk.getUrun().getUrunAdi() + " Fiyatı:" + sk.getUrun().getUrunAdi() + " Adet Sayısı: " + sk.getSiparisAdedi());
					top = top + sk.getUrun().getUrunFiyati();
						
				}
				System.out.println("Sipariş Toplam : " + top);
				
			}
			
			
			//Musteri bazlı sorgulama yapın
			try {
				musteriService.getById(1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Müşteri numarasına göre sipariş adetlerini gruplayıp yazdıran Native SQL sorgusu
			musteriService.namedQueryFindById(1);
		
	}

}
