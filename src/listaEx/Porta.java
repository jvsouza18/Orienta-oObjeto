package listaEx;

public class Porta {
	
	private boolean isOpen;
	private static int numAberturas;
	
	public Porta()
	{
		isOpen = false;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public static int getNumAberturas() {
		System.out.println(numAberturas);
		return numAberturas;
	}

	
	
	public void abrir()
	{
		isOpen = true;
		System.out.println("Porta Aberta!");
		numAberturas++;
		
	}
	
	public void fechar()
	{
		isOpen = false;
		System.out.println("Porta Fechada!");
	}
	
	
}
