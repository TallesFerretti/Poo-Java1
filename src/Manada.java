import java.util.List;
import java.util.LinkedList;

public abstract class Manada {
	List<Animal> animal = new LinkedList<Animal>();
	public abstract String estorar();
	
	public void adicionarAnimal(Animal n){
		animal.add(n);
	}

}
