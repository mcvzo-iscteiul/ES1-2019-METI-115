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

public class Tentativa2 {

	Workbook excel;
	ArrayList<Dados> vec = new ArrayList<>();
	Sheet sheet;
	Row row;
	int column; 
	Dados dados;
	Boolean palavra = false;
	Boolean encontrou = false;


	public void getDados(DadosParaPesquisa pesquisa) throws EncryptedDocumentException, IOException {
		excel = WorkbookFactory.create(new File("../ES/src/Long-Method.xlsx"));
		sheet = excel.getSheetAt(0);
		getNumColuna(pesquisa.getTipo1());
		guardarDadosXVetor(column);
		dados = new Dados (0,0);
	}




	public void getNumColuna(String tipo1) {
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
		System.out.println(column);
	}



	private void guardarDadosXVetor(int i2) {
		Iterator<Row> rowIterator = sheet.rowIterator();
		while(rowIterator.hasNext()) {
			row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				isString(cell);
				if(palavra == true) {
					dados.setX(cell.getNumericCellValue());
					vec.add(dados);
					palavra = false;
				}
			}
		}
		for(Dados a: vec) {
			System.out.println(a.x);
		}
	}



	private void isString(Cell cell) {
		if(cell.getCellType().equals(CellType.NUMERIC))
			palavra = true;
	}



	public static void main (String args []) throws EncryptedDocumentException, IOException {

		DadosParaPesquisa pesquisa = new DadosParaPesquisa("LOC", "a", "c", "d", "e", 1, 2);		

		new Tentativa2().getDados(pesquisa);
	}

}

