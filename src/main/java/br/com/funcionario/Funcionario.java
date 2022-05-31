package br.com.funcionario;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicUpdate;

import br.com.animal.Animal;
import br.com.pessoa.Pessoa;

@Entity
@DynamicUpdate
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_funcionario;
	
	@Embedded
	private Pessoa pessoa;
	
	@OneToMany(mappedBy = "funcionario")
	private Set<Animal> animais = new HashSet<Animal>();
	
	public int getId_funcionario() {
		return id_funcionario;
	}
	
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Set<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(Set<Animal> animais) {
		this.animais = animais;
	}
	
}
