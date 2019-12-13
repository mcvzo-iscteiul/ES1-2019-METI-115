package utils;

public class Metodo {

	/**
	 *@author maria 
	 * 
	 */
	private String metodo;
	private double LOC;
	private double CYCLO;
	private double ATFD;
	private double LAA;
	private Boolean is_long_method;
	private Boolean iPlasma;
	private Boolean PMD;
	private Boolean is_feature_envy;

	/**
	 * 
	 * @param metodo the name of the method
	 * @param LOC the value of LOC's method
	 * @param CYCLO the value of CYCLO's method
	 * @param ATFD the value of ATFD's method
	 * @param LAA the value of LAA's method
	 * @param is_long_method the value of is_long_method's method
	 * @param iPlasma the value of iPlasma's method
	 * @param PMD the value of PMD's method
	 * @param is_feature_envy the value of is_feature_envy's method
	 */

	public Metodo(String metodo, double LOC, double CYCLO, double ATFD, double LAA, Boolean is_long_method, Boolean iPlasma,Boolean PMD, Boolean is_feature_envy) {
		this.metodo = metodo;
		this.LOC = LOC;
		this.CYCLO = CYCLO;
		this.ATFD = ATFD;
		this.LAA = LAA;
		this.is_long_method = is_long_method;
		this.iPlasma = iPlasma;
		this.PMD = PMD;
		this.is_feature_envy = is_feature_envy;
	}

	/**
	 * This method returns the method
	 * @return metodo
	 */

	public String getMetodo() {
		return metodo;
	}

	/**
	 * This method changes the method to the value that is given has parameter
	 * @param metodo
	 */
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	/**
	 * This method returns the LOC's value
	 * @return LOC
	 */
	public double getLOC() {
		return this.LOC;
	}

	/**
	 * This method changes the LOC's value to the value that is given has parameter
	 * @param LOC
	 */
	public void setLOC(double LOC) {
		this.LOC = LOC;
	}

	/**
	 * This method returns the CYCLO's value
	 * @return CYCLO
	 */
	public double getCYCLO() {
		return CYCLO;
	}

	/**
	 * This method changes the CYCLO's value to the value that is given has parameter
	 * @param CYCLO
	 */
	public void setCYCLO(double CYCLO) {
		this.CYCLO = CYCLO;
	}

	/**
	 * This method returns the ATFD's value
	 * @return ATFD
	 */
	public double getATFD() {
		return ATFD;
	}


	/**
	 * This method changes the ATFD's value to the value that is given has parameter
	 * @param ATFD
	 */
	public void setATFD(double ATFD) {
		this.ATFD = ATFD;
	}

	/**
	 * This method returns the LAA's value
	 * @return LAA
	 */
	public double getLAA() {
		return LAA;
	}

	/**
	 * This method changes the LAA's value to the value that is given has parameter
	 * @param LAA
	 */
	public void setLAA(double LAA) {
		this.LAA = LAA;
	}

	/**
	 * This method returns the is_long_method's value
	 * @return is_long_method
	 */
	public Boolean getIs_long_method() {
		return is_long_method;
	}


	/**
	 * This method changes the is_long_method's value to the value that is given has parameter
	 * @param is_long_method
	 */
	public void setIs_long_method(Boolean is_long_method) {
		this.is_long_method = is_long_method;
	}

	/**
	 * This method returns the iPlasma's value
	 * @return iPlasma
	 */
	public Boolean getiPlasma() {
		return iPlasma;
	}

	/**
	 * This method changes the iPlasma's value to the value that is given has parameter
	 * @param iPlasma
	 */
	public void setiPlasma(Boolean iPlasma) {
		this.iPlasma = iPlasma;
	}

	/**
	 * This method returns the PMD's value
	 * @return PMD
	 */
	public Boolean getPMD() {
		return PMD;
	}

	/**
	 * This method changes the PMD's value to the value that is given has parameter
	 * @param PMD
	 */
	public void setPMD(Boolean PMD) {
		this.PMD = PMD;
	}

	/**
	 * This method returns the is_feature_envy's value
	 * @return is_feature_envy
	 */
	public Boolean getIs_feature_envy() {
		return is_feature_envy;
	}

	/**
	 * This method changes the is_feature_envy's value to the value that is given has parameter
	 * @param is_feature_envy
	 */
	public void setIs_feature_envy(Boolean is_feature_envy) {
		this.is_feature_envy = is_feature_envy;
	}


}
