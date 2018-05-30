package aula10;

import java.util.ArrayList;

public class Zoo {

	private ArrayList<Animal> jaula;

	public Zoo() {
	
		this.jaula = new ArrayList<>();
	}
	
	public void AdicionarAnimal(Animal a)
	{
		jaula.add(a);
	}
	
	public void todosEmitemSom()
	{
		
		jaula.forEach((animal)->animal.emitirSom());

	}
	
	public void todosArranham()
	{
		//jaula.forEach((a)-> {if(a instanceof Gato)((Gato)a).arranhar()});
	}
}
