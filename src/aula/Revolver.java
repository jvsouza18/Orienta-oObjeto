package aula;

public class Revolver {
	
	/*
	 Ex1) UM Revolver pode atirar e recarregar, ele s� consegue atirar,
	 se houver muni��o, ele s� consegue recarrear, se n�o extrpolar o n�mero maximo de muni��o,
	 ele s� atira e recarrega uma muni��o por vez. 
	
	 a) quem � a classe?
	 b) quem s�o atributos?
	 c) quem s�o os metodos?
	 d) programe tudo!
	 e) testar!
	 
	  a) Revolver
	  b) muni��o, n�mero m�ximo.
	  c) atirar, recarregar.

	 */
	
	int municao;
	int numeroMaximo;
	
	void atirar()
	{
		if(municao != 0)
		{
			System.out.println("Bang");
			municao--;
				
		}
		else
		{
			System.out.println("Sem Balas, Recarregue");
		}
		
	}
	
	void recarregar()
	{
		if(municao == numeroMaximo)
		{
			System.out.println("Recarregado Totalmente");
		}
		else
		{
			municao++;
			System.out.println("Recarregou");
		}
		
		
	}
	
	void mostrarMunicao()
	{
		System.out.println(municao);
	}
	

}

