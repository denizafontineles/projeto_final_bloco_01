package breeze.model;

public abstract class Breeze {
	private int codigo;
	private int categoria;
	private String nome;
	private String utilidade;
	private String marca;
	private float valor;
	
	public Breeze(int codigo, int categoria, String nome, String utilidade, String marca, float valor) {
		this.codigo = codigo;
		this.categoria = categoria;
		this.nome = nome;
		this.utilidade = utilidade;
		this.marca = marca;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUtilidade() {
		return utilidade;
	}

	public void setUtilidade(String utilidade) {
		this.utilidade = utilidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		String categoria = "";
		
		switch(this.categoria) {
			case 1 -> {
				categoria = "Rosto";
			}
			case 2 -> {
				categoria = "Corpo";
			}
			case 3 -> {
				categoria = "Cabelo";
			}
			default -> {
				System.out.println("Tipo de categoria inválido!");
			}	
		}
		
		System.out.println("\n*****************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("*****************************************************");
		System.out.println("\nCódigo: " + this.codigo);
		System.out.println("Categoria: " + categoria);
		System.out.println("Nome: " + this.nome);
		System.out.println("Utilização: " + this.utilidade);
		System.out.println("Marca: " + this.marca);
		System.out.println("Preço: " + this.valor);
	}
	
}
