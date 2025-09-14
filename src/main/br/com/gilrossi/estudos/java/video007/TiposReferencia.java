package video007;

public class TiposReferencia {
	public static void main(String[] args) {
		
		var conta = new Soma(2.5, 7.5);		
		var conta2 = new Soma(2.5, 2.5);
		var conta3 = new Soma(2.5, 3.5);
		
		System.out.println(conta == conta3);
		System.out.println(conta.contaConjunta == conta3.contaConjunta);
		System.out.println(conta.contaConjunta.equals(conta3.contaConjunta));
		System.out.println(conta.equals(conta3));
		System.out.println(conta.somando());
		System.out.println(conta2.somando());
		System.out.println(conta3.somando());
		
		int a = 1;
		int b = 1;
		
		System.out.println(a == b);
		
	}

}
