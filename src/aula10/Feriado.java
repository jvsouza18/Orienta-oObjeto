package aula10;

public class Feriado extends Promocao {

	public Feriado(String descricao) {
		super(descricao);
		
	}
	@Override
	public double desconto(double valor)
	{
		if(valor==50) return 0.9;
		else return 1;
	}

	

}
