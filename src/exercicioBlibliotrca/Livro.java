package exercicioBlibliotrca;

public class Livro {

	private String nome;
	private String autor;
	private Integer anoPublicacao;
	
	public Livro(String nome, String autor, Integer anoPublicacao) {

		this.nome = nome;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	public String getNome() {
		return nome;
	}
	public String getAutor() {
		return autor;
	}
	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public void mostrarLivro()
	{
		System.out.println("Nome do Livro: " + nome);
		System.out.println("Autor do Livro: " + autor);
		System.out.println("Ano da Publicação do Livro: " + anoPublicacao);
	
	}

	
	
}
