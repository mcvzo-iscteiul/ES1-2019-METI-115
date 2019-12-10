package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utils.Metodo;

class MetodoTest {
	private Metodo m = new Metodo("out",2,3,4,5,true,false,true,false);
	private String metodo = "out";
	private double LOC = 2;
	private double CYCLO = 3;
	private double ATFD = 4;
	private double LAA = 5;
	private Boolean is_long_method = true;
	private Boolean iPlasma = false;
	private Boolean PMD = true;
	private Boolean is_feature_envy = false;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		String metodo;
		double LOC;
		double CYCLO;
		double ATFD;
		double LAA;
		Boolean is_long_method;
		Boolean iPlasma;
		Boolean PMD;
		Boolean is_feature_envy;
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}



	@Test
	void testGetMetodo() {
		assertEquals(metodo, "out");
	}


	@Test
	void testGetLOC() {
		assertEquals((int)m.getLOC(),2);
	}



	@Test
	void testGetCYCLO() {
		assertEquals((int)m.getCYCLO(),3);
	}



	@Test
	void testGetATFD() {
		assertEquals((int)m.getATFD(),4);
	}



	@Test
	void testGetLAA() {
		assertEquals((int)m.getLAA(),5);;
	}


	@Test
	void testGetIs_long_method() {
		assertEquals(m.getIs_long_method(),true);;
	}



	@Test
	void testGetiPlasma() {
		assertEquals(m.getiPlasma(),false);
	}


	@Test
	void testGetPMD() {
		assertEquals(m.getPMD(),true);
	}



	@Test
	void testGetIs_feature_envy() {
		assertEquals(m.getIs_feature_envy(),false);
	}


}
