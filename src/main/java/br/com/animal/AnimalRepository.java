package br.com.animal;

import java.util.List;

public interface AnimalRepository {
	
	public Animal consultaAnimal(int id_animal);
	
	public List<Animal> listaAnimais();
	
	public List<Animal> animaisDisponivel();
	
	public void cadastrarAnimal(Animal animal);
	
	public void excluirAnimal(int id_animal);
	
	public void alterarAnimal(Animal animal);
	
}
