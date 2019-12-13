package utils;


/**
 * @author marianavaz
 *
 */
public class Estrutura {

	private Metodo metodo;
	private Boolean bol;
	private String defeito;

	/**
	 * This methos is the constructer of the object Estrutura
	 * @param metodo is a method from the EXCEL
	 * @param bol with the value based on the rule created by the user
	 * @param defeito depends on the metrics user uses to create a rule
	 */
	public Estrutura(Metodo metodo, Boolean bol, String defeito) {
		this.metodo = metodo;
		this.bol = bol;
		this.defeito = defeito;
	}

	/**
	 * This method is to see witch metodo is in the Estrutura
	 * @return metodo that is a component of the Estrutura
	 */
	public Metodo getMetodo() {
		return metodo;
	}

	/**
	 * This method is to see witch boolean is in the Estrutura
	 * @return bol that is a component of the Estrutura
	 */
	public Boolean getBol() {
		return bol;
	}
	
	/**
	 * This method is to see witch defeito is in the Estrutura
	 * @return defeito that is a component of the Estrutura
	 */
	public String getDefeito() {
		return defeito;
	}

	@Override
	public String toString() {
		return "NomeMet: " + metodo.getMetodo() + " BOOLEAN: " + bol + " DEFEITO: " + defeito;
	}
}
