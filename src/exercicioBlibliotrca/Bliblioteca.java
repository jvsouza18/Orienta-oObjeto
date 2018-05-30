package exercicioBlibliotrca;

import java.util.ArrayList;

public class Bliblioteca {
	
	private String nome;
	private ArrayList<Estante> estantes;
	
	public String getNome() {
		return nome;
	}
	public Bliblioteca(String nome) {
		this.estantes = new ArrayList<>();
		this.nome = nome;
	}
	public ArrayList<Estante> getEstantes() {
		return estantes;
	}

	public void inserirEstante(Estante estante)
	{
		estantes.add(estante);
	}
	
	public Livro[] listarFilosofia()
	{
		ArrayList<Livro> auxLivros = new ArrayList<>(); 
		
		for (Estante estante : estantes) {
			
			if (estante.getCategoria() == Categoria.FILOSOFIA) {
			
				for (Livro livro : estante.getLivros()) {
					auxLivros.add(livro);
				}
			} 			
		}
		return auxLivros.toArray(new Livro[auxLivros.size()]);
	}
	

	public Integer contarCiencia()
	{
		Integer qt = 0;
		
		for (Estante estante : estantes) {

			if (estante.getCategoria() == Categoria.CIENCIA) {
				
				Livro[] livros = estante.getLivros();
				for (int i = 0; i < livros.length; i++) {
					Livro livro = livros[i];
					qt++;
				}
				
			} 			
		}
		return qt;
		
	}
	
	public void listarTudo()
	{
		for (Estante estante : estantes) {
		
			for (Livro livro : estante.getLivros()) {
				
				livro.mostrarLivro();
			}
		}
	}
	
	public ArrayList<String> listarAutores(Categoria cat)
	{
		ArrayList<String> autores = new ArrayList<>();
		for (Estante estante : estantes) {

			if (estante.getCategoria() == cat) {
				
				for(Livro livro: estante.getLivros())
				{
					autores.add(livro.getAutor());
				}
				
			} 			
		}
		return autores;
		
	}
	
	public ArrayList<Livro> listarLivrosPorCategoria(Categoria cat)
	{
		ArrayList<Livro> livroAux = new ArrayList<>();
		for (Estante estante : estantes) {

			if (estante.getCategoria() == cat) {
				
				for(Livro livro: estante.getLivros())
				{
					livroAux.add(livro);
				}
				
			} 			
		}
		return livroAux;
		
	}

}
