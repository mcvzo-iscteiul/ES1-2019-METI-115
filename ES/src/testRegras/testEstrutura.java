package testRegras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utils.Estrutura;
import utils.Metodo;

class testEstrutura {

	Metodo m1;
	Estrutura est;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		m1 = new Metodo("Adicionar", 10, 8, 10, 8, false, false, false, false);
		est = new Estrutura(m1, false, "IsLongMethod");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetMetodo() {
		assertEquals(m1, est.getMetodo());
	}
	
	@Test
	void testGetBol() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDefeito() {
		fail("Not yet implemented");
	}

}
