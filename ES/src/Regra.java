
public class Regra {
	
	private Defeito defeito;
	private Valor val1;
	private Valor val2;
	
	public Regra(Defeito defeito, Valor val1, Valor val2) {
		this.defeito = defeito;
		this.val1 = val1;
		this.val2 = val2;
	}

	public Defeito getDefeito() {
		return defeito;
	}
	
	public void setDefeito(Defeito defeito) {
		this.defeito = defeito;
	}
	
	public Valor getVal1() {
		return val1;
	}
	
	public void setVal1(Valor val1) {
		this.val1 = val1;
	}
	
	public Valor getVal2() {
		return val2;
	}
	
	public void setVal2(Valor val2) {
		this.val2 = val2;
	}
	
}
