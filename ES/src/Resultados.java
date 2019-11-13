import java.util.ArrayList;

public class Resultados {
	
	private ArrayList<Metodos> metodos = new ArrayList<Metodos>();
	private ArrayList<Integer> val0 = new Tentativa3().getVec();
	private ArrayList<Integer> val1 = new Tentativa3().getVec2();
	private ArrayList<Boolean> resultado = new ArrayList<>();
	
	public Resultados() {
		
	}
	
	//public ArrayList<Metodos> tentativaILM(ArrayList<Metodos> bruto, )
	
	
	
	
	
	
	
	
	public void resultado_IS_LONG_METHOD(int val2, int val3, String sinal) {
		
		for (int i = 0; i < this.val0.size(); i++) {
				if(sinal.equals("e") && this.val0.get(i)>val2 && this.val1.get(i)>val3) {
					System.out.println("ola");
					this.resultado.add(i, true);
				}else if(sinal.equals("ou") && (this.val0.get(i)>val2 || this.val1.get(i)>val3)) {
					this.resultado.add(i, true);
				}
				this.resultado.add(i, false);
				
		}
		
	}
	
	public void resultado_FEATURE_ENVY(int val2, int val3, String sinal) {
		
		for (int i = 0; i < this.val0.size(); i++) {
				if(sinal.equals("e") && this.val0.get(i)>val2 && this.val1.get(i)<val3) {
					this.resultado.add(i, true);
				}else if(sinal.equals("ou") && (this.val0.get(i)>val2 || this.val1.get(i)<val3)) {
					this.resultado.add(i, true);
				}
				this.resultado.add(i, false);	
		}
	}

	public void distinguirResultado(String met1, String met2, int val1, int val2, String sinal) {
		if((met1.equals("LOC") && met2.equals("CYCLO")) || (met1.equals("LOC") && met2.equals(null)) || (met1.equals("CYCLO") && met2.equals("LOC")) || (met1.equals("CYCLO") && met2.equals(null))) {
			resultado_IS_LONG_METHOD(val1, val2, sinal);
		}else if((met1.equals("LAA") && met2.equals("ATFD")) || (met1.equals("LAA") && met2.equals(null)) || (met1.equals("ATFD") && met2.equals("LAA")) || (met1.equals("ATFD") && met2.equals(null))){
			resultado_FEATURE_ENVY(val1, val2, sinal);
		}
	}
	
//	public ArrayList<Metodos> filtrar_Resultados(ArrayList<Metodos> resultados){
		
//	}
	
	
	
}
