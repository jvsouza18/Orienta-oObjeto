package lista2ex4;

public class Teste {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("jamal",1000,5000);
		Cliente c2 = new Cliente("viado",3000,15000);
		Doc d1 = new Doc();
		d1.transferir(c1,c2,200);
		
		System.out.println(c1.getSaldo() + "," +c2.getSaldo());
	}

}
