package ExemploAula4;

public class Teste {

	public static void main(String[] args) {
		
		Endereco e = new Endereco("Rua Alagoas", "11040220", "santos", Estado.SP);
		Aluno a = new Aluno("Joaquim", e, Curso.ADS);
		a.mostrarAluno();
	}
	
}
