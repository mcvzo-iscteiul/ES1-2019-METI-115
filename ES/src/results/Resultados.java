package results;
import java.util.ArrayList;

import utils.DadosParaPesquisa;
import utils.Estrutura;
import utils.Metodo;

public class Resultados {
	
	public Resultados() {
		
	}
	
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
	
	public static ArrayList<Metodo> filtrar_Resultados(ArrayList<Estrutura> resultados){
		ArrayList<Metodo> filtrado = new ArrayList<Metodo>();
		for(Estrutura e: resultados) {
			if(e.getBol()==true) {
				filtrado.add(e.getMetodo());
			}
		}
		return filtrado;
	}
	
	public static void main(String[] args) {
		utils.DadosParaPesquisa dados = new utils.DadosParaPesquisa("LOC", "CYCLO", "e", 10, 2);
		Metodo a = new Metodo("Mudar", 2, 30, 4, 5, false, false, false, false);
		Metodo b = new Metodo("Adicionar", 20, 3, 40, 50, false, false, false, false);
		Metodo c = new Metodo("Ativar", 10, 12, 80, 9, false, false, false, false);
		Metodo d = new Metodo("Fechar", 10, 12, 8, 9, false, false, false, false);
		ArrayList<Metodo> met = new ArrayList<Metodo>();
		met.add(a);
		met.add(b);	
		met.add(c);
		met.add(d);
		System.out.println(met);
		ArrayList<Estrutura> resultado = distinguirResultado(met, dados);
		System.out.println(resultado);
//		ArrayList<Metodo> filtrado = filtrar_Resultados(resultado);
//		System.out.println(filtrado);
//		 
		
	}
	
	
}
