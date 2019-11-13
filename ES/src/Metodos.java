
public class Metodos {
	
	private String nome;
	private int met1;
	private int met2;
	private int met3;
	private int met4;
	private Boolean iLM;
	private Boolean iPlasma;
	private Boolean PMD;
	private Boolean iFE;
	
	public Metodos(String nome, int met1, int met2, int met3, int met4, Boolean iLM, Boolean iPlasma, Boolean PMD, Boolean iFE) {
		this.nome = nome;
		this.met1 = met1;
		this.met2 = met2;
		this.met3 = met3;
		this.met4 = met4;
		this.iLM = iLM;
		this.iPlasma = iPlasma;
		this.PMD = PMD;
		this.iFE = iFE;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMet1() {
		return met1;
	}

	public void setMet1(int met1) {
		this.met1 = met1;
	}

	public int getMet2() {
		return met2;
	}

	public void setMet2(int met2) {
		this.met2 = met2;
	}

	public int getMet3() {
		return met3;
	}

	public void setMet3(int met3) {
		this.met3 = met3;
	}

	public int getMet4() {
		return met4;
	}

	public void setMet4(int met4) {
		this.met4 = met4;
	}

	public Boolean getiLM() {
		return iLM;
	}

	public void setiLM(Boolean iLM) {
		this.iLM = iLM;
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

	public Boolean getiFE() {
		return iFE;
	}

	public void setiFE(Boolean iFE) {
		this.iFE = iFE;
	}
		
	
}
