import java.util.ArrayList;
import java.util.List;

public abstract class Manada {
	public List<Animal> animais = new ArrayList<Animal>();
	
	public void addAnimal(Animal animal){		
		animais.add(animal);
	}
	
	public String estourar(){
		String som = "";
		for(Animal a: animais)
			som.concat(a.fazerBarulho());
		return som;
					
	}
}

