package aula10;

public class Teste {

	public static void main(String[] args) {
		/*
		 * Zoo zoo = new Zoo();
		Cachorro a = new Cachorro();
		Cachorro b = new Cachorro();
		Cachorro c = new Cachorro();
		Gato z = new Gato();
		Gato x = new Gato();
		Gato y = new Gato();
		
		zoo.AdicionarAnimal(a);
		zoo.AdicionarAnimal(b);
		zoo.AdicionarAnimal(c);
		zoo.AdicionarAnimal(x);
		zoo.AdicionarAnimal(y);
		zoo.AdicionarAnimal(z);
		
		zoo.todosEmitemSom();
		 */
		Produto p = new Produto("livro", 100,new Feriado("Dias das mães"));
		
	System.out.println(p.calcularPreco());	
		
	}
}
