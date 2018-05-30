package aula05teste;

import aula05.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Produto produto = new Produto(-9,-9);
		
		produto.comprar(120);
		produto.comprar(20);
		produto.aumentarPreco(0.5);
		produto.vender(60);
		
		
		
		
	}
}
