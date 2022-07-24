import java.util.Scanner;

public class Teste_2 {

	public static void main(String[] args) {
		
		Scanner leiaTexto = new Scanner (System.in);
		Scanner leiaNum = new Scanner (System.in);
		Lista bancoDeDados = new Lista();

		System.out.println ("***Escolha a opracao desejada***");
		System.out.println ("1 -- Cadastrar livro");
		System.out.println ("2 -- Alterar livro");
		System.out.println ("3 -- Excluir livro ");
		System.out.println ("4 -- Sair do sistema");
		
		Livro livro = null;
		int pos;
		String isbn,titulo,autor;
		int qtdpag;
		boolean continuar = true;
		int opcao = 0;
		
		opcao = leiaNum.nextInt();
		
		
		while(continuar) {
		
			switch (opcao) {
			 
			case 1:
				
				System.out.println("Digite as caracteristicas do Livro:");
				
				System.out.println("Digite o ISBN:");
				isbn = leiaTexto.nextLine();
				
				System.out.println("Digite o titulo:");
				titulo = leiaTexto.nextLine();
				
				System.out.println("Digite o Autor: ");
				autor = leiaTexto.nextLine();
				
				System.out.println("Digite a Quantidade de paginas:");
				qtdpag = leiaNum.nextInt();
				
				livro = new Livro(isbn, titulo, qtdpag, autor);
				
				bancoDeDados.adicionar(livro);
				
				
				break;
			
			case 2:
				
				System.out.println("Para alterar um livro digite as caracteristicas:");
				
				System.out.println("Digite o ISBN:");
				isbn = leiaTexto.nextLine();
				
				System.out.println("Digite o titulo:");
				titulo = leiaTexto.nextLine();
				
				System.out.println("Digite o Autor: ");
				autor = leiaTexto.nextLine();
				
				System.out.println("Digite a Quantidade de paginas:");
				qtdpag = leiaNum.nextInt();
				
				livro = new Livro(isbn, titulo, qtdpag, autor);
				
				pos = bancoDeDados.localizarPosicao(isbn);
				bancoDeDados.alterar(pos, livro);
				
				
				break;
					
			case 3:
				
				System.out.println("Para excluir um livro digite o seu ISBN:");
				
				System.out.println("Digite o ISBN:");
				isbn = leiaTexto.nextLine();
				
				pos = bancoDeDados.localizarPosicao(isbn);
				bancoDeDados.excluir(pos);
				
				
				
				break;
				
			case 4:
				
				break;
				
			case 9:
				
				continuar = false;
				
				break;
			default: 
				System.out.println("opcao invalida");
			}
		}
     System.out.println("Voce saiu");
	}

}
