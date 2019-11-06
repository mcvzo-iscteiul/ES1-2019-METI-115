
public class Calculo {

	public Defeitos def;
	
	
	
	
	public boolean devolverValor(Regra regra) {
		if(regra.getDef() == Defeitos.LONG_METHOD) {
			calcularLongMethod(regra);
		}
		return true;
	}



	private void calcularLongMethod(Regra regra) {
		int x = regra.getX();
		int y = regra.getY();
		//if(int)
		
	}
	
	
	
	
}
