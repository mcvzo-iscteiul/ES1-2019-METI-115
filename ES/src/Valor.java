
public class Valor {
	
	private int valor;
	private Metrica met;
	
	public Valor(int valor, Metrica met) {
		this.valor = valor;
		this.met = met;
	}
	
	public Metrica getMet() {
		return met;
	}

	public void setMet(Metrica met) {
		this.met = met;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}

}
