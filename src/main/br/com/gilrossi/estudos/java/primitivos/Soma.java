package primitivos;

public class Soma {
    public Double a;
    public double b;

    public Soma(Double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Double somaDouble() {
        return a + b;
    }
}
