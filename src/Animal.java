
public class Animal {
	private String raca;
	private int idade;
	private double peso;
	
	public Animal(String r, int i, double p){
		raca = r;
		idade = i;
		peso = p;
		
	}
	
	public String fazerBarulho(){
		return "O barulho do animal é ";
	}

}
