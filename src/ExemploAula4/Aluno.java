package ExemploAula4;

public class Aluno {

	String nome;
	Endereco endereco;
	Curso curso;
	
	public Aluno(String nome, Endereco endereco, Curso curso) {
		this.nome = nome;
		this.endereco = endereco;
		this.curso = curso;
	}
	
	public void mostrarAluno()
	{
		 System.out.println("Nome: " + nome);
		 System.out.println("Curso: " + curso );
		 endereco.mostrar();
	}
	
}
