package br.com.animal;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.funcionario.Funcionario;

@Entity
public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_animal;
	
	private String nome;
	private Timestamp nascimento;
	private Timestamp entrada;
	private int idade;
	private String descricao;
	private Double peso;
	private String porte;
	private String tipo;
	private String cor;
	
	private Set<String> imagens = new HashSet<String>();
	
	@OneToOne
	private Funcionario funcionario;
	
	public Animal() {}

	public int getId_animal() {
		return id_animal;
	}
	
	public void setId_animal(int id_animal) {
		this.id_animal = id_animal;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Timestamp getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(Timestamp nascimento) {
		this.nascimento = nascimento;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public String getPorte() {
		return porte;
	}
	
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setEntrada(Timestamp entrada) {
		this.entrada = entrada;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Timestamp getEntrada() {
		return entrada;
	}

	public Set<String> getImagens() {
		return imagens;
	}

	public void setImagens(Set<String> imagens) {
		this.imagens = imagens;
	}

}
