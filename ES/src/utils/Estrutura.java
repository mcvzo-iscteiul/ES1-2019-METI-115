package utils;


public class Estrutura {

	private Metodo metodo;
	private Boolean bol;
	private String defeito;

	public Estrutura(Metodo metodo, Boolean bol, String defeito) {
		this.metodo = metodo;
		this.bol = bol;
		this.defeito = defeito;
	}

	public Metodo getMetodo() {
		return metodo;
	}

	public void setMetodo(Metodo metodo) {
		this.metodo = metodo;
	}

	public Boolean getBol() {
		return bol;
	}

	public void setBol(Boolean bol) {
		this.bol = bol;
	}
	
	public String getDefeito() {
		return defeito;
	}

	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}

//	@Override
//	public String toString() {
//		return "NomeMet: " + metodo.getMetodo() + " BOOLEAN: " + bol + " DEFEITO: " + defeito;
//	}
}
