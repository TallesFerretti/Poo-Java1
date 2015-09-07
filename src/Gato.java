
public class Gato extends Animal{
	public Gato(String r, int i, double p){
		super(r,i,p);
	}
	
	@Override
	public String fazerBarulho(){
		return "miau";
	}

}
