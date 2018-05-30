package aula7;

public class Produto {
	public Produto(String nome, double preco) {

		this.nome = nome;
		this.preco = preco;
	}
	
	private String nome;
	
	private double preco;
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}

}
