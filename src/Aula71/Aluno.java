package Aula71;

public class Aluno {
	
	private String nome;
	private int idade;
	public Aluno(String nome, String ra, int idade) {
		this.nome = nome;
		
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	public void mostrarInfo()
	{
		System.out.println("Nome: " + nome);
		System.out.println("idade: "+ idade);
	}
	


}
