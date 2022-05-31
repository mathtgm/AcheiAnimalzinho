package br.com.adotante;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;


public class AdotanteDAO implements AdotanteRepository{
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public AdotanteDAO() {
		emf = Persistence.createEntityManagerFactory("banco-jpa");
		em = emf.createEntityManager();
	}
	
	@Override
	public Adotante consultaAdotante(int id_adotante) {
		
		return em.find(Adotante.class, id_adotante);
	}

	@Override
	public List<Adotante> listaAdotante() {
		Session session = em.unwrap(org.hibernate.Session.class);
		return session.createQuery("from Adotante").list();
	}

	@Override
	public void cadastrarAdotante(Adotante adotante) {
		em.persist(adotante);
	}

	@Override
	public void excluirAdotante(int id_adotante) {
		Adotante adotante = new Adotante();
		adotante.setId_adotante(id_adotante);
		em.remove(adotante);
	}

}
