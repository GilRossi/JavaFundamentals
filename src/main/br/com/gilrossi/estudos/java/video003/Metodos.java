package video003;


/**
 * 
 * <tipo do retorno do metodo> identificador(<tipo> parâmetro){
 * return <algo do mesmo tipo do metodo>;
 * }
 * 
 * Camel Case
 * 
 * Usar verbos para dar nomes ao metodos
 * 
 * acordar, subir, descer, parar e etc...
 * 
 * void é para usar quando não tiver retorno
 * 
 *  
 */

public class Metodos {
	
	public static void main(String[] args) {
		
		// ativarSonecaCincoMinutos();
		String menssagemAlarme = ativarSoneca(10);
		System.out.println(menssagemAlarme);
		System.out.println(ativarSoneca(850));
		
		
	}
	/*
	 * <tipo> identificador (<tipo> parâmetro){
	 * <bloco de comandos> 
	 * }
	 */
	static String ativarSoneca(int tempo) {
		return "Mais " + tempo + " Minutos";
	}
	
	/*
	 * Void é usado quando não tenho um retorno do metodo
	 */
	static void ativarSonecaCincoMinutos() {
		System.out.println("Mais 5 minutos");
	}

}