import java.util.ArrayList;

public class Dados {

	public int x;
	public int y;
	public ArrayList <Dados> vetorLista = new ArrayList<>();


	public Dados(int x, int y) {
		this.x=x;
		this.y=y;

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


	public ArrayList<Dados> getVetorLista() {
		return vetorLista;
	}


	public void setVetorLista(ArrayList<Dados> vetorLista) {
		this.vetorLista = vetorLista;
	}

	public Dados getDados() {
		return this;
	}

	public void criarVetor(int x, int y) {
		Dados vetor = new Dados(x,y);
		ArrayList<Dados> vetorL = new ArrayList<>();
		vetorL.add(vetor);
		this.vetorLista = vetorL;
	}

}
