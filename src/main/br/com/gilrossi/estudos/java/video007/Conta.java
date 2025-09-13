package video007;

public class Conta {
	
	Double contaConjunta;
	Double contaIndividual;
	
	public Conta(Double contaConjunta, Double contaIndividual) {
		this.contaIndividual = contaIndividual;
		this.contaConjunta = contaConjunta;
	}
	
	Double deposito() {
		return  contaConjunta + contaIndividual;
	}

}
