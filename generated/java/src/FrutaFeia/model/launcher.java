package FrutaFeia.model;

import java.util.Scanner;

public class launcher {
	private static final String title = "        <<  Fruta Feia  >>";
	private static boolean menuDone = false;
	private static FrutaFeia frutaFeia;

	public static void  viewClients(Scanner scan){
		System.out.println(frutaFeia.getTodosClientes());
		String input = scan.next();
		displayManageClientsMenu(scan);
	}

	public static void addClient(Scanner scan){
		Cliente cliente;

		System.out.println("Nome: ");
		String name = scan.next();
		System.out.println("Género(H/M): ");
		String genre = scan.next();

		if(genre.equals("H"))
			cliente = new Cliente(name, Quotes.HOMEMQuote.getInstance());
		else
			cliente = new Cliente(name, Quotes.MULHERQuote.getInstance());

		frutaFeia.adicionaCliente(cliente, "Porto");

		System.out.println("Cliente "+name+" criado com sucesso!");

		String input = scan.next();
		displayManageClientsMenu(scan);
	}

	// TODO - Terminar
	public static void  removeClient(Scanner scan){
		Cliente cliente;

		System.out.println("Nome: ");
		String name = scan.next();

		cliente = new Cliente(name, Quotes.HOMEMQuote.getInstance());

		frutaFeia.removeCliente(cliente, "Porto");

		System.out.println("Cliente "+name+" removido com sucesso!");

		String input = scan.next();
		displayManageClientsMenu(scan);
	}

	public static void displayManageClientsMenu(Scanner scan){
		System.out.println("\n		<< Menu Admin >>\n");
		System.out.println("		>> 1 - Ver Clientes");
		System.out.println("		>> 2 - Adicionar Cliente");
		System.out.println("		>> 3 - Remover Cliente");
		System.out.println("		>> 4 - Voltar");
		System.out.println("		>> 5 - Sair");
		System.out.println();

		int input = 0;
		menuDone = false;

		while (!menuDone){
			input = getUserInput(scan, 1, 5);
			switch(input){
				case 1:
					menuDone = true;
					viewClients(scan);
					break;
				case 2:
					menuDone = true;
					addClient(scan);
					break;
				case 3:
					menuDone = true;
					removeClient(scan);
					break;
				case 4:
					menuDone = true;
					displayMainMenu(scan);
					break;
				case 5:
					menuDone = true;
					System.out.println("A sair de Fruta Feia..");
					scan.close();
					System.exit(0);
			}
		}
	}

	public static void displayManageAgricultoresMenu(Scanner scan){
		System.out.println("\n		<< Menu Admin >>\n");
		System.out.println("		>> 1 - Gerir Clientes");
		System.out.println("		>> 2 - Gerir Agricultores");
		System.out.println("		>> 3 - Gerir Centros");
		System.out.println("		>> 4 - Voltar");
		System.out.println("		>> 5 - Sair");
		System.out.println();

		int input = 0;
		menuDone = false;

		while (!menuDone){
			input = getUserInput(scan, 1, 5);
			switch(input){
				case 1:
					menuDone = true;
					break;
				case 2:
					menuDone = true;
					break;
				case 3:
					menuDone = true;
					break;
				case 4:
					menuDone = true;
					displayMainMenu(scan);
					break;
				case 5:
					menuDone = true;
					System.out.println("A sair de Fruta Feia..");
					scan.close();
					System.exit(0);
			}
		}
	}

	public static void displayManageCentrosMenu(Scanner scan){
		System.out.println("\n		<< Menu Admin >>\n");
		System.out.println("		>> 1 - Ver Centros");
		System.out.println("		>> 2 - Adicionar Centro");
		System.out.println("		>> 3 - Remover Centro");
		System.out.println("		>> 4 - Voltar");
		System.out.println("		>> 5 - Sair");
		System.out.println();

		int input = 0;
		menuDone = false;

		while (!menuDone){
			input = getUserInput(scan, 1, 5);
			switch(input){
				case 1:
					menuDone = true;
					break;
				case 2:
					menuDone = true;
					break;
				case 3:
					menuDone = true;
					break;
				case 4:
					menuDone = true;
					displayMainMenu(scan);
					break;
				case 5:
					menuDone = true;
					System.out.println("A sair de Fruta Feia..");
					scan.close();
					System.exit(0);
			}
		}
	}

	public static void createCestas(Scanner scan){

	}

	/**
	 * Displays the Admin Menu
	 */
	public static void displayAdminMenu(Scanner scan){
		System.out.println("\n		<< Menu Admin >>\n");
		System.out.println("		>> 1 - Gerar Cestas");
		System.out.println("		>> 2 - Gerir Clientes");
		System.out.println("		>> 3 - Gerir Agricultores");
		System.out.println("		>> 4 - Gerir Centros");
		System.out.println("		>> 5 - Voltar");
		System.out.println("		>> 6 - Sair");
		System.out.println();

		int input = 0;
		menuDone = false;

		while (!menuDone){
			input = getUserInput(scan, 1, 6);
			switch(input){
				case 1:
					menuDone = true;
					createCestas(scan);
					break;
				case 2:
					menuDone = true;
					displayManageClientsMenu(scan);
					break;
				case 3:
					menuDone = true;
					displayManageAgricultoresMenu(scan);
					break;
				case 4:
					menuDone = true;
					displayManageCentrosMenu(scan);
					break;
				case 5:
					menuDone = true;
					displayMainMenu(scan);
					break;
				case 6:
					menuDone = true;
					System.out.println("A sair de Fruta Feia..");
					scan.close();
					System.exit(0);
			}
		}
	}

