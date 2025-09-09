package EstruturaRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class Repeticao {
	
	/**
	 * Lista de tarefas
	 * 
	 * 1 Criar um ArrayList com as tarefas
	 * 2 Enquanto slecionar s adicionar as tarefas 
	 * 3 Se selecionar n para a aplicação
	 * 4 Para cada tarefa adicionada imprimir na tela
	 * 
	 * Por se tratar de um classe o String tem que usar equals
	 * Necessário usar um leitor do teclado, nesse casso o Scanner
	 * 
	 */
	
	public static void main(String[] args) {
		
		ArrayList<String> tarefas = new ArrayList<String>();
		String adicionarTarefa = "s";
		
		Scanner scanner = new Scanner(System.in);
		
		while(adicionarTarefa.equals("s")) {
			System.out.println("Tarefa:");
			String tarefa = scanner.nextLine();
			tarefas.add(tarefa);
			
			System.out.println("Nova tarefa? (s ou n)");
			adicionarTarefa = scanner.nextLine();
			
		}
		
		scanner.close();
		
		for(int i = 0; i < tarefas.size(); i++) {
			System.out.println("[ ] " + tarefas.get(i));
		}		
		
	}
	
}