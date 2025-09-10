package video006;

public class Calcular {
	public static void main(String[] args) {

		//Somas aqui
		System.out.println("Somas");

		Soma somar = new Soma();		
		somar.somaDouble(1, 2);		

		//Subtrações aqui
		System.out.println("\nSubtrações");

		Subtracao subtracao = new Subtracao();
		subtracao.subtrairInt(7, 3);

		// Diviões aqui
		System.out.println("\nDivisões");

		Divisao dividir = new Divisao();
		dividir.dividirInt(9, 3);

		//Multiplicações aqui
		System.out.println("\nMultiplicações");
		
		Multiplicacao multiplicar = new Multiplicacao();
		multiplicar.multiplicarLong(5010, 654651423);
	}

}
