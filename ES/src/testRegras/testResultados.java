package testRegras;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import results.Resultados;
import utils.DadosParaPesquisa;
import utils.Estrutura;
import utils.Metodo;

class testResultados {

	DadosParaPesquisa dados1;
	Metodo m1;
	Metodo m2;
	Metodo m3;
	ArrayList<Metodo> amet;
	Estrutura est1;
	Estrutura est2;
	Estrutura est3;
	ArrayList<Estrutura> atest;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		dados1 = new DadosParaPesquisa("LOC", "CYCLO", "e", 10, 2);
		m1 = new Metodo("Adicionar", 10, 8, 10, 8, false, false, false, false);
		m2 = new Metodo("Remover", 20, 10, 30, 18, false, false, false, false);
		m3 = new Metodo("Subtrair", 30, 7, 20, 15, false, false, false, false);
		amet = new ArrayList<Metodo>();
		amet.add(m1);
		amet.add(m2);
		amet.add(m3);
		est1 = new Estrutura(m1, false, "IsLongMethod");
		est2 = new Estrutura(m2, true, "IsLongMethod");
		est3 = new Estrutura(m3, true, "IsLongMethod");
		atest = new ArrayList<Estrutura>();
		atest.add(est1);
		atest.add(est2);
		atest.add(est3);
	}

	@AfterEach
	void tearDown() throws Exception {
		amet = new ArrayList<Metodo>();
		atest = new ArrayList<Estrutura>();
	}

	@Test
	void testResultado_IS_LONG_METHOD() {
		assertEquals(atest.toString(), Resultados.resultado_IS_LONG_METHOD(amet, dados1).toString());
	}

	@Test
	void testResultado_FEATURE_ENVY() {
		fail("Not yet implemented");
	}

	@Test
	void testDistinguirResultado() {
		fail("Not yet implemented");
	}

}
