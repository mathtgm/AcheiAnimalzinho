package br.com.animal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

public class AnimalDAO implements AnimalRepository {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public AnimalDAO() {
		emf = Persistence.createEntityManagerFactory("banco-jpa");
		em = emf.createEntityManager();
	}
	
	@Override
	public Animal consultaAnimal(int id_animal) {
		return em.find(Animal.class, id_animal);
	}

	@Override
	public List<Animal> listaAnimais() {
		Session session = em.unwrap(org.hibernate.Session.class);
		return session.createQuery("from Animal").list();
	}

	@Override
	public void cadastrarAnimal(Animal animal) {
		em.persist(animal);
	}

	@Override
	public void excluirAnimal(int id_animal) {
		
	}

	@Override
	public void alterarAnimal(Animal animal) {
		em.merge(animal);
		
	}

	@Override
	public List<Animal> animaisDisponivel() {
		Session session = em.unwrap(org.hibernate.Session.class);
		return session.createQuery("from Animal where id_adotante = null").list();
	}

}
