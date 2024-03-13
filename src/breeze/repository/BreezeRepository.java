package breeze.repository;

import breeze.model.Breeze;

public interface BreezeRepository {
	
	// CRUD dos produtos
	public void procurarPorCodigo(int codigo);
	public void listarTodos();
	public void cadastrar(Breeze produto);
	public void atualizar(Breeze produto);
	public void deletar(int codigo);
}
