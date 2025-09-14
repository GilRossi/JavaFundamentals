package video013;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		System.out.println("1. Opção 1");
		System.out.println("2. Opção 2");
		System.out.println("3. Opção 3");
		System.out.print("Digite a opção desejada: ");
		
		Scanner scan = new Scanner(System.in);
		
		int opcao = scan.nextInt();
		
		scan.close();
		
		if(opcao == 1)
			System.out.println("Opção 1 selecionada!");
		else if(opcao == 2)
			System.out.println("Opção 2 selecionada!");
		else if(opcao == 3)
			System.out.println("Opção 3 selecionada!");
		else
			System.err.println("Opção não suportada! \nSelecione as opções: 1, 2 ou 3");
	}
	

}
