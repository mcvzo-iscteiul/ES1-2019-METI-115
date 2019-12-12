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

	public Boolean getBol() {
		return bol;
	}
	
	public String getDefeito() {
		return defeito;
	}

	@Override
	public String toString() {
		return "NomeMet: " + metodo.getMetodo() + " BOOLEAN: " + bol + " DEFEITO: " + defeito;
	}
}
