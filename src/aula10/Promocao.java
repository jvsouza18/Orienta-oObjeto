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
	 * não sei como calcular descontos de uma promoço genérica
	 * aqui eu dependo das subclasses de promoção
	 */

	public double desconto(double valor) {
		return 1.0;
	}
	
	
}
