package com.furkancitilci.utilty;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.furkancitilci.entity.Musteri;
import com.furkancitilci.entity.Siparis;
import com.furkancitilci.entity.SiparisKalemi;
import com.furkancitilci.entity.Urun;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			try {
				
				Configuration configuration = new Configuration();

				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "org.postgresql.Driver");
				settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/dbalisveris");
				settings.put(Environment.USER, "postgres");
				settings.put(Environment.PASS, "9896");

				settings.put(Environment.HBM2DDL_AUTO, "create"); // create update
				// create -> bu sınıfta belirtilen ORM tablolarını siler (içeirğiyle beraber) ve
				// yeniden oluşturur. Test amaçlı çalışmalarda bu şekilde kullanılabilir.
				// update -> tablo yoksa oluşturur, varsa silmez. İçeriğini günceller.

				settings.put(Environment.SHOW_SQL, "false"); 
															
				settings.put(Environment.FORMAT_SQL, "true"); 

				configuration.setProperties(settings);

				
				configuration.addAnnotatedClass(Musteri.class);
				configuration.addAnnotatedClass(Siparis.class);
				configuration.addAnnotatedClass(SiparisKalemi.class);
				configuration.addAnnotatedClass(Urun.class);

				

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				// Session factory nesnesi üretiliyor..
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return sessionFactory;
	}
}
