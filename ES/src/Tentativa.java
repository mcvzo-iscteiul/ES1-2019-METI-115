
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
 
public class Tentativa {

	private ArrayList<String> vec;
	
	public void lerdados() throws EncryptedDocumentException, IOException {

		Workbook workbook = WorkbookFactory.create(new File("../ES/src/Long-Method.xlsx"));
		Sheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(0);
		Iterator<Cell> cellIterator = row.cellIterator();
		vec = new ArrayList<>();
		while(cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			vec.add(cell.getStringCellValue());
			

				
			}
			System.out.println("Li ficheiro");
		}

		
	public ArrayList<String> getVec() {
		return vec;
	}

}





