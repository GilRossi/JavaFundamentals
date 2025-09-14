package video008;

/*
 * O uso do static é para quando não precisamos de objetos
 */

public class Main {
	public static void main(String[] args) {
		Conta.depositarContaConjunta(2000);
		
		System.out.println(Conta.saldoContaConjunta);
		
		System.out.println(Conta.TAXA_SERVICOS);
		
		Conta gil = new Conta();
		gil.depositarContaIndividual(1.5);
		
		System.out.println(Math.round(gil.saldoContaIndividual));
		
		Conta conta = null;
		
		System.out.println(conta);
		
		Conta.sacarContaConjunta(500);
		
		System.out.println(Conta.saldoContaConjunta);
	}

}
