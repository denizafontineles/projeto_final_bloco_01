package breeze;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import breeze.controller.BreezeController;
import breeze.model.Breeze;
import breeze.model.Cabelo;
import breeze.model.Corpo;
import breeze.model.Rosto;

public class Menu {

	public static void main(String[] args) {
		
		BreezeController produtos = new BreezeController();
		
		Scanner read = new Scanner(System.in);
		
		int op, codigo, categoria;
		String nome, utilidade, marca, cor;
		float  valor;
		
		Breeze pr1 = new Rosto(1, 1, "Sérum Hialurônicos", "Firmeza e Elasticidade", "Principia", 30.0f);
		pr1.visualizar();
		Breeze pr2 = new Corpo(2, 2, "Óleos de Amêndoas", "Hidratação 24hs", "Nivea", 30.0f);
		pr2.visualizar();
		Breeze pr3 = new Cabelo(3, 3, "Royal Fashion", "Acobreado", "Retenção da cor e Brilho", "Igora", 30.0f);
		pr3.visualizar();
		
		while(true) {
			
			System.out.println("\n*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            WELCOME THE BREEZE STORE                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1- Adicionar produtos                    ");
			System.out.println("            2- Listar todos os produtos              ");
			System.out.println("            3- Buscar produto por código             ");
			System.out.println("            4- Atualizar dados do produtos           ");
			System.out.println("            5- Deletar produto                       ");
			System.out.println("            6- Sair                                  ");
			System.out.println("                                                     ");
			
			System.out.print("Entre com a opção desejada: ");
			
			try {
				op = read.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				read.nextLine();
				op = 0;
			}
			
			if (op == 6) {
				System.out.println("\nAgradecemos por escolher a Breeze, volte sempre!");
				System.out.println("\nBREEZE- A Fragrância da Brisa em Você.");
				System.exit(0);
			}
			switch(op) {
				case 1 -> {
					System.out.println("\n            Opção selecionada: 1- Adicionar produto\n");
					
					do {
						System.out.print("Digite a categoria do produto (1)Rosto | (2) Corpo | (3) Cabelo : ");
						categoria = read.nextInt();
					}while(categoria < 1 && categoria > 3);

					System.out.print("Digite o nome do produto: ");
					read.skip("\\R?");
					nome = read.nextLine();
					
					System.out.print("Digite a indicação para utilização do produto: ");
					utilidade = read.nextLine();
					
					System.out.print("Digite a marca do produto: ");
					marca = read.nextLine();
					
					System.out.print("Digite o preço do produto (R$): ");
					valor = read.nextFloat();

					switch(categoria) {
						case 1 -> {
							produtos.cadastrar(new Rosto(produtos.gerarCodigo(), categoria, nome, utilidade, marca, valor));
						}
						case 2 -> {
							produtos.cadastrar(new Corpo(produtos.gerarCodigo(), categoria, nome, utilidade, marca, valor));
						}
						case 3 -> {
							System.out.print("Digite a cor que você deseja:  ");
							read.skip("\\R?");
							cor = read.nextLine();
							produtos.cadastrar(new Cabelo(produtos.gerarCodigo(), categoria, nome, cor, utilidade, marca, valor));
						}
						default -> {
							System.out.println("Categoria informada está inválida!");
						}
					}
				keyPress();
				}
				case 2 -> {
					System.out.println("\n            Opção selecionada: 2- Listar todos os produtos\n");
					produtos.listarTodos();
				keyPress();
				}
				case 3 -> {
					System.out.println("\n            Opção selecionada: 3- Buscar produto por código\n");
					System.out.println("Digite o código do produto: ");
					codigo = read.nextInt();
					
					produtos.procurarPorCodigo(codigo);
				keyPress();
				}
				case 4 -> {
					System.out.println("\n            Opção selecionada: 4- Atualizar dados do produtos\n");
					
					System.out.println("Digite o código do produto para atualizar: ");
					codigo = read.nextInt();
					
					var buscarProduto = produtos.buscarNaCollection(codigo);
										
					if(buscarProduto != null) {

						System.out.print("Digite o nome do produto: ");
						read.skip("\\R?");
						nome = read.nextLine();
						
						System.out.print("Digite a indicação para utilização do produto: ");
						utilidade = read.nextLine();
						
						System.out.print("Digite a marca do produto: ");
						marca = read.nextLine();
						
						System.out.print("Digite o preço do produto (R$): ");
						valor = read.nextFloat();
						
						categoria = buscarProduto.getCategoria();

						switch(categoria) {
							case 1 -> {
								produtos.atualizar(new Rosto(codigo, categoria, nome, utilidade, marca, valor));
							}
							case 2 -> {
								produtos.atualizar(new Corpo(codigo, categoria, nome, utilidade, marca, valor));
							}
							case 3 -> {
								System.out.print("Digite a cor que você deseja:  ");
								read.skip("\\R?");
								cor = read.nextLine();
								produtos.atualizar(new Cabelo(codigo, categoria, nome, cor, utilidade, marca, valor));
							}
						}
					}
					
					keyPress();
				}
				case 5 -> {
					System.out.println("\n            Opção selecionada: 5- Deletar produto\n");
					System.out.println("Digite o código do produto para deletar: ");
					codigo = read.nextInt();
					
					produtos.deletar(codigo);

					keyPress();
				}
				case 6 -> {
					System.out.println("\n            Opção selecionada: 6- Sair\n");
					keyPress();
				}
				default -> {
					System.out.println("\nOpção Inválida!\n");
					keyPress();
				}
			}
		}
	}
	public static void keyPress(){
		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
