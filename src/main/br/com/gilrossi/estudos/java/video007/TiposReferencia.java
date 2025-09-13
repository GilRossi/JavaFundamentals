package video007;

public class TiposReferencia {
	public static void main(String[] args) {
		
		var conta = new Conta(2.2, 3.3);		
		var conta2 = new Conta(2.5, 3.3);
		var conta3 = new Conta(2.2, 3.3);
		
		System.out.println(conta == conta3);
		System.out.println(conta.contaConjunta == conta3.contaConjunta);
		System.out.println(conta.contaConjunta.equals(conta3.contaConjunta));
		System.out.println(conta.equals(conta3));
		
	}

}
