import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class QualidadeFerramentas {
	public static int DCIcount=0;
	public static int DIIcount=0;
	public static int ADCIcount=0;
	public static int ADIIcount=0;

	public static void main(String[] args) throws IOException {

		Workbook workbook = WorkbookFactory.create(new File("../ES/src/teste.xlsx"));
		Sheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.rowIterator();

		Row row = rowIterator.next();
		while(rowIterator.hasNext()) {

			row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();

			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();

//				if(cell.getColumnIndex() == 8 && cell.getBooleanCellValue() == true) {
//					if (cell.getColumnIndex() == 9 && cell.getBooleanCellValue() == true ||
//							cell.getColumnIndex() == 10 && cell.getBooleanCellValue() == true) {
//						DCIcount++;
//					}else 
//						ADIIcount++;
//				}

				if (cell.getColumnIndex() == 8 && cell.getBooleanCellValue() == false) {

					if (cell.getColumnIndex() == 9 && cell.getBooleanCellValue() == false ||
							cell.getColumnIndex() == 10 && cell.getBooleanCellValue() == false) {
						DIIcount++;
					} else 
						ADCIcount++;
				}
			}

		}
		System.out.println("DCI = " + DCIcount);
		System.out.println("DII = " + DIIcount);
		System.out.println("ADCI = " + ADCIcount);
		System.out.println("ADII = " + ADIIcount);
	}
}	

