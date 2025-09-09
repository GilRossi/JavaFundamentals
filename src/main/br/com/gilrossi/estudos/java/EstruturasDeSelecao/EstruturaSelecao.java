package EstruturasDeSelecao;

import java.util.Scanner;

public class EstruturaSelecao {
	public static void main(String[] args) {
		System.out.println("1. Menssagem 1");
		System.out.println("2. Menssagem 2");
		System.out.println("3. Menssagem 3");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha a opção: ");
		int condition = scanner.nextInt();
		scanner.close();
		
//		if (condition == 1) 
//			System.out.println("Menssagem 1");
//		else if (condition == 2)
//			System.out.println("Menssagem 2");
//		else if (condition == 3)
//			System.out.println("Menssagem 3");
//		else
//			System.out.println("Entrada inválida");
		
//		switch (condition) {
//		case 1 -> System.out.println("Oi 1");
//		case 2 -> System.out.println("Oi 2");
//		case 3 -> System.out.println("Oi 3");
//		default -> System.out.println("Invalido");
		
		String menssagem = switch (condition) { 
		case 1 -> "a";
		case 2 -> "b";
		case 3 -> "c";
		default -> "d";
		};
		
		System.out.println(menssagem);
	}
}
