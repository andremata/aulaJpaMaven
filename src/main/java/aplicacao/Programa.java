package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //mesmo nome do arquivo persistence.xml
		EntityManager em = emf.createEntityManager();
		
		//INSERÇÃO NO BANCO DE DADOS
		Pessoa p1 = new Pessoa(null, "Andre", "andre@gmail.com");
		Pessoa p2 = new Pessoa(null, "Rogeria", "rogeria@gmail.com");
		Pessoa p3 = new Pessoa(null, "Camila", "camila@gmail.com");
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		//BUSCA NO BANCO DE DADOS
		Pessoa p = em.find(Pessoa.class, 3);
		
		System.out.println(p);
		
		//REMOVER NO BANCO DE DADOS
		Pessoa pm = em.find(Pessoa.class, 2);
		
		em.getTransaction().begin();
		em.remove(pm);
		em.getTransaction().commit();
		
		System.out.println("Acabou...");
		
		em.close();
		emf.close();
	}
}
