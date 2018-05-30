/*
Exercício 1.1. Dada a classe Pessoa, que possui os atributos: String

nome, String sexo, int idade, boolean vegetariana. Faça agora uma
classe Churrasco que possua:
Atributos: qtdCarne(double);
Método: verificarConsumo(): Recebe via parâmetro uma Pessoa, e com
isto define a consumação média de carne(quantidade de carne consumida), pessoas de 0 a 3 anos não consomem, vegetarianos também não.
Pessoas de 4 a 12 anos consomem 1 kilo de carne e de 13 anos em diante 2 kilos de carne.

Main()
Pessoa p = new Pessoa();
		p.setNome("joão");
		p.setIdade(4);
		p.setVegetariana(true);
		p.setSexo("m");
		
		Churrasco c = new Churrasco();
		c.verificarConsumo(p);
		c.getQtdCarne();
		
		

*/
/*
 * Ex2 
 * Implemente uma classe Lâmpada. Toda lâmpada possui um estado (on/off). 
 * Sabe-se que as lâmpadas podem ter seu estado trocado (click do interruptor).
 *  Será necessário também uma funcionalidade para checar o estado atual da lâmpada.
 *   Uma lâmpada estraga após uma quantidade de clicks 
 *   (o click não troca mais o estado deixando-a eternamente em off) 
 *   e esta depende da lâmpada. Implemente esta situação e seu teste.
 *   
 *   Lampada l = new Lampada();

l.setLimiteClick(8);
l.ligar();
l.desligar();
l.desligar();
l.ligar();
l.ligar();
l.desligar();
l.ligar();
l.desligar();
l.ligar();
l.desligar();
l.ligar();
l.desligar();
l.ligar();
l.isEstado();
 */
/*
 *Implemente uma classe que modele um triangulo equilátero(lados iguais)
Atributos: lado, perímetro, área.
Métodos: calcArea(), calcPerímeto() e seus gets. O lado deverá ser
o único atributo inicializado via construtor.
Fórmulas:
Área = lado * p3
2
Perímetro= 3*lado

	Equilatero e = new Equilatero(8);
		e.getLado();
		e.calcArea();
		e.calcPerimetro();
 */
/*
 * Implemente uma classe que modele um jogo de advinhação de números de 0 a 99.
 *  O jogo deve possuir um método para sortear e outro que simule a advinhação.
 	
 	JogoAdivinhacao jogo = new JogoAdivinhacao();
		jogo.sortear();
		jogo.getNumeroSorteado();
		jogo.adivinhar(jogo.getNumeroSorteado());
 */
/*
 * Implemente a classe Porta que possua:
• Atributos: isOpen(boolean), numAberturas(int);
• Métodos: abrir(): abre a porta e conta 1 na contagem de aberturas;
• fechar(): fecha a porta. OBS: O atributo numAberturas deve
contar o total de aberturas de todas as portas possíveis.

	public static void main(String[] args)
	{	
		Porta porta1 = new Porta();
		porta1.abrir();
		porta1.fechar();
		porta1.abrir();
		porta1.fechar();
		Porta.getNumAberturas();
		Porta porta2 = new Porta();
		porta2.abrir();
		porta2.fechar();
		porta2.abrir();
		porta2.fechar();
		porta1.abrir();
		porta1.fechar();
		Porta.getNumAberturas();
		
	}
 */
package listaEx;

public class Teste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("karla");
		p.setIdade(4);
		p.setVegetariana(false);
		p.setSexo("f");
		
		Pessoa a = new Pessoa();
		p.setNome("joão");
		p.setIdade(6);
		p.setVegetariana(false);
		p.setSexo("m");
		
		Pessoa s = new Pessoa();
		p.setNome("joana");
		p.setIdade(14);
		p.setVegetariana(false);
		p.setSexo("m");
		
		Churrasco c = new Churrasco();
		c.verificarConsumo(p);
		c.verificarConsumo(a);
		c.verificarConsumo(s);
		


		System.out.println(c.getQtdCarne());
	}

}
