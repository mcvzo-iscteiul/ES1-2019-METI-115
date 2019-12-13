package testRegras;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import utils.Metodo;

public class MetodoTest {

	private Metodo m;
	private String metodo;
	private double LOC;
	private double CYCLO;
	private double ATFD;
	private double LAA;
	private Boolean is_long_method;
	private Boolean iPlasma;
	private Boolean PMD;
	private Boolean is_feature_envy;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		m = new Metodo("out",2,3,4,5,true,false,true,false);
		metodo = "out";
		LOC= 2;
		CYCLO = 3;
		ATFD = 4;
		LAA = 5;
		is_long_method = true;
		iPlasma = false;
		PMD = true;
		is_feature_envy = false;
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMetodo() {
	Metodo v = new Metodo("out",2,3,4,5,true,false,true,false);
	}

	@Test
	public void testGetMetodo() {
		assertEquals(metodo, "out");
	}

	@Test
	public void testSetMetodo() {
		m.setMetodo("output");
		assertEquals(m.getMetodo(),"output");
	}

	@Test
	public void testGetLOC() {
		assertEquals((int)m.getLOC(),2);
	}

	@Test
	public void testSetLOC() {
		m.setLOC(2);
		assertEquals((int)m.getLOC(),2);
	}

	@Test
	public void testGetCYCLO() {
		assertEquals((int)m.getCYCLO(),3);
	}

	@Test
	public void testSetCYCLO() {
		m.setCYCLO(12);
		assertEquals((int)m.getCYCLO(),12);
	}

	@Test
	public void testGetATFD() {
		assertEquals((int)m.getATFD(),4);
	}

	@Test
	public void testSetATFD() {
		m.setATFD(10);
		assertEquals((int)m.getATFD(),10);
	}

	@Test
	public void testGetLAA() {
		assertEquals((int)m.getLAA(),5);
	}

	@Test
	public void testSetLAA() {
		m.setLAA(7);
		assertEquals((int)m.getLAA(),7);
	}

	@Test
	public void testGetIs_long_method() {
		assertEquals(m.getIs_long_method(),true);
	}

	@Test
	public void testSetIs_long_method() {
		m.setIs_long_method(false);
		assertEquals(m.getIs_long_method(),false);
	}

	@Test
	public void testGetiPlasma() {
		assertEquals(m.getiPlasma(),false);
	}

	@Test
	public void testSetiPlasma() {
		m.setiPlasma(true);
		assertEquals(m.getiPlasma(),true);
	}

	@Test
	public void testGetPMD() {
		assertEquals(m.getPMD(),true);
	}

	@Test
	public void testSetPMD() {
		m.setPMD(true);
		assertEquals(m.getPMD(),true);
	}

	@Test
	public void testGetIs_feature_envy() {
		assertEquals(m.getIs_feature_envy(),false);
	}

	@Test
	public void testSetIs_feature_envy() {
		m.setIs_feature_envy(true);
		assertEquals(m.getIs_feature_envy(),true);
	}

}
