package video004;

public class Main {
	public static void main(String[] args) {
		
		Gato g1 = new Gato();
		g1.nome = "Totti";
		g1.raca = "Siames";		
		System.out.println("Gato\n" + "Nome: " + g1.nome + "\nRaça: " + g1.raca);
		g1.miar();
		System.out.print("Seu gato é: ");
		g1.peso(3);
		
		Cachorro c1 = new Cachorro();
		c1.nome = "Antonella";
		c1.raca = "Pit Bull";
		System.out.println("\nCachorro\n" + "Nome: " + c1.nome + "\nRaça: " + c1.raca);
		c1.latir();
		
	}

}
