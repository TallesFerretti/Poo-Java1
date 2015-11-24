
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
	Gato gato1 = new Gato("Cat","Persa", 15, 25);
	Gato gato2 = new Gato("Tom","Siamês", 10, 20);
	Gato gato3 = new Gato("Bilu","Sphynx", 20, 15);
	Cachorro cachorro1 = new Cachorro("Snoop","Beagle", 25, 10);
	Cachorro cachorro2 = new Cachorro("Mercury","Pastor Alemão", 40, 12);
	Cachorro cachorro3 = new Cachorro("Freddie","Pug", 20, 2);
		ManadaVirgula manadaVirgula = new ManadaVirgula();
		manadaVirgula.addAnimal(gato1);
		manadaVirgula.addAnimal(cachorro1);
		manadaVirgula.addAnimal(cachorro3);
		
		ManadaSustenido manadaSustenido = new ManadaSustenido();
		manadaSustenido.addAnimal(gato2);
		manadaSustenido.addAnimal(gato3);
		manadaSustenido.addAnimal(cachorro2);
		Collections.sort(manadaSustenido.animais);
		for(Animal a : manadaSustenido.animais)
		{
			System.out.println(a+"\n");
		}
		
		CompararNome nms = new CompararNome();
		Collections.sort(manadaSustenido.animais,nms);
		for(Animal a: manadaSustenido.animais)
		{
			System.out.println(a+"\n");
		}
		
		System.out.println(manadaVirgula.estourar());
		System.out.println(manadaSustenido.estourar());
	}

}
