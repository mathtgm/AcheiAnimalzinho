package br.com.funcionario;

import java.util.List;

public interface FuncionarioRepository {
	
	public List<Funcionario> listarFuncionarios();
	
	public Funcionario consultarFuncionario(int id_funcionario);
	
	public void excluirFuncionario(int id_funcionario);
	
	public void cadastrarFunconario(Funcionario funcionario);
	
	public Funcionario autenticarFuncionario(String usuario, String senha);
}
