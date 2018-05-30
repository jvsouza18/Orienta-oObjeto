package aula7;

import java.util.ArrayList;


public class DisciplinaD {
	
	private String nome;
	public String getNome() {
		return nome;
	}

	private ArrayList<Aluno> alunos;
	public DisciplinaD(String nome) {
		this.nome = nome;
	}
	
	public void matricularAlunos(Aluno aluno)
	{	
			if(aluno != null) 
				this.alunos.add(aluno);
		
	}
	
	public void desmatricularAluno(Aluno aluno)
	{
			if(alunos.remove(aluno))
				System.out.println("Aluno removido!");
			else
				System.out.println("Aluno não encontrado...");		
	}
	
	public void desmatricularAluno(int i)
	{
			if(i<0 || i >= alunos.size())
				System.out.println("erro");
			else
				alunos.remove(i);		
	}
	
	public int buscarAluno(Aluno a)
	{
		return alunos.lastIndexOf(a);
	}
	
	public Aluno selecionarAluno(int i)
	{
		return alunos.get(i);
	}
	
	public void mostrarAluno()
	{
		for (Aluno aluno : alunos) {
			aluno.mostrarInfo();
		}
		
	}
	
	
	
}
