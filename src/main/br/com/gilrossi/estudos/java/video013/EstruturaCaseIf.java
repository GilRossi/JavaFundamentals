package video013;

public class EstruturaCaseIf {

	public static void main(String[] args) {

		String semaforo = "verde";

		while (true) {
			switch (semaforo) {
			case "verde": {
				try {
					System.out.println("VERDE");
					Thread.sleep(30);
					semaforo = "amarelo";
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			case "amarelo": {
				try {
					System.out.println("AMARELO");
					Thread.sleep(15);
					semaforo = "vemelho";
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			case "vermelho": {
				try {
					System.out.println("VEMELHO");
					Thread.sleep(50);
					semaforo = "verde";
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
			}
			}
		}

	}

}
