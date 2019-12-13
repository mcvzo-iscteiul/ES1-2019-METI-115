package results;
import java.util.ArrayList;

import utils.DadosParaPesquisa;
import utils.Estrutura;
import utils.Metodo;

/**
 * @author marianavaz
 *
 */
public class Resultados {
	
	
	/**
	 * This is a method to apply the rule created by the user about the metrics related with IsLongMethod defect
	 * @param bruto with data from the EXCEL
	 * @param dados with data chosen by the user to create a new rule
	 * @return resultado where in each position of the array is the method, a boolean that says if the rule is verified or not and a string with the name of the defect
	 */
	public static ArrayList<Estrutura> resultado_IS_LONG_METHOD(ArrayList<Metodo> bruto, DadosParaPesquisa dados) {
		ArrayList<Estrutura> resultado = new ArrayList<Estrutura>();
		for(Metodo m: bruto) {
			if(dados.getJunt().equals("e")) {
				if(dados.getTipo1().equals("LOC") && dados.getTipo2().equals("CYCLO")) {
					if(m.getLOC()>dados.getLim1() && m.getCYCLO()>dados.getLim2()) {
						resultado.add(new Estrutura(m, true, "IsLongMethod"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "IsLongMethod"));
				}else if(dados.getTipo1().equals("LOC") && dados.getTipo2().equals("")) {
					if(m.getLOC()>dados.getLim1()) {
						resultado.add(new Estrutura(m, true, "IsLongMethod"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "IsLongMethod"));
				}else if(dados.getTipo1().equals("CYCLO") && dados.getTipo2().equals("LOC")) {
					if(m.getCYCLO()>dados.getLim1() && m.getLOC()>dados.getLim2()){
						resultado.add(new Estrutura(m, true, "IsLongMethod"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "IsLongMethod"));
				}else if(dados.getTipo1().equals("CYCLO") && dados.getTipo2().equals("")) {
					if(m.getCYCLO()>dados.getLim1()) {
						resultado.add(new Estrutura(m, true, "IsLongMethod"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "IsLongMethod"));
				}
			}else if(dados.getJunt().equals("ou")) {
				if(dados.getTipo1().equals("LOC") && dados.getTipo2().equals("CYCLO")) {
					if(m.getLOC()>dados.getLim1() || m.getCYCLO()>dados.getLim2()) {
						resultado.add(new Estrutura(m, true, "IsLongMethod"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "IsLongMethod"));
				}else if(dados.getTipo1().equals("LOC") && dados.getTipo2().equals("")) {
					if(m.getLOC()>dados.getLim1()) {
						resultado.add(new Estrutura(m, true, "IsLongMethod"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "IsLongMethod"));
				}else if(dados.getTipo1().equals("CYCLO") && dados.getTipo2().equals("LOC")) {
					if(m.getCYCLO()>dados.getLim1() || m.getLOC()>dados.getLim2()){
						resultado.add(new Estrutura(m, true, "IsLongMethod"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "IsLongMethod"));
				}else if(dados.getTipo1().equals("CYCLO") && dados.getTipo2().equals("")) {
					if(m.getCYCLO()>dados.getLim1()) {
						resultado.add(new Estrutura(m, true, "IsLongMethod"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "IsLongMethod"));
				}
			}
		}
		return resultado;
		
	}
	
	/**
	 * This is a method to apply the rule created by the user about the metrics related with FeatureEnvy defect
	 * @param bruto with data from the EXCEL
	 * @param dados with data chosen by the user to create a new rule
	 * @return resultado where in each position of the array is the method, a boolean that says if the rule is verified or not and a string with the name of the defect
	 */
	public static ArrayList<Estrutura> resultado_FEATURE_ENVY(ArrayList<Metodo> bruto, DadosParaPesquisa dados) {
		ArrayList<Estrutura> resultado = new ArrayList<Estrutura>();
		for(Metodo m: bruto) {
			if(dados.getJunt().equals("e")) {
				if(dados.getTipo1().equals("LAA") && dados.getTipo2().equals("ATFD")) {
					if(m.getLAA()<dados.getLim1() && m.getATFD()>dados.getLim2()) {
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}else if(dados.getTipo1().equals("LAA") && dados.getTipo2().equals("")) {
					if(m.getLAA()<dados.getLim1()) {
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}else if(dados.getTipo1().equals("ATFD") && dados.getTipo2().equals("LAA")) {
					if(m.getATFD()>dados.getLim1() && m.getLAA()<dados.getLim2()){
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}else if(dados.getTipo1().equals("ATFD") && dados.getTipo2().equals("")) {
					if(m.getATFD()>dados.getLim1()) {
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}
			}else if(dados.getJunt().equals("ou")) {
				if(dados.getTipo1().equals("LAA") && dados.getTipo2().equals("ATFD")) {
					if(m.getLAA()<dados.getLim1() || m.getATFD()>dados.getLim2()) {
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}else if(dados.getTipo1().equals("LAA") && dados.getTipo2().equals("")) {
					if(m.getLAA()<dados.getLim1()) {
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}else if(dados.getTipo1().equals("ATFD") && dados.getTipo2().equals("LAA")) {
					if(m.getATFD()>dados.getLim1() || m.getLAA()<dados.getLim2()){
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}else if(dados.getTipo1().equals("ATFD") && dados.getTipo2().equals("")) {
					if(m.getATFD()>dados.getLim1()) {
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}
			}
		}
		return resultado;

	}

	/**
	 * This is a method the chooses, based on the metrics given by the user, with witch defect the metrics are related with 
	 * @param bruto with data from the EXCEL
	 * @param dados with data chosen by the user to create a new rule
	 * @return resultado where in each position of the array is the method, a boolean that says if the rule is verified or not and a string with the name of the defect
	 */
	public static ArrayList<Estrutura> distinguirResultado(ArrayList<Metodo> bruto, DadosParaPesquisa dados) {
		ArrayList<Estrutura> resultado = new ArrayList<Estrutura>();
		if((dados.getTipo1().equals("LOC") && dados.getTipo2().equals("CYCLO")) || (dados.getTipo1().equals("LOC") && dados.getTipo2().equals("")) || (dados.getTipo1().equals("CYCLO") && dados.getTipo2().equals("LOC")) || (dados.getTipo1().equals("CYCLO") && dados.getTipo2().equals(""))) {
			resultado = resultado_IS_LONG_METHOD(bruto, dados);
		}else if((dados.getTipo1().equals("LAA") && dados.getTipo2().equals("ATFD")) || (dados.getTipo1().equals("LAA") && dados.getTipo2().equals("")) || (dados.getTipo1().equals("ATFD") && dados.getTipo2().equals("LAA")) || (dados.getTipo1().equals("ATFD") && dados.getTipo2().equals(""))){
			resultado = resultado_FEATURE_ENVY(bruto, dados);
		}
		return resultado;
	}

}