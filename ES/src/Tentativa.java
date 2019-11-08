
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
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;

public class Tentativa {


	public static void lerdados() throws EncryptedDocumentException, IOException {

		ArrayList<Dados> vetor = new ArrayList<>();
		Workbook workbook = WorkbookFactory.create(new File("../ES/src/Long-Method.xlsx"));
		Sheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.rowIterator();

		Row row = sheet.getRow(0);
		Iterator<Cell> cellIterator = row.cellIterator();
		ArrayList<String> vec = new ArrayList<>();
		while(cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			vec.add(cell.getStringCellValue());
				

				
			}
		for(String a: vec) {
			System.out.println(a);
			
		}
		}

		
	


	public static void main(String[] args) throws IOException {
		lerdados();
	}
}





