package aula10;

public class FimDeAno extends Promocao {
  
	public FimDeAno(String descricao) {
		super(descricao);

	}

	public double desconto(double valor)
	{
		if(valor>20)
		{
			return 0.75;
		}
		else
		{
			return 1.0;
		}
	
	}
	
	 
  }
