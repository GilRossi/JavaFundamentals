package video009.br.com.gilrossi.condominio;

class Piscina {
	
	Apartamento apto;
	
	public Piscina(Apartamento apto) {
		this.apto = apto;
	}
	
	private String boia;
	
	public String getBoia() {
		registrarEmprestimo();
		return boia;
	}
	
	public void setBioa(String boia) {
		boiaFurada();
		this.boia = boia;
	}

	private void boiaFurada() {
		// TODO Auto-generated method stub
		
	}

	private void registrarEmprestimo() {
		
		System.out.println("Boia alugada para o Apartamento: " + apto.getAp());
		
		
	}

}
