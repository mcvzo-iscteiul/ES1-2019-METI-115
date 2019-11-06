import java.util.ArrayList;

public class Calculo {

	public Defeitos def;
	public ArrayList<Dados> dados = new ArrayList<>();
	public ArrayList<Boolean> valor = new ArrayList<>();
	
	
	public boolean devolverValor(Regra regra) {
		if(regra.getDef() == Defeitos.LONG_METHOD) {
			calcularLongMethod(regra);
		}
		return true;
	}
	
	
	private boolean calcularLongMethod(Regra regra) {
		int x = regra.getX();
		int y = regra.getY();
		
		return false;
		
		
	}
	
	
	
	
}
