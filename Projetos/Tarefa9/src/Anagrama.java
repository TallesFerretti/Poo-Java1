import java.util.HashMap;
import java.util.Map;

public class Anagrama {
	public Anagrama(){
		super();
	}
	
	public static void testeAnagrama(String pala1, String pala2){
		pala1 = pala1.replace(" ","");
		pala1 = pala1.toLowerCase();
		pala2 = pala2.replace(" ","");
		pala2 = pala2.toLowerCase();
		if(pala1.length() != pala2.length()){
			System.out.println("Não é Anagrama");
		}
		else{
			Map<Character, Integer> teste1 = new HashMap<Character, Integer>();
			Map<Character, Integer> teste2 = new HashMap<Character, Integer>();
			
			
			for(int i = 0; i < pala1.length(); i++){
				char letra = pala1.charAt(i);
				if(teste1.get(letra) == null){
					teste1.put(letra, 1);
				}
				else{
					teste1.put(letra, Integer.valueOf(teste1.get(letra).intValue()) + 1);
				}
			}
			for(int i = 0; i < pala2.length(); i++){
				char letra = pala2.charAt(i);
				if(teste2.get(letra) == null){
					teste2.put(letra, 1);
				}
				else{
					teste2.put(letra, Integer.valueOf(teste2.get(letra).intValue()) + 1);
				}
			}
			if(teste1.entrySet().equals(teste2.entrySet())){
				System.out.println("É Anagrama");
			}
			else{
				System.out.println("Não é Anagrama");
			}
		}
	}
	
	

}
