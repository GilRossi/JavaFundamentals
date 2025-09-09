package banco;

public class ContaConjunta {
    public static void main(String[] args) {
        Conta gil = new Conta();

        Conta.depositar(100.00);
        // gil.depositarIndiviudal(50.00);

        System.out.println(Conta.contaConjunta);
//        System.out.println(aliny.contaIndividual);
//        System.out.println(gil.contaIndividual);

    }
}
