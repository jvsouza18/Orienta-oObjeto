package exercicioBlibliotrca;

public class Estante {
	private String nome;
	private Categoria categoria;
	private Livro[] livros;
	private Integer TotalLivros = 0;
	
	public Estante(String nome, Categoria categoria,int tam) {

		this.livros = new Livro[tam];
		this.nome = nome;
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public Livro[] getLivros() {
		return livros;
	}
	
	public void inserirLivro(Livro livro){
		livros[TotalLivros] = livro;
		TotalLivros++;
	}
		
		
	

}
