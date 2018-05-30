package listaEx;
//Ex1
public class Churrasco {
	
	private double qtdCarne;

	public double getQtdCarne() {
		System.out.println(qtdCarne);
		return qtdCarne;
	}
	
	public void verificarConsumo(Pessoa p){
		if(p.getIdade()<=3 || p.isVegetariana()==true)
			qtdCarne += 0; // qtdCarne = qtdCarne + 0;
		else if(p.getIdade()<=12 && p.getIdade()>=4)
			qtdCarne += 1;
		else
			qtdCarne +=2;		
	}


}
