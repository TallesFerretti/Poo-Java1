public class Animal implements Comparable<Animal>{
	public String nome;
	public String raca;
	public double peso;
	public double idade;
	public Animal(String nome, String raca, double peso, double idade) {
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		this.idade = idade;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getRaca(){
		return raca;
	}
	
	public void setRaca(String raca){
		this.raca = raca;
	}
	
	public double getPeso(){
		return peso;
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public double getIdade(){
		return idade;
	}
	
	public void setIdade(double idade){
		this.idade = idade;
	}
	
	@Override
	public String toString()
	{
		return "Nome: "+nome +" Raça: "+raca + " Peso: " + peso + " Idade: " + idade;
	}
	
	public String fazerBarulho()
	{
		return "Barulho: ";
	}
	
	//Comparação dos animais por peso
	@Override
	public int compareTo(Animal outroAnimal)
	{
		if(this.peso < outroAnimal.getPeso())
			return -1;
		if(this.peso > outroAnimal.getPeso())
			return 1;
		return 0;
	}
	
}
