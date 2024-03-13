package breeze;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int op, codigo;
		String nome, categoria, indicacao, marca;
		float  valor;
		
		while(true) {
			
			System.out.println("\n\n*************************************************");
			System.out.println("                                                     ");
			System.out.println("            BEM-VINDES À LOJA BREEZE                 ");
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
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			op = read.nextInt();
			
			if (op == 9) {
				System.out.println("\nBREEZE- A Frafrância da Brisa em você!");
				System.exit(0);
			}
			switch(op) {
				case 1:
					System.out.println("\nAdicionar produto\n\n");
					
					System.out.println("Digite o código do produto: ");
					codigo = read.nextInt();

					System.out.println("Digite o nome do produto: ");
					read.skip("\\R?");
					nome = read.nextLine();
				break;
				case 2:
					System.out.println("Listar todas as Contas\n\n");
				break;
			}
		}

	}

}