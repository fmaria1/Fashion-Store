package ro.tip.fashionstore.model;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	private static EntityManagerFactory instance;

	@Produces
	public static synchronized EntityManagerFactory getEntityManagerFactory() {
		if (instance == null) {
			instance = Persistence.createEntityManagerFactory("fashionStore");
		}
		return instance;
	}

	@Produces
	public EntityManager produceEntityManager() {
		return getEntityManagerFactory().createEntityManager();
	}
}