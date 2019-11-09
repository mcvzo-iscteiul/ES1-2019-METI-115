import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Tentativa2 {
	
	private Workbook excel;
	ArrayList<Dados> vec = new ArrayList<>();
	Sheet sheet;
	Row row;
	
	
	public void getDados() throws EncryptedDocumentException, IOException {
		excel = WorkbookFactory.create(new File("../ES/src/Long-Method.xlsx"));
		
	}
}

