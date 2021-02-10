package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Legion");
		EntityManager em = emf.createEntityManager();
		Pays pays = em.find(Pays.class,  "FR");
		System.out.println(pays.getIso2());

		
	}

}
