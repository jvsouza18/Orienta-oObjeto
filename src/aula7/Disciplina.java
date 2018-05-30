package aula7;

public class Disciplina {
	
	private String nome;
	private Aluno[] alunos;
	private static int qtAlunos;
	
	
	public Disciplina(String nome,int maxAluno) {
		this.nome = nome;
		this.alunos = new Aluno[maxAluno];
		
	}
	
	public void matricularAluno(Aluno a)
	{
		alunos[qtAlunos] =  a;
		qtAlunos++;
		
	}

	public String getNome() {
		return nome;
	}

	public static int getQtAlunos() {
		return qtAlunos;
	}
	
	public void mostrarAlunos()
	{
		for (int i = 0; i < qtAlunos; i++) {
			
			alunos[i].mostrarInfo();
		}
	}
	
	public void removerUltimo()
	{
		alunos[--qtAlunos] = null;
	}
	

}
