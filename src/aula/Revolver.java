package aula;

public class Revolver {
	
	/*
	 Ex1) UM Revolver pode atirar e recarregar, ele só consegue atirar,
	 se houver munição, ele só consegue recarrear, se não extrpolar o número maximo de munição,
	 ele só atira e recarrega uma munição por vez. 
	
	 a) quem é a classe?
	 b) quem são atributos?
	 c) quem são os metodos?
	 d) programe tudo!
	 e) testar!
	 
	  a) Revolver
	  b) munição, número máximo.
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

