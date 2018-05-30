package aula10;

public class Produto {
	private String nome;
	private double preco;
	private Promocao promocao;
	
	public Produto(String nome, double preco, Promocao promocao) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.setPromocao(promocao);
	}
	public Promocao getPromocao() {
		return promocao;
	}
	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}
	
	public double calcularPreco()
	{
		/*
		 * A vinculação dinâmica vai chamar o calculo de desconto de cordo com o objeto atrelado a variavel promocao do tipo
		 * promocao . o polimofirsmo ajudou com a aberturade outras promocoes a serem atreladas a esse atributo.
		 */
		return preco * promocao.desconto(preco);
	}
	
}
