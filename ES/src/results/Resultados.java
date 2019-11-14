package results;
import java.util.ArrayList;

import utils.Metodo;

public class Resultados {
	
	public Resultados() {
		
	}
	
	public static ArrayList<Estrutura> resultado_IS_LONG_METHOD(ArrayList<Metodo> bruto, String met1, String met2, double val2, double val3, String sinal) {
		ArrayList<Estrutura> resultado = new ArrayList<Estrutura>();
		for(Metodo m: bruto) {
			if(sinal.equals("e")) {
				if(met1.equals("LOC") && met2.equals("CYCLO")) {
					if(m.getLOC()>val2 && m.getCYCLO()>val3) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("LOC") && met2.equals("")) {
					if(m.getLOC()>val2) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("CYCLO") && met2.equals("LOC")) {
					if(m.getCYCLO()>val2 && m.getLOC()>val3){
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("CYCLO") && met2.equals("")) {
					if(m.getCYCLO()>val2) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}
			}else if(sinal.equals("ou")) {
				if(met1.equals("LOC") && met2.equals("CYCLO")) {
					if(m.getLOC()>val2 || m.getCYCLO()>val3) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("LOC") && met2.equals("")) {
					if(m.getLOC()>val2) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("CYCLO") && met2.equals("LOC")) {
					if(m.getCYCLO()>val2 || m.getLOC()>val3){
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("CYCLO") && met2.equals("")) {
					if(m.getCYCLO()>val2) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}
			}
		}
		return resultado;
		
	}
	
	public static ArrayList<Estrutura> resultado_FEATURE_ENVY(ArrayList<Metodo> bruto, String met1, String met2, double val2, double val3, String sinal) {
		ArrayList<Estrutura> resultado = new ArrayList<Estrutura>();
		for(Metodo m: bruto) {
			if(sinal.equals("e")) {
				if(met1.equals("LAA") && met2.equals("ATFD")) {
					if(m.getLAA()>val2 && m.getATFD()>val3) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("LAA") && met2.equals("")) {
					if(m.getLAA()>val2) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("ATFD") && met2.equals("LAA")) {
					if(m.getATFD()>val2 && m.getLAA()>val3){
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("ATFD") && met2.equals("")) {
					if(m.getATFD()>val2) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}
			}else if(sinal.equals("ou")) {
				if(met1.equals("LAA") && met2.equals("ATFD")) {
					if(m.getLAA()>val2 || m.getATFD()>val3) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("LAA") && met2.equals("")) {
					if(m.getLAA()>val2) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("ATFD") && met2.equals("LAA")) {
					if(m.getATFD()>val2 || m.getLAA()>val3){
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}else if(met1.equals("ATFD") && met2.equals("")) {
					if(m.getATFD()>val2) {
						resultado.add(new Estrutura(m, true));
						continue;
					}
					resultado.add(new Estrutura(m, false));
				}
			}
		}
		return resultado;

	}

	public static ArrayList<Estrutura> distinguirResultado(ArrayList<Metodo> bruto, String met1, String met2, double val1, double val2, String sinal) {
		ArrayList<Estrutura> resultado = new ArrayList<Estrutura>();
		if((met1.equals("LOC") && met2.equals("CYCLO")) || (met1.equals("LOC") && met2.equals("")) || (met1.equals("CYCLO") && met2.equals("LOC")) || (met1.equals("CYCLO") && met2.equals(""))) {
			resultado = resultado_IS_LONG_METHOD(bruto, met1, met2, val1, val2, sinal);
		}else if((met1.equals("LAA") && met2.equals("ATFD")) || (met1.equals("LAA") && met2.equals("")) || (met1.equals("ATFD") && met2.equals("LAA")) || (met1.equals("ATFD") && met2.equals(""))){
			resultado = resultado_FEATURE_ENVY(bruto, met1, met2, val1, val2, sinal);
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
		utils.DadosParaPesquisa dados = new utils.DadosParaPesquisa("CYCLO", "", null, null, "e", 10, 0);
		Metodo a = new Metodo("Mudar", 2, 30, 4, 5, false, false, false, false);
		Metodo b = new Metodo("Adicionar", 20, 3, 40, 50, false, false, false, false);
		Metodo c = new Metodo("Ativar", 10, 12, 80, 9, false, false, false, false);
		Metodo d = new Metodo("Ativar", 10, 12, 8, 9, false, false, false, false);
		ArrayList<Metodo> met = new ArrayList<Metodo>();
		met.add(a);
		met.add(b);	
		met.add(c);
		met.add(d);
		System.out.println(met);
		ArrayList<Estrutura> resultado = distinguirResultado(met, dados.getTipo1(), dados.getTipo2(), dados.getLim1(), dados.getLim2(), dados.getJunt());
		System.out.println(resultado);
		ArrayList<Metodo> filtrado = filtrar_Resultados(resultado);
		System.out.println(filtrado);
		 
		
	}
	
	
}
