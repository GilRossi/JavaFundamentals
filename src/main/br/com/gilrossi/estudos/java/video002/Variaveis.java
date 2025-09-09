package video002;

public class Variaveis {
	
	/**
	 * <tipo> identificador;
	 * 
	 * <tipo> identificador = valor;
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		/**
		 * 
		 * Camel Case
		 * 
		 * Alternar as palavras entre maiuscula e minuscula
		 * 
		 * tipoCafe
		 * 
		 */
		
		// <tipo> identificador;
		int numero;
		numero = 1;
		System.out.println(numero);
				
		// <tipo> identificador = valor; 
		String nome = "Gil Rossi";
		
		System.out.println("Olá, " + nome + "!");		
		
		
		/**
		 * 
		 * Para declarar uma variavel, sempre verificar o escopo que se encontra
		 * o metodo com a variavel escopo, não consegue ser acessado no metodo main
		 * pois estão em escopos diferentes
		 * 
		 */
		
		// System.out.println(escopo);
		
	}
	
	void metodo() {
		/**
		 * 
		 * Aqui o escopo está dentro do metodo, sendo assim dentro do mesmo escopo
		 * assim conseguimos utilizar a vairiavel
		 * 
		 */
		
		int escopo = 2;
		System.out.println(escopo);		
	}

}
