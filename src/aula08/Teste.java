package aula08;

public class Teste {

	
	public static void mostrar(Object o)
	{
		System.out.println(o);
	}

	
	public static void main(String[] args) {
		/*
		Cachoroo c = new Cachoroo("tequila","labrador");
		Cachoroo c1 = new Cachoroo("whisky","labrador");
		Animal a = new Animal("JOSE");
		Gato g = new Gato("miau");
		c.comer();
		c.dormir();
		c.latir();
		System.out.println(c.toString());
		System.out.println(c1.toString());
		
		if (a instanceof Cachoroo) {
			
			System.out.println("É um cachorro!");
		}
		else
		{
			System.out.println("Não é um cachorro!!");
		}
		*/
		
		Quadrado q = new Quadrado(10);
		Retangulo r = new Retangulo(10, 20);
	
		Teste.mostrar(q.calcularAreaQuadrado());
		Teste.mostrar(q.calcularPerimetroQuadrado());
		Teste.mostrar(r.calcularAreaRetangulo());
		Teste.mostrar(r.calcularPerimetroRetangulo());
		
		
		
		
		
	}
	
	
}
