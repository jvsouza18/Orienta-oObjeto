package aula10;

public class Promocao {
	
	private String descricao;

	public Promocao(String descricao) {
		
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	/*
	 * n�o sei como calcular descontos de uma promo�o gen�rica
	 * aqui eu dependo das subclasses de promo��o
	 */

	public double desconto(double valor) {
		return 1.0;
	}
	
	
}
