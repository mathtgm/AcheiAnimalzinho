package br.com.animal;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicUpdate;

import br.com.adotante.Adotante;
import br.com.funcionario.Funcionario;

@Entity
@DynamicUpdate
public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_animal;
	
	@Column(length = 30)
	private String nome;
	
	private Date nascimento;
	private Timestamp entrada;
	
	@Column(length = 2)
	private int idade;
	
	@Column(length = 300)
	private String descricao;
	
	@Column(precision=5, scale=2)
	private Double peso;
	
	@Column(length = 20)
	private String porte;
	
	private String tipo;
	
	@Column(length = 30)
	private String pelagem;
	
	@OneToMany(mappedBy = "animal", orphanRemoval = true)
	private Set<ImagemAnimal> imagens = new HashSet<ImagemAnimal>();
	
	@ManyToOne
	@JoinColumn(name = "id_adotante")
	private Adotante adotante;
	
	@ManyToOne
	@JoinColumn(name = "id_funcionario")
	private Funcionario funcionario;
	
	public Animal() {}
	
	public Animal(String nome, Date nascimento, Timestamp entrada, int idade, String descricao, Double peso,
			String porte, String tipo, String pelagem, Funcionario funcionario) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.entrada = entrada;
		this.idade = idade;
		this.descricao = descricao;
		this.peso = peso;
		this.porte = porte;
		this.tipo = tipo;
		this.pelagem = pelagem;
		this.funcionario = funcionario;
	}

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

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public Timestamp getEntrada() {
		return entrada;
	}

	public void setEntrada(Timestamp entrada) {
		this.entrada = entrada;
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

	public Set<ImagemAnimal> getImagens() {
		return imagens;
	}

	public void setImagens(Set<ImagemAnimal> imagens) {
		this.imagens = imagens;
	}

	public Adotante getAdotante() {
		return adotante;
	}

	public void setAdotante(Adotante adotante) {
		this.adotante = adotante;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

}
