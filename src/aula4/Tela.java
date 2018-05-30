package aula4;

import java.util.Scanner;

public class Tela {
		
		Scanner s;
	
		public Tela()
		{
			s = new Scanner(System.in);
		
		}

		
		public void principal()
		{
			System.out.println("Digite o peso: ");
			double peso = s.nextDouble();
			System.out.println("Digite a altura: ");
			double altura = s.nextDouble();
			IMC imc = new IMC();
			System.out.println("O IMC é: " + imc.calcular(peso, altura));
			imc.classificacao(imc.calcular(peso, altura));
			
		}
		
		public void sair()
		{
			System.out.println("Fim do Programa");
			s.close();
		}
		
		public void menu()
		{
			int opt =0;
			while(opt != 2)
			{
				System.out.println("____PROGRAMA IMC______");
				System.out.println("____1.Calcular________");
				System.out.println("____2.Sair____________");
				System.out.println("Digite a opção: ");
				opt = s.nextInt();
				switch (opt) {
				case 1:
					this.principal();
					break;
				case 2:
					this.sair();
					break;
				default:
					this.erro();
					break;
				}
			}
		}
		
		public void erro()
		{
			System.out.println("Opção Inválida!");
		}
	
	
	

}
