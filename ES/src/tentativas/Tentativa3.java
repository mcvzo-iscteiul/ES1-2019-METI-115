package tentativas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tentativa3 {

	private Workbook excel;
	private ArrayList<Double> vec = new ArrayList<>();
	private ArrayList<Double> vec2 = new ArrayList<>();
	private Sheet sheet;
	private Row row;
	private int column; 
	private Dados dados;
	private Boolean palavra = false;
	private Boolean encontrou = false;


	public void getDados(DadosParaPesquisa pesquisa) throws EncryptedDocumentException, IOException {
		excel = WorkbookFactory.create(new File("../ES/src/Long-Method.xlsx"));
		sheet = excel.getSheetAt(0);
		getNumColuna(pesquisa.getTipo1());
		guardarDadosYVetor(vec, column);
		System.out.println(column);
		getNumColuna(pesquisa.getTipo2());
		System.out.println(pesquisa.getTipo2() + " , " + pesquisa.getTipo1());
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


	private void guardarDadosYVetor(ArrayList<Double> vec3,int column2) {
		Iterator<Row> rowIterator = sheet.rowIterator();
		Row row = rowIterator.next();
		while(rowIterator.hasNext()) {
			row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				isString(cell);
				if(cell.getColumnIndex() == column2 && palavra == false) {
					vec3.add((double) cell.getNumericCellValue());
				}else if(cell.getColumnIndex()== column2 && palavra == true) {
					double d = Double.parseDouble(cell.getStringCellValue());
					vec3.add(d);
				}
			}
		}		
	}


	private void isString(Cell cell) {
		if(cell.getCellType().equals(CellType.STRING)) {
			palavra = true;
		}
		else palavra= false;
	}


	public static void main (String [] args) throws EncryptedDocumentException, IOException {
		DadosParaPesquisa pesquisa = new DadosParaPesquisa("LAA", "LOC", "c", "d", "e", 1, 2);
		new Tentativa3().getDados(pesquisa);
	}
}
