package aula08;

public class Quadrado extends Quadrilatero {
	

	public Quadrado(double lado1) {
		super(lado1);

	}

	public double calcularPerimetroQuadrado()
	{
		return getLado1()*4;
	}
	
	public double calcularAreaQuadrado()
	{
		return getLado1()*getLado1();
	}
	
}
