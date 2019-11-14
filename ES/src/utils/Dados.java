package utils;
import java.util.ArrayList;

public class Dados {

	public double x;
	public double y;
	public ArrayList <Dados> vetorLista = new ArrayList<>();


	public Dados(double x, int y) {
		this.x=x;
		this.y=y;

	}
	

	public double getX() {
		return x;
	}


	public void setX(double d) {
		this.x = d;
	}


	public double getY() {
		return y;
	}


	public void setY(double d) {
		this.y = d;
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