
public class Main {
	public static void main(String[] args){
		Cachorro c = new Cachorro("Pastor Alemão", 1, 12);
		Gato g = new Gato("Sphinx", 1, 7);
		
		ManadaVirgula mVirgula = new ManadaVirgula();
		ManadaSustenido mSustenido = new ManadaSustenido();
		
		mVirgula.adicionarAnimal(c);
		mSustenido.adicionarAnimal(c);
		
		mVirgula.adicionarAnimal(g);
		mSustenido.adicionarAnimal(g);
		
		System.out.println(mVirgula.estorar());
		System.out.println(mSustenido.estorar());
		
	}
	

}
