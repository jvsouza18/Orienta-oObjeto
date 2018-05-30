package aula10;

public class FinalDeSemana extends Promocao {

	public FinalDeSemana(String descricao) {
		super(descricao);

	}
	
	public double desconto(double valor)
	{
		if(valor > 100)
		{
			return 0.95;
		}
		else
		{
			return 1;
		}
	}

	
}
