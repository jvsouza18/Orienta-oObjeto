package exercicioBlibliotrca;

public class Teste {
	
	public static void main(String[] args) {
		
		Bliblioteca b = new Bliblioteca("Fatec");
		Estante e1 = new Estante("e1",Categoria.CIENCIA, 40);
		Estante e2 = new Estante("e2",Categoria.FILOSOFIA, 40);
		Estante e3 = new Estante("e3",Categoria.LITERATURA, 40);

		Livro l1 = new Livro("Percy Jackson e os Olimpianos: O Ladrão de Raios","Rick Riordan",2004);
		Livro l2 = new Livro("Ciência Marinha e o Futuro das Especies","Biologo Jonas",2012);
		Livro l3 = new Livro("Nietzche para Estressados","Nietzche",1992);
		Livro l4 = new Livro("Senhor dos Anéis: Duas Torres","J.R Tolkien",2002);
		Livro l5 = new Livro("Platão e o Mito da Caverna","Aristoteles",500);
		Livro l6 = new Livro("Atlas do Mundo Animal", "Carlos Salgueiro", 2016);
		
		b.inserirEstante(e1);
		b.inserirEstante(e2);
		b.inserirEstante(e3);
		
		e1.inserirLivro(l2);
		e2.inserirLivro(l3);
		e3.inserirLivro(l1);
		e3.inserirLivro(l4);
		e1.inserirLivro(l6);
		e2.inserirLivro(l5);
		
		
		/*
		for (Livro livro : b.listarFilosofia()) {
			livro.mostrarLivro();
		}
		*/
		for (String autor : b.listarAutores(Categoria.FILOSOFIA)) {
			System.out.println(autor);
		}
		
		for (String autor : b.listarAutores(Categoria.CIENCIA)) {
			System.out.println(autor);
		}
		
		
		b.listarTudo();
				
	
		

		
		
		
		
	}

}
