package breeze;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int op, codigo;
		String nome, categoria, utilidade, marca;
		float  valor;
		
		while(true) {
			
			System.out.println("\n*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            WELCOME THE BREEZE STORE                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar produtos                   ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Buscar produto por código            ");
			System.out.println("            4 - Atualizar dados do produtos          ");
			System.out.println("            5 - Apagar produto                       ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			
			System.out.print("Entre com a opção desejada: ");
			op = read.nextInt();
			
			if (op == 9) {
				System.out.println("\nBREEZE- A Fragrância da Brisa em Você!");
				System.exit(0);
			}
			switch(op) {
				case 1:
					System.out.println("\n            Opção selecionada: 1 - Adicionar produto\n");
					
					System.out.print("Digite o código do produto: ");
					codigo = read.nextInt();

					System.out.print("Digite o nome do produto: ");
					read.skip("\\R?");
					nome = read.nextLine();
					
					System.out.print("Digite a categoria do produto: ");
					categoria = read.nextLine();
					
					System.out.print("Digite a indicação para utilização do produto: ");
					utilidade = read.nextLine();
					
					System.out.print("Digite a marca do produto: ");
					marca = read.nextLine();
					
					System.out.print("Digite o valor do produto: ");
					valor = read.nextInt();
					
				break;
				case 2:
					System.out.println("Listar todas as Contas\n\n");
				break;
			}
		}

	}

}
