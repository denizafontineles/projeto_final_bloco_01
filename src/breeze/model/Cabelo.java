package breeze.model;

public class Cabelo extends Breeze{
	
	private String cor;

	public Cabelo(int codigo, int categoria, String nome, String cor, String utilidade, String marca, float valor) {
		super(codigo, categoria, nome, utilidade, marca, valor);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Cor desejada: " + this.cor);
	}
	
}
