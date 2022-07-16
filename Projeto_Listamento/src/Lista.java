
public class Lista {

	private Livro[] vetor = new Livro[100];
	private int posicaoVaga = 0;
	
	public void adicionar(Livro livro) {
		vetor[posicaoVaga] = livro;
		posicaoVaga++;
	} 
	
	public void alterar(int pos, Livro livro) {
		if (pos >= 0 && pos < posicaoVaga) {
			vetor[pos] = livro;
		}
	}

	public void excluir(int posicao){
		
		vetor[posicao] = null;
		
	     for (int i = posicao; i < posicaoVaga -1; i++) {
	    	 
	    	 vetor[i] = vetor [i + 1];
	    	 
			}
	     vetor [posicaoVaga - 1] = null;
		
	     posicaoVaga --;
	}
	
	public int localizarPosicao(String isbn) {
		
		for (int i = 0; i < posicaoVaga; i++) {
			
			if(vetor[0].getIsbn().equals(isbn)) {
				return i;
			}
		}
		return -1;
	}
	
}
