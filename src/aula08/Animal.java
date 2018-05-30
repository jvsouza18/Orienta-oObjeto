package aula08;

public class Animal {

	
	private String nome;
	
	public Animal(String nome)
	{
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "[nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void dormir()
	{
		System.out.println("ZZZZZZZZZZzzzzzzz");
	}
	
	public void comer() {
		
		System.out.println("comeu....");

	}
	
}
