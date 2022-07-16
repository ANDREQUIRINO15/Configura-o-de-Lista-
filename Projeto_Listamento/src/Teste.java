
public class Teste {

	public static void main(String[] args) {
		
		Livro livro = new Livro("0000", "Apocalipse",100, "Joao");
		Livro livro1 = new Livro("1111","Atos",99, "Thiago");
		Livro livro2 = new Livro("2222", "lamentacoes",98, "Pedro");
		
		Lista lista = new Lista ();
		lista.adicionar(livro);
		lista.adicionar(livro1);
		lista.adicionar(livro2);
		
		livro.setIsbn("1234");
		lista.alterar(0, livro);
		
		
		lista.excluir(2);

		System.out.println(livro.getAutor());
		
		int posicao = lista.localizarPosicao("");
		
		if(posicao < 0) {
			System.out.println("Livro nao encontrado" + posicao);
		}else {
			System.out.println(posicao);
		}
		

	}

}
