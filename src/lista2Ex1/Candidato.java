package lista2Ex1;

public class Candidato {
	private String nome;
	private Partido partido;
	
	public Candidato(String nome, Partido partido) {
		this.nome = nome;
		this.partido = partido;
	}
	
	public void mudarPartido(Partido partido)
	{
		this.partido = partido;
		mostrarDados();
	}
	
	public void mostrarDados()
	{
		System.out.println(nome);
		System.out.println(partido.getIdeologia());
		System.out.println(partido.getNome());
		System.out.println(partido.getSigla());
		System.out.println(partido.getNumero());
	}
	public void matar()
	{
		System.out.println(nome + " morto!!!!!!!");
		this.nome = null;
		this.partido = null;
	}

	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", partido=" + partido + "]";
	}

}
