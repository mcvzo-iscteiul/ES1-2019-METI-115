
public class Estrutura {
	
	private Metodo metodo;
	private Boolean bol;

	public Estrutura(Metodo metodo, Boolean bol) {
		this.metodo = metodo;
		this.bol = bol;
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
	
	@Override
	public String toString() {
		return "NomeMet: " + metodo.getMetodo() + " BOOLEAN: " + bol;
	}
}
