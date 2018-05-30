package listaEx;

import java.util.Random;

public class JogoAdivinhacao {
	
	private int numeroSorteado;
	private int numeroEscolhido;
	
	public void sortear()
	{
		Random random = new Random();
		numeroSorteado = random.nextInt(100);
	}
	
	public void adivinhar(int numeroEscolhido)
	{
		this.numeroEscolhido = numeroEscolhido;
		if(numeroEscolhido == numeroSorteado)
			System.out.println("Você Ganhou!");
		else
			System.out.println("Escolha outro número.");		
	}

	public int getNumeroSorteado() {
		System.out.println("Número Sorteado é: " + numeroSorteado);
		return numeroSorteado;
	}

	public int getNumeroEscolhido() {
		return numeroEscolhido;
	}

}
