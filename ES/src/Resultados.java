import java.util.ArrayList;

public class Resultados {
	
	private ArrayList<Integer> val0 = new Tentativa3().getVec();
	private ArrayList<Integer> val1 = new Tentativa3().getVec2();
	private ArrayList<Boolean> resultado = new ArrayList<>();
	
	public Resultados() {
		
	}
	
	public void resultado_IS_LONG_METHOD(int val2, int val3, char sinal) {
		char a = '&';
		
		for (int i = 0; i < this.val0.size(); i++) {
				if(a==sinal && this.val0.get(i)>val2 && this.val1.get(i)>val3) {
					System.out.println("ola");
					this.resultado.add(i, true);
				}else if(a!=sinal && (this.val0.get(i)>val2 || this.val1.get(i)>val3)) {
					this.resultado.add(i, true);
				}
				this.resultado.add(i, false);
				
		}
		for(Integer b : this.val0) {
		System.out.println(b);
		}
	}
	
	public void resultado_FEATURE_ENVY(int val2, int val3, char sinal) {
		char a = '&';
		for (int i = 0; i < this.val0.size(); i++) {
				if(a==sinal && this.val0.get(i)>val2 && this.val1.get(i)<val3) {
					this.resultado.add(i, true);
				}else if(a!=sinal && (this.val0.get(i)>val2 || this.val1.get(i)<val3)) {
					this.resultado.add(i, true);
				}
				this.resultado.add(i, false);	
		}
	}

	public static void main(String[] args) {
		new Resultados().resultado_IS_LONG_METHOD(10, 80, '&');
	}
	
}
