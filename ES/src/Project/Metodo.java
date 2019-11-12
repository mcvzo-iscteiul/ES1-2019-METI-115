package Project;

public class Metodo {

	private String metodo;
	private int LOC;
	private int CYCLO;
	private int ATFD;
	private Boolean is_long_method;
	private Boolean iPlasma;
	private Boolean PMD;
	private Boolean is_feature_envy;
	
	
	public Metodo(String metodo, int LOC, int CYCLO, int ATFD, Boolean is_long_method, Boolean iPlasma, Boolean is_feature_envy) {
		this.metodo = metodo;
		this.LOC = LOC;
		this.CYCLO = CYCLO;
		this.ATFD = ATFD;
		this.is_long_method = is_long_method;
		this.is_feature_envy = is_feature_envy;
	}


	public String getMetodo() {
		return metodo;
	}


	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}


	public int getLOC() {
		return LOC;
	}


	public void setLOC(int lOC) {
		LOC = lOC;
	}


	public int getCYCLO() {
		return CYCLO;
	}


	public void setCYCLO(int cYCLO) {
		CYCLO = cYCLO;
	}


	public int getATFD() {
		return ATFD;
	}


	public void setATFD(int aTFD) {
		ATFD = aTFD;
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
