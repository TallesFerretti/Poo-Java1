
public class Gato extends Animal {
	
	public Gato(String nome,String raca, double peso, double idade) {
		super(nome, raca, peso, idade);
	}
	

	@Override
	public String fazerBarulho() {
		return "Miau";
	}
}
