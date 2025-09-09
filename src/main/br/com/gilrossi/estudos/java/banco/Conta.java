package banco;

public class Conta {
    static double contaConjunta;
    double contaIndividual;
    final static double TAXA_SERVICOS = 0.10;

    static void depositar(double valor) {
        contaConjunta += valor;
    }

    void sacar(double valor)
    {
        if (valor <= contaConjunta) {
            contaConjunta -= valor;
        } else {
            System.out.println("Saldo insuficiente na conta individual.");
        }
    }

    void depositarIndiviudal(double valor) {
        contaIndividual += valor;
    }
}
