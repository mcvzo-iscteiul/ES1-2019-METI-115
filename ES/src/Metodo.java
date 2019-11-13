
public class Metodo {

	private String metodo;
	private double LOC;
	private double CYCLO;
	private double ATFD;
	private double LAA;
	private Boolean is_long_method;
	private Boolean iPlasma;
	private Boolean PMD;
	private Boolean is_feature_envy;


	public Metodo(String metodo, double LOC, double CYCLO, double ATFD, double LAA, Boolean is_long_method, Boolean iPlasma, Boolean is_feature_envy) {
		this.metodo = metodo;
		this.LOC = LOC;
		this.CYCLO = CYCLO;
		this.ATFD = ATFD;
		this.LAA = LAA;
		this.is_long_method = is_long_method;
		this.is_feature_envy = is_feature_envy;
	}


	public String getMetodo() {
		return metodo;
	}


	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}


	public double getLOC() {
		return this.LOC;
	}


	public void setLOC(double LOC) {
		LOC = LOC;
	}


	public double getCYCLO() {
		return CYCLO;
	}


	public void setCYCLO(double d) {
		CYCLO = d;
	}


	public double getATFD() {
		return ATFD;
	}



	public void setATFD(double ATFD) {
		ATFD = ATFD;
	}


	public double getLAA() {
		return LAA;
	}


	public void setLAA(double lAA) {
		LAA = lAA;
	}


	public Boolean getIs_long_method() {
		return is_long_method;
	}


	public void setIs_long_method(Boolean is_long_method) {
		this.is_long_method = is_long_method;
	}


	public Boolean getiPlasma() {
		return iPlasma;
	}


	public void setiPlasma(Boolean iPlasma) {
		this.iPlasma = iPlasma;
	}


	public Boolean getPMD() {
		return PMD;
	}


	public void setPMD(Boolean pMD) {
		PMD = pMD;
	}


	public Boolean getIs_feature_envy() {
		return is_feature_envy;
	}


	public void setIs_feature_envy(Boolean is_feature_envy) {
		this.is_feature_envy = is_feature_envy;
	}


}
