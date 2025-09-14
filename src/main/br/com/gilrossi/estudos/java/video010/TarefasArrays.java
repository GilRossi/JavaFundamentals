package video010;

import java.util.ArrayList;
import java.util.Arrays;

public class TarefasArrays {
	public static void main(String[] args) {
//		String[] tarefas = {"Acordar", "Alongar", "Verificar comida do gato e da cachorra", "Tomar água",
//				"Pegar a coleira da cachorra", "Pegar a sacola para o coco da cachorra", "Esperar a cachorra comer e beber",
//				"Sair para passear com a cachorra", "Passear com a cachorra", "Voltar para casa", "Subir pelas escadas", 
//				"Verificar água e comida do gato e da cachorra",
//				"Tomar café da manhã", "Começar a trabalhar", "Trabalhar", "Almoçar", "Voltar a trabalhar", "Estudar", "Jantar",
//				"Tocar violão", "dormir"};
		
//		System.out.println(tarefas.length);
//		System.out.println(Arrays.toString(tarefas));
		
//		String [] rotina = new String[21];
//		rotina[0] = "Acordar";
//		System.out.println(Arrays.toString(rotina));
		
		ArrayList<String> rotina = new ArrayList<>();
		rotina.add("Acordar");
		rotina.add("Alongar");
		rotina.add("Verificar comida do gato e da cachorra");
		rotina.add("Tomar água");
		rotina.add("Pegar a coleira da cachorra");
		rotina.add("Pegar a sacola para o coco da cachorra");
		rotina.add("Esperar a cachorra comer e beber");
		rotina.add("Sair para passear com a cachorra");
		rotina.add("Passear com a cachorra");
		rotina.add("Voltar para casa");
		rotina.add("Subir pelas escadas");
		rotina.add("Verificar água e comida do gato e da cachorra");
		rotina.add("Tomar café da manhã");
		rotina.add("Começar a trabalhar");
		rotina.add("Trabalhar");
		rotina.add("Almoçar");
		rotina.add("Voltar a trabalhar");
		rotina.add("Estudar");
		rotina.add("Jantar");
		rotina.add("Tocar violão");
		rotina.add("dormir");
		
		System.out.println(rotina);
		System.out.println(rotina.get(5));
		System.out.println(rotina.size());

	}

}
