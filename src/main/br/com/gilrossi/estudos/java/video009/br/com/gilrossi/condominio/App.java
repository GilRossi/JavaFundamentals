package video009.br.com.gilrossi.condominio;

public class App {
	public static void main(String[] args) {
	
		Apartamento apto = new Apartamento();
		apto.setAp(62);
		
		Piscina piscina = new Piscina(apto);
		piscina.setBioa("Boia azul");
		System.out.println(piscina.getBoia());
	}
}
