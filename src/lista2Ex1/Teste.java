package lista2Ex1;

public class Teste {

	public static void main(String[] args) {
		
		Partido p = new Partido("Partido dos Trabalhadores","comunista",Sigla.PT,13);
		Candidato c = new Candidato("Lula",p);
		System.out.println(c.toString());
	}

}
