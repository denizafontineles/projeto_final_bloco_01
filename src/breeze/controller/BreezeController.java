package breeze.controller;

import java.util.ArrayList;

import breeze.model.Breeze;
import breeze.repository.BreezeRepository;

public class BreezeController implements BreezeRepository {
	
	private ArrayList<Breeze> listaProdutos = new ArrayList<Breeze>();
	int codigo = 0;

	@Override
	public void cadastrar(Breeze produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto com o código " + produto.getCodigo() + ", foi cadastrado com sucesso!");
	}

	@Override
	public void listarTodos() {
		for (var produto: listaProdutos) {
			produto.visualizar();
		}
	}
	
	@Override
	public void procurarPorCodigo(int codigo) {
		var buscaProduto = buscarNaCollection(codigo);
		
		if(buscaProduto != null)
			buscaProduto.visualizar();
		else 
			System.out.println("\nO produto com o código " + codigo + ", não foi encontrado!");
	}

	@Override
	public void atualizar(Breeze produto) {
		var buscarProduto = buscarNaCollection(produto.getCodigo());
		
		if(buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), produto);
			System.out.println("\nO produto com o código " + produto.getCodigo() + ", foi atualizado com sucesso!" );
		}else {
			System.out.println("\nO produto com o código " + produto.getCodigo() + ", não foi encontrado!" );
		}
	}

	@Override
	public void deletar(int codigo) {
		var buscarProduto = buscarNaCollection(codigo);
		
		if(buscarProduto != null) {
			if(listaProdutos.remove(buscarProduto) == true) {
				System.out.println("\nO produto com o código " + codigo + ", foi deletado com sucesso!");
			}
		}else {
			System.out.println("\nO código do produto " + codigo + ", não foi encontrado!");
		}
	}

	public int gerarCodigo() {
		return ++ codigo;
	}
	
	public Breeze buscarNaCollection(int codigo) {
		for(var buscarCod: listaProdutos) {
			if(buscarCod.getCodigo() == codigo) {
				return buscarCod;
			}
		}
		return null;
	}
}
