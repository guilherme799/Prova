import java.util.Scanner;


public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String rg = "", aux = "";
		System.out.println("RG:");
		rg = scan.nextLine();
		aux += rg.substring(0, 2).toUpperCase() + ": ";
		for(int i = 2; i < rg.length(); i++){
			if(i == 2){
				aux += rg.substring(i, i+1) + ".";
			}
			else if(i == 4){
				aux += rg.substring(i, i+1) + ".";
			}
			else if(i == 7){
				aux += rg.substring(i, i+1) + "/";
			}
			else{
				aux += rg.substring(i, i+1);
			}
		}
		
		System.out.println(aux);
	}

}
