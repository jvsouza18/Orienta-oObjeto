package aula4;

public class IMC {
	
	public double calcular(double peso, double altura)
	{
		return peso/(altura*altura);
	}
			
	void classificacao(double imc)
	{
		if(imc < 18)
			System.out.println("Magra");	
		else if(imc < 25)
			System.out.println("Saudavel");
		else
			System.out.println("Sobrepeso");	
	 }

}
