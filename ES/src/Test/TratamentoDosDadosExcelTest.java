package Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import utils.Metodo;

public class TratamentoDosDadosExcelTest {

	ArrayList<Metodo> matrizExcel = new ArrayList<>();
	Workbook excel;
	Sheet folha;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTratamentoDosDadosExcel() throws EncryptedDocumentException, IOException {
		this.excel =  WorkbookFactory.create(new File("../ES/src/Long-Method.xlsx"));
		this.folha = excel.getSheetAt(0);
		
	}



	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}
