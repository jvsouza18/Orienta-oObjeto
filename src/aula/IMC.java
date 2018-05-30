package aula;

public class IMC {
	
	double peso;
	double altura;
	
	double CalcularIMC()
	{	
		return  peso / (altura*altura);	
	}
	
	void classificacao()
	{
		if(CalcularIMC() < 18)
			System.out.println("Magra");	
		else if(CalcularIMC() < 25)
			System.out.println("Saudavel");
		else
			System.out.println("Sobrepeso");	
	 }
	
	void mostrar()
	{
		System.out.println("IMC: " + CalcularIMC());
	}

}
