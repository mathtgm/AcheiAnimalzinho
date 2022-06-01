package br.com.animal;

import java.util.List;

public interface ImagemAnimalRepository {
	
	public List<ImagemAnimal> listaImagens();
	
	public void excluirImagem(int id_imagem);

}
