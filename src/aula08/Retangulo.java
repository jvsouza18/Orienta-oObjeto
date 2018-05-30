package aula08;

public class Retangulo extends Quadrilatero {
	
	private double lado2;
	
	public Retangulo(double lado1,double lado2) {
		super(lado1);
		this.lado2 = lado2;
	
	}
	
	public double getLado2() {
		return lado2;
	}
	
	public double calcularAreaRetangulo()
	{
		return getLado1()*getLado2();
	}
	public double calcularPerimetroRetangulo()
	{
		return (getLado1() *2) +  (getLado2() *2);
	}
}
