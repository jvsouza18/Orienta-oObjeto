package aula;

public class Calculadora {
	

	
	//O ESTADO INICIAL DA CALCULADORA É Defnido AqUI!!
	//CONSTRUTOR SÒ PODE SER INSTANCIADO 1 VEZ!
	
	
	
	public double somar(double n1, double n2)
	{
		return n1+n2;
	}
	
	public double subtrair(double n1, double n2)
	{
		return n1-n2;
	}
	
	public double dividir(double n1, double n2)
	{
		if(n2 == 0)
		{
			System.out.println("Erro");
			return 0;
		}
		else
		return n1 / n2;
	}
	public double multiplicar(double n1, double n2)
	{
		return n1 * n2;
	}

}
