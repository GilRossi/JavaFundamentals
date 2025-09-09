package video004;

public class Gato {
	
	String nome;
	String raca;
	
	
	void miar() {
		System.out.println("Miau");
	}
	
	double peso (double num) {
		if(num > 4.9) 
			System.out.println("Gordo");
		else
			System.out.println("Esbelto");
		
		return num;
	}
	

}
