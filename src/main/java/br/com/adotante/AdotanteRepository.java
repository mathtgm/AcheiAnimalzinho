package br.com.adotante;

import java.util.List;

public interface AdotanteRepository {
	
	public Adotante consultaAdotante(int id_adotante);
	
	public List<Adotante> listaAdotante();
	
	public void cadastrarAdotante(Adotante adotante);
	
	public void excluirAdotante(int id_adotante);
}
