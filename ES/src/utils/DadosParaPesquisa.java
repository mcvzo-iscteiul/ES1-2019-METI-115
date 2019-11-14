package utils;

public class DadosParaPesquisa {

	private String tipo1;
	private String tipo2;
	private String c1;
	private String c2;
	private String junt;
	private int lim1;
	private int lim2;
	
	
	public String getTipo1() {
		return tipo1;
	}


	public String getTipo2() {
		return tipo2;
	}


	public String getC1() {
		return c1;
	}


	public String getC2() {
		return c2;
	}


	public String getJunt() {
		return junt;
	}


	public int getLim1() {
		return lim1;
	}


	public int getLim2() {
		return lim2;
	}


	public DadosParaPesquisa(String tipo1, String tipo2, String c1, String c2, String junt, int lim1, int lim2) {
		super();
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.c1 = c1;
		this.c2 = c2;
		this.junt = junt;
		this.lim1 = lim1;
		this.lim2 = lim2;
	}
	
	
	
}
