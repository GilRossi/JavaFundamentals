package relogio;

public class Depertador {
    public int hora;
    public int minuto;
    boolean ligado;

    public void tocar() {

            System.out.println("Beep Beep");

    }

    public String depertadorAgendado(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.ligado = true;
        return "Depertador ligado para as " + hora + ":" + minuto;
    }
}
