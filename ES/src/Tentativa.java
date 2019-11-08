import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;

public class Tentativa {


	public static void main(String[] args) throws IOException {

		ArrayList<Dados> vetor = new ArrayList<>();
		Workbook workbook = WorkbookFactory.create(new File("../ES/src/Long-Method.xlsx"));
		Sheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.rowIterator();
		
		Row row = rowIterator.next();
		while(rowIterator.hasNext()) {

			row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			Dados dados = new Dados(1,2);

			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

				if(cell.getColumnIndex() == 4) {
					
					dados.setX((cell.getNumericCellValue()));
					vetor.add(dados);
					
				}
				else if(cell.getColumnIndex()==5) {
					dados.setY(cell.getNumericCellValue());
					vetor.add(dados);
				}
			}
		}
		
		for(Dados a: vetor) {
			System.out.println(a.getX() + "," + a.getY());
		}
	}

}






