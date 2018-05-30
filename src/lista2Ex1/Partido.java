package lista2Ex1;

public class Partido {

	private String nome;
	private String ideologia;
	private Sigla sigla;
	private int numero;

	public Partido(String nome, String ideologia, Sigla sigla, int numero) {

		this.nome = nome;
		this.ideologia = ideologia;
		this.sigla = sigla;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public String getIdeologia() {
		return ideologia;
	}

	public Sigla getSigla() {
		return sigla;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Partido [nome=" + nome + ", ideologia=" + ideologia + ", sigla=" + sigla + ", numero=" + numero + "]";
	}
	
	
}
