package video007;

public class Soma {
	
	Double contaConjunta;
	Double contaIndividual;
	
	public Soma(Double contaConjunta, Double contaIndividual) {
		this.contaIndividual = contaIndividual;
		this.contaConjunta = contaConjunta;
	}
	
	Double somando() {
		return  contaConjunta + contaIndividual;
	}

}
