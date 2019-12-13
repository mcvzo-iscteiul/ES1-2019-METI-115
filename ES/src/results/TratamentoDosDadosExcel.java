package results;

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

import utils.Metodo;

public class TratamentoDosDadosExcel {

	/**
	 * *@author maria
	 * 
	 */
	ArrayList<Metodo> matrizExcel = new ArrayList<>();
	Workbook excel;
	Sheet folha;

	/**
	 * 
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * 
	 *  
	 * This is the constructor of the class
	 * matrizExcel is the vector that has the methods information
	 * excel is the excel that has the information
	 * folha is the sheet that  that has the data
	 *
	 */

	public TratamentoDosDadosExcel() throws EncryptedDocumentException, IOException {
		this.excel =  WorkbookFactory.create(new File("../ES/src/Long-Method.xlsx"));
		this.folha = excel.getSheetAt(0);
	}

	/**
	 * This is a method that constructs the methods and puts it in the vector matrizExcel
	 * 
	 */

	public void guardarDadosMatriz() {
		Iterator <Row> linhaIterator = folha.rowIterator();
		Row linha = linhaIterator.next();
		/**
		 * linhaIterator is the iterator of lines in the first sheet
		 * linha is the line that we will read to take the data and create a method
		 */
		int count = 0;
		while(linhaIterator.hasNext()) {
			Metodo metodo = new Metodo(null, 0, 0, 0, 0, null, null, null, null);
			count++;
			linha = linhaIterator.next();
			Iterator <Cell> celulaIterator = linha.cellIterator();
			/**
			 * 
			 */
			while(celulaIterator.hasNext()) {
				Cell celula = celulaIterator.next();	
				guardarDadosNoVetor(celula, metodo);

			}this.matrizExcel.add(metodo);
		}for(Metodo a: matrizExcel) {
			System.out.println(a.getMetodo() + ", " + a.getLOC() + ", " + a.getCYCLO() + ", " + a.getATFD()+ ", " + a.getLAA() + ", " + a.getIs_long_method() + ", " + a.getiPlasma() + ", " + a.getPMD() + ", " + a.getIs_feature_envy());
		}
		
	}

	/**
	 * This method checks which number of the column is and sets the value of the method
	 * if the number oh column is 3 it gets the value of the cell and uses to set the method value
	 * if the number oh column is 4 it gets the value of the cell and uses to set the LOC value
	 * if the number oh column is 5 it gets the value of the cell and uses to set the CYCLO value
	 * if the number oh column is 6 it gets the value of the cell and uses to set the ATFD value
	 * if the number oh column is 7 it checks if the Cell Value is Numeric or a string. if it is a string it changes the type for the type numeric and gets the value of the cell and uses to set the LAA value
	 * if the number oh column is 8 it gets the value of the cell and uses to set the method value
	 * if the number oh column is 9 it gets the value of the cell and uses to set the is_long_method value
	 * if the number oh column is 10 it gets the value of the cell and uses to set the iPlasma value
	 * if the number oh column is 11 it gets the value of the cell and uses to set the is feature_envy value
	 * 
	 * @param celula
	 * @param metodo
	 * This method 
	 */
	private void guardarDadosNoVetor(Cell celula, Metodo metodo) {
		switch(celula.getColumnIndex()) { 
		case(3):
			metodo.setMetodo(celula.getStringCellValue());
		break;
		case(4):
			metodo.setLOC(celula.getNumericCellValue());
		break;
		case(5): 
			metodo.setCYCLO(celula.getNumericCellValue());
		break;
		case(6): 
			metodo.setATFD(celula.getNumericCellValue());
		break;
		case(7): 
			if(celula.getCellType().equals(CellType.NUMERIC)) {
				metodo.setLAA(celula.getNumericCellValue());
			}else if(celula.getCellType().equals(CellType.STRING)) {
				metodo.setLAA(Double.parseDouble(celula.getStringCellValue()));
			}
		break;
		case(8): 
			stringBoolean(celula);
		metodo.setIs_long_method(celula.getBooleanCellValue());
		break;
		case(9): 
			stringBoolean(celula);
		metodo.setiPlasma(celula.getBooleanCellValue());
		break;
		case(10): 
			stringBoolean(celula);
		metodo.setPMD(celula.getBooleanCellValue());
		break;
		case(11): 
			stringBoolean(celula);
		metodo.setIs_feature_envy(celula.getBooleanCellValue());				
		break;
		}
	}

	/**
	 * This method checks if the parameter received (the cell) is a String. If it is it changes the cell type to a boolean type
	 * @param cell
	 */
	private void stringBoolean(Cell cell) {
		if(cell.getCellType().equals(CellType.STRING)) {
			cell.setCellType(CellType.BOOLEAN);
		}
	}
	
	
	public ArrayList<Metodo> getMatrizExcel() {
		return matrizExcel;
	}
	
	

	/**
	 * 
	 * @param args
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static void main(String [] args) throws EncryptedDocumentException, IOException {
		new TratamentoDosDadosExcel().guardarDadosMatriz();
	}
}