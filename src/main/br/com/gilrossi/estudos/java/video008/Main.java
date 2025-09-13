package video008;

public class Main {
	public static void main(String[] args) {
		Conta.depositarContaConjunta(2000);
		System.out.println(Conta.saldoContaConjunta);
		System.out.println(Conta.TAXA_SERVICOS);
		
		Conta gil = new Conta();
		gil.depositarContaIndividual(1.5);
		System.out.println(Math.round(gil.saldoContaIndividual));
	}

}
