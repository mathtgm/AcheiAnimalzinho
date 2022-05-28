package br.com.funcionario;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.pessoa.Pessoa;

@Entity
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_funcionario;
	
	@Embedded
	private Pessoa pessoa;
	
	public int getId_funcionario() {
		return id_funcionario;
	}
	
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	
}
