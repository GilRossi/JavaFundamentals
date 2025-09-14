package video012;

import java.io.Console;
import java.util.Scanner;

public class InteracoesUsuario {
	public static void main(String[] args) {
		/*
		 * Usando o args dentro dos argumetnos da IDE
		 */
		
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " " + args[3]);
		
		/*
		 * Utilização do Scanner para varios tipos de variaveis
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("\nDigite algo: ");
		var str = scan.nextLine();
		System.out.println(str);
		scan.close();
		
		/*
		 * Utilização do console com foco em variaveis de textos não funciona no Eclipse
		 */
//		Console con = System.console();
//		System.out.println("Qual é seu anime favorito? ");
//		String name = con.readLine();
//		System.out.println(name);	
		
		
	}

}
