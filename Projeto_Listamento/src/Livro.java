
public class Livro {

	private String isbn;
	private String titulo;
	private int qtdpaginas;
	private String autor;
	
	public Livro(String isbn, String titulo, int qtdpag, String autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.qtdpaginas = qtdpag;
		this.autor = autor;
	 }
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtdpaginas() {
		return qtdpaginas;
	}
	public void setQtdpaginas(int qtdpaginas) {
		this.qtdpaginas = qtdpaginas;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	 
	
}
