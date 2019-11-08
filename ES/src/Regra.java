
public class Regra {
	
	private Defeito defeito;
	private int x;
	private int y;
	
	public Regra(Defeito defeito, int x, int y) {
		this.defeito = defeito;
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public Defeito getDefeito() {
		return defeito;
	}
	
	public void setDefeito(Defeito defeito) {
		this.defeito = defeito;
	}
}
