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


	ArrayList<Metodo> matrizExcel = new ArrayList<>();
	Workbook excel;
	Sheet folha;

	public TratamentoDosDadosExcel() throws EncryptedDocumentException, IOException {
		this.excel =  WorkbookFactory.create(new File("../ES/src/Long-Method.xlsx"));
		this.folha = excel.getSheetAt(0);
	}

	public void guardarDadosMatriz() {
		Iterator <Row> linhaIterator = folha.rowIterator();
		Row linha = linhaIterator.next();
		while(linhaIterator.hasNext()) {
			Metodo metodo = new Metodo("a",1,2,3,4,true,true,true,true);
			linha = linhaIterator.next();
			Iterator <Cell> celulaIterator = linha.cellIterator();
			while(celulaIterator.hasNext()) {
				Cell celula = celulaIterator.next();	
				guardarDadosNoVetor(celula, metodo);

			}this.matrizExcel.add(metodo);
		}for(Metodo a: matrizExcel) {
			System.out.println(a.getMetodo() + ", " + a.getLOC() + ", " + a.getCYCLO() + ", " + a.getATFD()+ ", " + a.getLAA() + ", " + a.getIs_long_method() + ", " + a.getiPlasma() + ", " + a.getPMD() + ", " + a.getIs_feature_envy());
		}
	}


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


	private void stringBoolean(Cell cell) {
		if(cell.getCellType().equals(CellType.STRING)) {
			cell.setCellType(CellType.BOOLEAN);
		}
	}

	public static void main(String [] args) throws EncryptedDocumentException, IOException {
		new TratamentoDosDadosExcel().guardarDadosMatriz();
	}
}