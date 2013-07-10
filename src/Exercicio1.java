
public class Exercicio1 {
	public static void main(String[] args) {
		String frase = "quando tudo da errado aposte no duvidoso", aux = "";
		
		aux += frase.substring(0, 1).toUpperCase();
		for(int i=1; i<frase.length(); i++){
			if(frase.charAt(i-1) == ' '){
				aux += frase.substring(i, i+1).toUpperCase();
			}
			else{
				aux += frase.substring(i, i+1);
			}
		}
		
		System.out.println(aux);
	}

}
