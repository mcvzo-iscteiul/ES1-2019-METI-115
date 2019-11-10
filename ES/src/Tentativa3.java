

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tentativa3 {

	private Workbook excel;
	private ArrayList<Integer> vec = new ArrayList<>();
	private ArrayList<Integer> vec2 = new ArrayList<>();
	private Sheet sheet;
	private Row row;
	private int column; 
	private ArrayList<Boolean> resultado = new ArrayList<>();
	
	private Boolean palavra = false;
	private Boolean encontrou = false;


	public void getDados(DadosParaPesquisa pesquisa) throws EncryptedDocumentException, IOException {
		excel = WorkbookFactory.create(new File("../ES/src/Long-Method.xlsx"));
		sheet = excel.getSheetAt(0);
		getNumColuna(pesquisa.getTipo1());
		guardarDadosYVetor(vec, column);
		getNumColuna(pesquisa.getTipo2());
		guardarDadosYVetor(vec2, column);
	}


	private void getNumColuna(String tipo1) {
		row = sheet.getRow(0);
		Iterator<Cell> cellIterator = row.cellIterator();
		while(encontrou == false) {
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				if(cell.getStringCellValue().equals(tipo1)) {
					encontrou = true;
					this.column = cell.getColumnIndex();
				}
			}

		}
		encontrou = false;

	}


	private void guardarDadosYVetor(ArrayList<Integer> vec3,int column2) {
		Iterator<Row> rowIterator = sheet.rowIterator();

		Row row = rowIterator.next();
		while(rowIterator.hasNext()) {

			row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();


			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

				if(cell.getColumnIndex() == column2) {
					vec3.add((int) cell.getNumericCellValue());

				}
			}
		}
		
	}




public ArrayList<Integer> getVec() {
		return vec;
	}


	public void setVec(ArrayList<Integer> vec) {
		this.vec = vec;
	}


	public ArrayList<Integer> getVec2() {
		return vec2;
	}


	public void setVec2(ArrayList<Integer> vec2) {
		this.vec2 = vec2;
	}
	
	public void resultado_IS_LONG_METHOD(int val2, int val3, char sinal) {
		char a = '&';
		for (int i = 0; i < this.vec.size(); i++) {
				if(a==sinal && this.vec.get(i)>val2 && this.vec2.get(i)>val3) {
					this.resultado.add(i, true);
				}else if(a!=sinal && (this.vec.get(i)>val2 || this.vec2.get(i)>val3)) {
					this.resultado.add(i, true);
				}
				this.resultado.add(i, false);
				
		}
	}
	
	public void resultado_FEATURE_ENVY(int val2, int val3, char sinal) {
		char a = '&';
		for (int i = 0; i < this.vec.size(); i++) {
				if(a==sinal && this.vec.get(i)>val2 && this.vec2.get(i)<val3) {
					this.resultado.add(i, true);
				}else if(a!=sinal && (this.vec.get(i)>val2 || this.vec2.get(i)<val3)) {
					this.resultado.add(i, true);
				}
				this.resultado.add(i, false);	
		}
	}
	
	public void distinguirResultado(Metrica met1, Metrica met2, int val1, int val2, char sinal) {
		if(met1.equals(Metrica.LOC) && met2.equals(Metrica.CYCLO)) {
			resultado_IS_LONG_METHOD(val1, val2, sinal);
		}else if(met1.equals(Metrica.LAA) && met2.equals(Metrica.ATFD)){
			resultado_FEATURE_ENVY(val1, val2, sinal);
		}
	}

public static void main (String [] args) throws EncryptedDocumentException, IOException {
	DadosParaPesquisa pesquisa = new DadosParaPesquisa("LOC", "CYCLO", "c", "d", "e", 10, 80);
	Tentativa3 ten = new Tentativa3();
	ten.getDados(pesquisa);
	ten.resultado_IS_LONG_METHOD(pesquisa.getLim1(), pesquisa.getLim2(), '&');
	
	}

}
