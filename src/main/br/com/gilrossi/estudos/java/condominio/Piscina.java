package condominio;

class Piscina {
    private boolean boiaDisponivel = true;
    private Apartamento apartamentoComBoia;

    public boolean emprestarBoia(Apartamento apartamento) {
        if (boiaDisponivel) {
            boiaDisponivel = false;
            apartamentoComBoia = apartamento;
            System.out.println("Boia emprestada para " + apartamento);
            return true;
        }else {
            System.out.println("Boia indisponível para " + apartamento + ". Atualmente com " + apartamentoComBoia);
            return false;
        }
    }

    public void devolverBoia(Apartamento apartamento) {
        if (apartamento.equals(apartamentoComBoia)) {
            boiaDisponivel = true;
            apartamentoComBoia = null;
            System.out.println("Boia devolvida por: " + apartamento);
        } else {
            System.out.println("Apartamento " + apartamento + " não possui boia para devolver.");
        }
    }

    public Apartamento getEmprestadaPara() {
        return apartamentoComBoia;
    }
}
