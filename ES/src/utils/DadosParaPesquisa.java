package utils;

/**
 * @author carlosguerra
 *
 */
/**
 * @author carlosguerra
 *
 */
public class DadosParaPesquisa {

	private String tipo1;
	private String tipo2;
	private String junt;
	private int lim1;
	private int lim2;
	
	
	/**
	 * @return 
	 * returns the 1sttype to be searched
	 */
	public String getTipo1() {
		return tipo1;
	}


	/**
	 * @return
	 * returns the 2nd type to be searched
	 */
	public String getTipo2() {
		return tipo2;
	}

	/**
	 * @return
	 * returns e or ou to get the searches
	 */
	public String getJunt() {
		return junt;
	}


	/**
	 * @return
	 * returns the 1st limit to be searched
	 */
	public int getLim1() {
		return lim1;
	}


	/**
	 * @return
	 * returns the 2nd lim
	 */
	public int getLim2() {
		return lim2;
	}


	/**
	 * @param tipo1
	 * @param tipo2
	 * @param junt
	 * @param lim1
	 * @param lim2
	 * 
	 * Constructor of the type DadosParaPesquisa, which will be passed to be searched
	 */
	public DadosParaPesquisa(String tipo1, String tipo2, String junt, int lim1, int lim2) {
		super();
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.junt = junt;
		this.lim1 = lim1;
		this.lim2 = lim2;
	}
	
	
	
}
