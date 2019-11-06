import java.util.ArrayList;

public class Calculo {

	public Defeitos def;
	public ArrayList<Dados> dados = new ArrayList<>();
	public ArrayList<Boolean> valor = new ArrayList<>();
	
	
	public Calculo(Defeitos def, ArrayList<Dados> dados, ArrayList<Boolean> valor) {
		this.def=def;
		this.dados=dados;
		this.valor=valor;
	}
	
	public void criarVect(ArrayList dados) {
		this.dados=dados;
	}
	
	public boolean devolverValor(Regra regra) {
		if(regra.getDef() == Defeitos.LONG_METHOD) {
			calcularLongMethod(regra, this.dados);
		}
		return true;
	}
	
	
	
	
	private boolean calcularLongMethod(Regra regra, ArrayList<Dados> dados2) {
		int x = regra.getX();
		int y = regra.getY();
		for(Dados a: dados2) {
			if(a.getX()>regra.getX() && a.getY()>regra.getY())
				return true;
		}
		
		return false;
		
		
	}
	
	
	
	
}
