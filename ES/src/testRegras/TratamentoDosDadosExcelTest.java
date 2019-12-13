package testRegras;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import results.TratamentoDosDadosExcel;
import utils.Metodo;

class TratamentoDosDadosExcelTest {

	TratamentoDosDadosExcel exc;

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		exc = new TratamentoDosDadosExcel();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTratamentoDosDadosExcel() {
	}

	@Test
	void testGuardarDadosMatriz() {
		exc.guardarDadosMatriz();
		
	
	}

	@Test
	void testGetMatrizExcel() {
	exc.guardarDadosMatriz();
	assertEquals(exc.getMatrizExcel().size(),420);
	}

	@Test
	void testMain() {
		
	}

}
