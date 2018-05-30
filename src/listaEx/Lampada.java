	/*
	 * Implemente uma classe Lâmpada. Toda lâmpada possui um estado (on/off). 
	 * Sabe-se que as lâmpadas podem ter seu estado trocado (click do interruptor).
	 *  Será necessário também uma funcionalidade para checar o estado atual da lâmpada.
	 *   Uma lâmpada estraga após uma quantidade de clicks 
	 *   (o click não troca mais o estado deixando-a eternamente em off) 
	 *   e esta depende da lâmpada. Implemente esta situação e seu teste.
	 */
	


package listaEx;

public class Lampada 
{
	
	public Lampada()
	{
		qtdClick = 0;
		estado = false;
	}
	
	
	private boolean estado;
	private int qtdClick;
	private int limiteClick;
	
	public boolean Estragou()
	{
		return qtdClick == limiteClick;
	}
	
	public boolean isEstado() {
		System.out.println(estado);
		return estado;
	}
	public int getQtdClick() {
		return qtdClick;
	}

	
	public void ligar()
	{
		if(Estragou())
		{
			estado = false;
			System.out.println("Estragou!");
			
		}
		else if(!estado)
		{
			estado = true;
			System.out.println("Ligado: " + estado);
			qtdClick++;
		}
		else
		{
			System.out.println("A lampada já está ligada");
		}
			
	}
	
	public void desligar()
	{
		if(Estragou())
		{
			estado = false;
			System.out.println("Estragou!");
			
		}
		else if(estado)
		{
			estado = false;
			System.out.println("Desigado: " + estado);
			qtdClick++;
		}
		else
		{
			System.out.println("A Lampada já está desligada");
		}
		
		 
	}
	public int getLimiteClick() {
		return limiteClick;
	}
	public void setLimiteClick(int limiteClick) {
		this.limiteClick = limiteClick;
	}
	
	


}
