
public class ManadaSustenido extends Manada{
	String barulho = "";
	
	@Override
	public String estorar(){
		for(Animal n:animal){
			barulho = barulho + n.fazerBarulho() + "#";
		}
		return barulho;
	}

}
