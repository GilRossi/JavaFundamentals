package video014;

import java.util.ArrayList;
import java.util.Scanner;

class LoopStructure {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> rotina = new ArrayList<String>();
				
		String adicionarRotina = "s";
		
		while (adicionarRotina.equals("s")) {
			System.out.println("Informe a rotina:");			
			
			String novaTarefa = scan.nextLine();
			rotina.add(novaTarefa);
			
			System.out.print("Adicionar nova rotina (s ou n)? ");
			adicionarRotina = scan.nextLine();
			
		}
		
		scan.close();
		
		System.out.println("\nRotinas: ");
		for(int i = 0; i < rotina.size(); i++) {
			System.out.println("[\u2714] " + rotina.get(i));
		}
	}

}
