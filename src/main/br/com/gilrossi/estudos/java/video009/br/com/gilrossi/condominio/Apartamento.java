package video009.br.com.gilrossi.condominio;

class Apartamento {
	
	private int apto;
	
	public int getAp() {
		morador();
		return apto;
	}
	
	public void setAp(int apto) {
		this.apto = apto;
	}

	private void morador() {
		boolean locatario = false;
		if(!locatario) 
			System.out.println("Autorizado a alugar para o Apartamento: " + apto);			
		else
			System.out.println("Não autorizado a utilizar as dependências: " + apto);
			
	}

}
