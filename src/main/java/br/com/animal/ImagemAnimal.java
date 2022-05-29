package br.com.animal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ImagemAnimal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_imagem;
	
	private String url;
	
	@ManyToOne
	@JoinColumn(name = "id_animal")
	private Animal animal;
	
	public ImagemAnimal() {}
	
	public ImagemAnimal(String url, Animal animal) {
		super();
		this.url = url;
		this.animal = animal;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Animal getAnimal() {
		return animal;
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public int getId_imagem() {
		return id_imagem;
	}

	public void setId_imagem(int id_imagem) {
		this.id_imagem = id_imagem;
	}
	
}
