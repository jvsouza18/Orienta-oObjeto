package aula7;

import java.util.ArrayList;

public class Loja {
	private String nome;
	private ArrayList<Produto> produtos;
	
	public Loja(String nome)
	{
		this.nome = nome;
		this.produtos = new ArrayList<Produto>();
	}
	
	public double mediaPreco()
	{
		double soma = 0.0;
		
		for (Produto produto : produtos) {
			soma += produto.getPreco();
		}
		return soma / produtos.size();
	}
	
	public void inserirProduto(Produto produto)
	{
		produtos.add(produto);
	}
	
	public double maiorPreco()
	{
		double maior = produtos.get(0).getPreco();
		for (Produto produto : produtos) {
			maior = Math.max(maior, produto.getPreco());
			
		}
		return maior;
	}
	
}
