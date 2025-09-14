package video013;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. Opção 1");
		System.out.println("2. Opção 2");
		System.out.println("3. Opção 3");
		System.out.print("Escolha uma opção: ");	
		
		int opcao = scan.nextInt();
		
		String mensagem = switch (opcao) {
		case 1 -> "Escolheu 1!";
		case 2 -> "Escolheu 2!";
		case 3 -> "Escolheu 3!";
		default -> "Opção não suportada, \nSelecione entre: 1, 2 ou 3!";		
		};
		
		System.out.println(mensagem);
		
		scan.close();
		
	}

}
