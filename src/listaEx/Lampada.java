	/*
	 * Implemente uma classe L�mpada. Toda l�mpada possui um estado (on/off). 
	 * Sabe-se que as l�mpadas podem ter seu estado trocado (click do interruptor).
	 *  Ser� necess�rio tamb�m uma funcionalidade para checar o estado atual da l�mpada.
	 *   Uma l�mpada estraga ap�s uma quantidade de clicks 
	 *   (o click n�o troca mais o estado deixando-a eternamente em off) 
	 *   e esta depende da l�mpada. Implemente esta situa��o e seu teste.
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
			System.out.println("A lampada j� est� ligada");
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
			System.out.println("A Lampada j� est� desligada");
		}
		
		 
	}
	public int getLimiteClick() {
		return limiteClick;
	}
	public void setLimiteClick(int limiteClick) {
		this.limiteClick = limiteClick;
	}
	
	


}
