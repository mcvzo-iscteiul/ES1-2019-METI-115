package results;
import java.util.ArrayList;

import utils.DadosParaPesquisa;
import utils.Estrutura;
import utils.Metodo;

public class Resultados {
	
	
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
	
	public static ArrayList<Estrutura> resultado_FEATURE_ENVY(ArrayList<Metodo> bruto, DadosParaPesquisa dados) {
		ArrayList<Estrutura> resultado = new ArrayList<Estrutura>();
		for(Metodo m: bruto) {
			if(dados.getJunt().equals("e")) {
				if(dados.getTipo1().equals("LAA") && dados.getTipo2().equals("ATFD")) {
					if(m.getLAA()>dados.getLim1() && m.getATFD()>dados.getLim2()) {
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}else if(dados.getTipo1().equals("LAA") && dados.getTipo2().equals("")) {
					if(m.getLAA()>dados.getLim1()) {
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}else if(dados.getTipo1().equals("ATFD") && dados.getTipo2().equals("LAA")) {
					if(m.getATFD()>dados.getLim1() && m.getLAA()>dados.getLim2()){
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
					if(m.getLAA()>dados.getLim1() || m.getATFD()>dados.getLim2()) {
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}else if(dados.getTipo1().equals("LAA") && dados.getTipo2().equals("")) {
					if(m.getLAA()>dados.getLim1()) {
						resultado.add(new Estrutura(m, true, "FeatureEnvy"));
						continue;
					}
					resultado.add(new Estrutura(m, false, "FeatureEnvy"));
				}else if(dados.getTipo1().equals("ATFD") && dados.getTipo2().equals("LAA")) {
					if(m.getATFD()>dados.getLim1() || m.getLAA()>dados.getLim2()){
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

	public static ArrayList<Estrutura> distinguirResultado(ArrayList<Metodo> bruto, DadosParaPesquisa dados) {
		ArrayList<Estrutura> resultado = new ArrayList<Estrutura>();
		if((dados.getTipo1().equals("LOC") && dados.getTipo2().equals("CYCLO")) || (dados.getTipo1().equals("LOC") && dados.getTipo2().equals("")) || (dados.getTipo1().equals("CYCLO") && dados.getTipo2().equals("LOC")) || (dados.getTipo1().equals("CYCLO") && dados.getTipo2().equals(""))) {
			resultado = resultado_IS_LONG_METHOD(bruto, dados);
		}else if((dados.getTipo1().equals("LAA") && dados.getTipo2().equals("ATFD")) || (dados.getTipo1().equals("LAA") && dados.getTipo2().equals("")) || (dados.getTipo1().equals("ATFD") && dados.getTipo2().equals("LAA")) || (dados.getTipo1().equals("ATFD") && dados.getTipo2().equals(""))){
			resultado = resultado_FEATURE_ENVY(bruto, dados);
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		utils.DadosParaPesquisa dados = new utils.DadosParaPesquisa("LOC", "CYCLO", "e", 10, 2);
		Metodo m1 = new Metodo("Adicionar", 10, 8, 10, 8, false, false, false, false);
//		Metodo m2 = new Metodo("Remover", 20, 10, 30, 18, false, false, false, false);
//		Metodo m3 = new Metodo("Subtrair", 30, 7, 20, 15, false, false, false, false);
		ArrayList<Metodo> met = new ArrayList<Metodo>();
		met.add(m1);
//		met.add(m2);	
//		met.add(m3);
		Estrutura est1 = new Estrutura(m1, false, "IsLongMethod");
//		Estrutura est2 = new Estrutura(m2, true, "IsLongMethod");
//		Estrutura est3 = new Estrutura(m3, true, "IsLongMethod");
		ArrayList<Estrutura> atest = new ArrayList<Estrutura>();
		atest.add(est1);
//		atest.add(est2);
//		atest.add(est3);
		System.out.println(atest);
		System.out.println(met);
		ArrayList<Estrutura> resultado = distinguirResultado(met, dados);
		System.out.println(resultado);
		
//		ArrayList<Metodo> filtrado = filtrar_Resultados(resultado);
//		System.out.println(filtrado);
//		 
		
	}
	
	
}
