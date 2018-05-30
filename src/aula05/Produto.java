package aula05;

public class Produto {
	
	private int qtEstoque, qtVendido;
	private double preco;
	private static int qtTotalVendas;
	
	public Produto(int qtEstoque, double preco)
	{
		this.qtEstoque = Math.max(1,qtEstoque);
		this.preco = Math.max(1, preco);
		this.qtVendido = 0;
		
	}
	public void vender(int qt)
	{
		int quantidade = Math.max(0, qt);
		if (quantidade <=  qtEstoque) {
			
			qtEstoque -= quantidade;
			qtVendido += quantidade;
			qtTotalVendas += quantidade;
		}
		
	}
	
	public static int getQtTotalVendas() {
		return qtTotalVendas;
	}
	public void comprar(int quantidade)
	{
		qtEstoque += Math.max(0, quantidade);
	}
	
	public double calcularFaturamento()
	{
		return qtVendido*preco;
	}
	
	public void aumentarPreco(double pct)
	{
		preco = Math.max(preco,(1+pct)*preco); 
	}
	
	public void diminuirPreco(double pct)
	{
		preco = Math.min(preco, (1-pct)*preco); 
	}

	
}
