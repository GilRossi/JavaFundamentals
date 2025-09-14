package video011;

public class StringsBasics {
	public static void main(String[] args) {
		
		/*
		 * False se comparado com == pois os valors de memoria 
		 * são diferente devido ter instanciado um novo objeto
		 */
		String str1 = new String("a");
		String str2 = new String("a");
		System.out.println(str1 == str2);
		
		// Agora validando o valor da String dentro do objeto instanciado na memoria
		System.out.println(str1.equals(str2));
		
		//True usando o == pois o valor da variavel está no pool de strings e referencia o mesmo  valor
		String str3 = "a";
		String str4 = "a";
		System.out.println(str3 == str4);
		
		System.out.println("\nPulando linha");
		System.out.println("Usando\ttabulação (tab)");
		
		// A String é um array de char, sendo assim da ṕara usar um indice do [0] a [n]
		String name = "Gil Rossi Aguiar";
		System.out.println(name.charAt(0));
		
		int posicisaoSobrenome = name.indexOf("i ") + 1;
		int posicaoNomeMeio = name.indexOf("l ") + 1;
		System.out.println(name.substring(posicisaoSobrenome).trim());
		// Contando os caracteres e removendo 2 por causa dos espaçoes, para contar somente as letras
		System.out.println(name.length() - 2);
		
		System.out.println(name.replaceAll("a", "@").replaceAll("i", "1").replaceAll("G", "6"));
		System.out.println(name);
		
		
	}

}
