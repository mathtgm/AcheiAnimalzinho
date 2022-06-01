package br.com.funcionario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class FuncionarioDAO implements FuncionarioRepository{
	
	EntityManager em;
	EntityManagerFactory emf;
	
	public FuncionarioDAO() {
		emf = Persistence.createEntityManagerFactory("banco-jpa");
		em = emf.createEntityManager();
	}
	
	@Override
	public List<Funcionario> listarFuncionarios() {
		Session session = em.unwrap(org.hibernate.Session.class);
		return session.createQuery("from Funcionario").list();
	}

	@Override
	public Funcionario consultarFuncionario(int id_funcionario) {
		return em.find(Funcionario.class, id_funcionario);
	}

	@Override
	public void excluirFuncionario(int id_funcionario) {
		Funcionario funcionario = new Funcionario();
		funcionario.setId_funcionario(id_funcionario);
		em.remove(funcionario);		
	}

	@Override
	public void cadastrarFunconario(Funcionario funcionario) {
		em.persist(funcionario);
	}

	@Override
	public Funcionario autenticarFuncionario(String usuario, String senha) {
		Session session = em.unwrap(org.hibernate.Session.class);
		Query query = session.createQuery("from Funcionario WHERE usuario = ? AND senha = ?");
		query.setParameter(0, usuario);
		query.setParameter(1, senha);
		Funcionario funcionario;
		List<Funcionario> listaFuncionario = query.list();
		
		
		//Se contagem da lista for igual a 1 retorna o primeiro funcionario, caso o contrario retorna null
		if(listaFuncionario.size() == 1) {
			funcionario = listaFuncionario.get(0);
			return funcionario;
		}
		
		return null;
	}
	
	

}
