package video008;

public class Conta {
	
	static double saldoContaConjunta;
	double saldoContaIndividual;
	final static double TAXA_SERVICOS = 12.6;
	
	static double depositarContaConjunta(double valor) {
		return saldoContaConjunta += valor;
	}
	
	static double sacarContaConjunta(double valor) {
		return saldoContaConjunta -= valor;
	}
	
	double depositarContaIndividual(double valor) {
		return saldoContaIndividual += valor;
	}
	
	double sacarContaIndividual(double valor) {
		return saldoContaIndividual -= valor;
	}
}
