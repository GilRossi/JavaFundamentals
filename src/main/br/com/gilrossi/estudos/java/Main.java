import biblioteca.Biblioteca;
import primitivos.Soma;

public class Main {
    public static void main(String[] args) {

        Soma calcularSoma = new Soma(10.0, 20.0);
        Soma calcularSoma2 = new Soma(10.0, 20.0);
        Soma calcularSoma3 = new Soma(100.0, 200.0);
        System.out.println("Resultado da soma: " + calcularSoma.somaDouble() + " Endereco de memoria: " + calcularSoma);
        System.out.println("Resultado da soma: " + calcularSoma2.somaDouble() + " Endereco de memoria: " + calcularSoma2);
        System.out.println("Resultado da soma: " + calcularSoma3.somaDouble() + " Endereco de memoria: " + calcularSoma3);

        /*
        *
        * Comparar com == e equals
        *
         */

        // == compara o endereco de memoria
        System.out.println(calcularSoma == calcularSoma2);

        // equals compara o conteudo. Comparando o conteudo da somaDouble
        System.out.println(calcularSoma.somaDouble().equals(calcularSoma2.somaDouble()));

        //== comparando o resultado da somaDouble
        System.out.println(calcularSoma.somaDouble() == calcularSoma2.somaDouble());

        // equals compara o conteudo. Comparando o conteudo da variavel atributiva
        System.out.println(calcularSoma.a.equals(calcularSoma2.a));

        //utilizando o == para ver os valores primitivos
        System.out.println(calcularSoma.b == calcularSoma2.b);

        //utilizando o == para ver os valores primitivos - nao eh possivel usar equals em tipos primitivos
        //System.out.println(calcularSoma.b.equals(calcularSoma2.b));


        Biblioteca biblioteca = new Biblioteca();
        biblioteca.banheiro = "Masculino";
        System.out.println(biblioteca.banheiro);
    }
}
