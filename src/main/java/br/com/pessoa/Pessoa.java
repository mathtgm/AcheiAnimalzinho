package br.com.pessoa;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Pessoa {
	
	@Column(length = 80)
	private String nome;
	
	@Column(length = 15)
	private String cpf;
	
	@Column(length = 50)
	private String logadouro;
	
	@Column(length = 8)
	private String numero;
	
	@Column(length = 30)
	private String bairro;
	
	@Column(length = 20)
	private String telefone;
	
	@Column(length = 15)
	private String complemento;
	
	@Column(length = 20)
	private String genero;
	
	private Date dataNasc;
	
	@Column(length = 20)
	private String usuario;
	
	@Column(length = 16)
	private String senha;
		
	public Pessoa() {}

	public Pessoa(String nome, String cpf, String logadouro, String numero, String bairro, String telefone,
			String complemento, String genero, Date dataNasc, String usuario, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.logadouro = logadouro;
		this.numero = numero;
		this.bairro = bairro;
		this.telefone = telefone;
		this.complemento = complemento;
		this.genero = genero;
		this.dataNasc = dataNasc;
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getLogadouro() {
		return logadouro;
	}
	
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
}
