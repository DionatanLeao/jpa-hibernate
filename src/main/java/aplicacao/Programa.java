package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

/***
 * 
 * @author dionatan
 *
 */

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Maria", "maria@email.com");
		Pessoa p2 = new Pessoa(2, "Alex", "alex@email.com");
		Pessoa p3 = new Pessoa(3, "Jonh", "jonh@email.com");

		EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = enf.createEntityManager();

		em.getTransaction().begin();

		em.persist(p1);
		em.persist(p2);
		em.persist(p3);

		Pessoa obj = em.find(Pessoa.class, 2);
		em.remove(obj);

		em.getTransaction().commit();
		System.out.println("Pronto");

		em.close();
		enf.close();

	}

}