	/**
	 * Displays the Client menu
	 */
	public static void displayClientMenu(Scanner scan){
		System.out.println("\n		<< Menu Cliente >>\n");
		System.out.println("		>> 1 - Fazer encomenda");
		System.out.println("		>> 2 - Alterar cesta");
		System.out.println("		>> 3 - Levantar cesta");
		System.out.println("		>> 4 - Voltar");
		System.out.println("		>> 5 - Sair");
		System.out.println();

		int input = 0;
		menuDone = false;

		while (!menuDone){
			input = getUserInput(scan, 1, 4);
			switch(input){
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					menuDone = true;
					System.out.println("A sair de Fruta Feia..");
					scan.close();
					System.exit(0);
			}
		}
	}

	/**
	 * Displays the Agricultor menu
	 */
	public static void displayAgricultorMenu(Scanner scan){
		System.out.println("\n		<< Menu Agricultor >>\n");
		System.out.println("		>> 1 - Ver produtos ");
		System.out.println("		>> 2 - Adicionar produto");
		System.out.println("		>> 3 - Remover produto");
		System.out.println("		>> 4 - Sair");
		System.out.println();

		int input = 0;
		menuDone = false;

		while (!menuDone){
			input = getUserInput(scan, 1, 4);
			switch(input){
				case 1:
					menuDone = true;
					break;
				case 2:
					menuDone = true;
					displayClientMenu(scan);
					break;
				case 3:
					menuDone = true;
					displayAgricultorMenu(scan);
					break;
				case 4:
					menuDone = true;
					System.out.println("A sair de Fruta Feia..");
					scan.close();
					System.exit(0);
			}
		}
	}

	/**
	 * Displays the Main Menu
	 */
	public static void displayMainMenu(Scanner scan){
		System.out.println("\n		<< Menu Inicial >>\n");
		System.out.println("		>> 1 - Menu Admin");
		System.out.println("		>> 2 - Menu Cliente ");
		System.out.println("		>> 3 - Menu Agricultor");
		System.out.println("		>> 4 - Sair");
		System.out.println();

		int input = 0;
		menuDone = false;

		while (!menuDone){
			input = getUserInput(scan, 1, 4);
			switch(input){
				case 1:
					menuDone = true;
					displayAdminMenu(scan);
					break;
				case 2:
					menuDone = true;
					displayClientMenu(scan);
					break;
				case 3:
					menuDone = true;
					displayAgricultorMenu(scan);
					break;
				case 4:
					menuDone = true;
					System.out.println("A sair de Fruta Feia..");
					scan.close();
					System.exit(0);
					break;
			}
		}
	}

	/**
	 * Reads the user input
	 *
	 * @param scan to be used to get input from user
	 * @param min value
	 * @param max value
	 * @return user input
	 */
	public static int getUserInput(Scanner scan, int min, int max){
		int input = 0;

		do {
			try{
				input = scan.nextInt();
				if (input < min || input > max)
					throw new IllegalArgumentException();
			}

			catch(Exception e) {
				scan.nextLine();
				System.err.println("\nERROR:: Opção inválida! Por favor tente novamente!\n");
			}
		} while (input < min || input > max);

		scan.nextLine();

		return input;
	}

	public static void initializeFrutaFeia(){
		// Fruta Feia
		frutaFeia = new FrutaFeia();

		// Centros de Distribuição
		CentroDistribuicao centro1 = new CentroDistribuicao("Porto");
		CentroDistribuicao centro2 = new CentroDistribuicao("Braga");
		CentroDistribuicao centro3 = new CentroDistribuicao("Lisboa");

		frutaFeia.adicionaCentro(centro1);
		frutaFeia.adicionaCentro(centro2);
		frutaFeia.adicionaCentro(centro3);

		// Agricultores
		Agricultor agricultor1 = new Agricultor("João", "Mirandela");
		Agricultor agricultor2 = new Agricultor("Rodrigo", "Aveiro");
		Agricultor agricultor3 = new Agricultor("Eva", "Évora");

		frutaFeia.adicionaAgricultor(agricultor1);
		frutaFeia.adicionaAgricultor(agricultor2);
		frutaFeia.adicionaAgricultor(agricultor3);

		// Produtos
		Produto produto1 = new Produto("Maca", "Golden", 10);
		Produto produto2 = new Produto("Pera", "Rocha", 10);
		Produto produto3 = new Produto("Batata", "Nacional", 10);
		Produto produto4 = new Produto("Couve", "Nacional", 10);
		Produto produto5 = new Produto("Bróculo", "Nacional", 10);
		Produto produto6 = new Produto("Nabo", "Nacional", 10);
		Produto produto7 = new Produto("Laranga", "Nacional", 10);
		Produto produto8 = new Produto("Espinafre", "Nacionl", 10);

		// Clientes
		Cliente cliente1 = new Cliente("Pedro", Quotes.HOMEMQuote.getInstance());
		Cliente cliente2 = new Cliente("Manuel", Quotes.HOMEMQuote.getInstance());
		Cliente cliente3 = new Cliente("Carlos", Quotes.HOMEMQuote.getInstance());

		frutaFeia.adicionaCliente(cliente1, "Porto");
		frutaFeia.adicionaCliente(cliente2, "Porto");
		frutaFeia.adicionaCliente(cliente3, "Porto");

	}

	public static void main (String[] args) {

		initializeFrutaFeia();

		Scanner scan = new Scanner(System.in);
		int input = 0;
		System.out.println(title);

		displayMainMenu(scan);
	}
}
