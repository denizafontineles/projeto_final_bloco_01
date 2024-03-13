package breeze.repository;

import breeze.model.Breeze;

public interface BreezeRepository {
	
	// CRUD dos produtos
	public void cadastrar(Breeze produto);
	public void listarTodos();
	public void procurarPorCodigo(int codigo);
	public void atualizar(Breeze produto);
	public void deletar(int codigo);
}
