package com.salil;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateInterface {
	
	final static Configuration CONFIGURATION = new AnnotationConfiguration().configure();
	final static SessionFactory SESSION_FACTORY = CONFIGURATION.buildSessionFactory();

	public static void saveEntities(final Object entity)
	{
		final Session session = SESSION_FACTORY.openSession();
		session.beginTransaction();
		try {
			session.saveOrUpdate(entity);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			session.close();	
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<Object> getRecordsOfType(final Class<?> classObject)
	{
		final Session session = SESSION_FACTORY.openSession();
		try {
			return session.createCriteria(classObject).list();
		}
		finally{
			session.close();	
		}
	}
	
	public static int exectueQuery(final String hqlQuery)
	{
		int effectedRecords=0;
		final Session session = SESSION_FACTORY.openSession();
		session.beginTransaction();
		try {
			effectedRecords=session.createQuery(hqlQuery).executeUpdate();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{
			session.close();	
		}
		return effectedRecords;
	}
	
  
	
}
