
public class Cachorro extends Animal{

	public Cachorro(String nome,String raca, double peso, double idade) {
		super(nome, raca, peso, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fazerBarulho() {
		return"Au Au";
	}
	

}
