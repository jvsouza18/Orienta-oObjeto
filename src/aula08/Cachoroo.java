package aula08;

public class Cachoroo extends Animal {
	
	private String raca;

	public Cachoroo(String nome, String raca) {
		super(nome);
		this.raca = raca;
	}

	public void latir()
	{
		System.out.println("AUauAUau!");
	}

	@Override
	public String toString() {
		return "Cachoroo [raca=" + raca +  super.toString() + "]";
	}




	
	
	
}
