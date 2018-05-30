package aula;

public class Contador {
	private int numero;
	public static int quantidadeContadores;
	
	public Contador(int numero)
	{
		this.numero = numero;
	}
	
	public Contador()
	{
		quantidadeContadores++;
	}
	

	public void mostrar()
	{
		System.out.println(numero);
		
	}
	
	public void incrementar()
	{
		numero++;
	}
	
	public void zerar()
	{
		numero = 0;
		
	}
	
	


}
