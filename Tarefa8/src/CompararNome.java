import java.util.Comparator;
public class CompararNome implements Comparator<Animal> {
	//Comparar animais por nome	
		@Override
		public int compare(Animal animal, Animal outroAnimal){
			return animal.getNome().compareTo(outroAnimal.getNome());
		}
}
