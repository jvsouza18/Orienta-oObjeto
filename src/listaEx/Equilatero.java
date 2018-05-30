package listaEx;

public class Equilatero
{
	private double lado;
	private double perimetro;
	private double area;
	
	public double getLado() {
		System.out.println(lado);
		return lado;
	}
	
	public double getPerimetro() {
		return perimetro;
	}

	public double getArea() {
		return area;
	}
	
	public Equilatero(int lado)
	{
		this.lado = lado;
	}
	
	public void calcArea()
	{
		area = lado * (Math.pow(3, 2) / 2);
		System.out.println(area);
		
		
	}
	
	public void calcPerimetro()
	{
		perimetro= 3*lado;
		System.out.println(perimetro);
		
	}

}
