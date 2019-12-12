package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import utils.Metodo;

public class MetodoTest {

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
