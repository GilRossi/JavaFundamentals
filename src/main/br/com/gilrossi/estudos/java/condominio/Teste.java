package condominio;

public class Teste {
    public static void main(String[] args) {

        Condominio cond = new Condominio();
        Apartamento apt1 = new Apartamento(101);
        Apartamento apt2 = new Apartamento(102);
        Apartamento apt3 = new Apartamento(201);

        cond.getPiscina().emprestarBoia(apt1); // Empresta a boia para o apartamento 101
        cond.getPiscina().emprestarBoia(apt2); // Tenta emprestar
        cond.getPiscina().devolverBoia(apt1); // Devolve a boia
        cond.getPiscina().emprestarBoia(apt2); // Agora deve conseguir emprestar
        cond.getPiscina().emprestarBoia(apt3); // Tenta emprestar
        cond.getPiscina().devolverBoia(apt2); // Devolve a boia
        cond.getPiscina().devolverBoia(apt3); // Tenta devolver sem ter a boia

    }
}
