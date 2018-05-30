package Aula71;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Disciplina {

	private String nome;
	private HashMap<String, Aluno> alunos;
	
	public Disciplina(String nome)
	{
		this.nome = nome;
		this.alunos = new HashMap<String,Aluno>();
		
	}
	
	public void matricularAluno(String ra,Aluno a)
	{
		alunos.put(ra, a);
		
	}
	
	public Aluno buscarAlunoRA(String ra)
	{
		return alunos.get(ra);
	}
	
	public void removerAlunoRa(String ra)
	{
		alunos.remove(alunos.get(ra));
	}
	
	public void listarAlunos()
	{
		for (Entry<String, Aluno> reg : alunos.entrySet()) {
			System.out.println(reg.getKey());
			reg.getValue().mostrarInfo();
		}
	}
	
	
	
}
