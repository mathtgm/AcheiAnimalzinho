package br.com.adotante;

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
public class Adotante implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_adotante;
	
	@Embedded
	private Pessoa pessoa;
	
	@OneToMany(mappedBy = "adotante", orphanRemoval = false)
	private Set<Animal> animais = new HashSet<Animal>();
	
	public Adotante() {}

	public Adotante(int id_adotante, Pessoa pessoa, Set<Animal> animais) {
		super();
		this.id_adotante = id_adotante;
		this.pessoa = pessoa;
		this.animais = animais;
	}

	public int getId_adotante() {
		return id_adotante;
	}

	public void setId_adotante(int id_adotante) {
		this.id_adotante = id_adotante;
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
