package aula;

import java.util.Scanner;

public class TesteCalculadora {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double x = s.nextDouble();
		System.out.println("Digite outro número: ");
		double y = s.nextDouble();
		
		Calculadora c =  new Calculadora();
		System.out.println(c.somar(x, y));
		System.out.println(c.dividir(x, y));
		System.out.println(c.multiplicar(x, y));
		System.out.println(c.subtrair(x, y));
		s.close();
	}

}
