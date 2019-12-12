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
	DadosParaPesquisa dados2;
	DadosParaPesquisa dados3;
	DadosParaPesquisa dados4;
	DadosParaPesquisa dados5;
	DadosParaPesquisa dados6;
	DadosParaPesquisa dados7;
	DadosParaPesquisa dados8;
	Metodo m1;
	Metodo m2;
	Metodo m3;
	Metodo m11;
	ArrayList<Metodo> amet;
	ArrayList<Metodo> amet1;
	Estrutura est1;
	Estrutura est2;
	Estrutura est3;
	Estrutura est11;
	ArrayList<Estrutura> atest;
	ArrayList<Estrutura> atest1;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		dados1 = new DadosParaPesquisa("LOC", "CYCLO", "e", 10, 2);
		dados2 = new DadosParaPesquisa("LOC", "", "e", 10, 2);
		dados3 = new DadosParaPesquisa("CYCLO", "", "e", 2, 10);
		dados4 = new DadosParaPesquisa("CYCLO", "LOC", "e", 2, 10);
		dados5 = new DadosParaPesquisa("LOC", "CYCLO", "ou", 10, 2);
		dados6 = new DadosParaPesquisa("LOC", "", "ou", 10, 2);
		dados7 = new DadosParaPesquisa("CYCLO", "", "ou", 2, 10);
		dados8 = new DadosParaPesquisa("CYCLO", "LOC", "ou", 2, 10);
		m1 = new Metodo("Adicionar", 10, 8, 10, 8, false, false, false, false);
		m2 = new Metodo("Remover", 20, 10, 30, 18, false, false, false, false);
		m3 = new Metodo("Subtrair", 30, 7, 20, 15, false, false, false, false);
		m11 = new Metodo("Adicionar", 10, 1, 10, 8, false, false, false, false);
		amet = new ArrayList<Metodo>();
		amet1 = new ArrayList<Metodo>();
		amet.add(m1);
		amet.add(m2);
		amet.add(m3);
		amet1.add(m11);
		amet1.add(m2);
		amet1.add(m3);
		est1 = new Estrutura(m1, false, "IsLongMethod");
		est2 = new Estrutura(m2, true, "IsLongMethod");
		est3 = new Estrutura(m3, true, "IsLongMethod");
		est11 = new Estrutura(m1, true, "IsLongMethod");
		atest = new ArrayList<Estrutura>();
		atest1 = new ArrayList<Estrutura>();
		atest.add(est1);
		atest.add(est2);
		atest.add(est3);
		atest1.add(est11);
		atest1.add(est2);
		atest1.add(est3);
	}

	@AfterEach
	void tearDown() throws Exception {
		amet = new ArrayList<Metodo>();
		atest = new ArrayList<Estrutura>();
	}

	@Test
	void testResultado_IS_LONG_METHOD() {
		assertEquals(atest.toString(), Resultados.resultado_IS_LONG_METHOD(amet, dados1).toString());
		assertEquals(atest.toString(), Resultados.resultado_IS_LONG_METHOD(amet, dados2).toString());
		assertEquals(atest1.toString(), Resultados.resultado_IS_LONG_METHOD(amet, dados3).toString());
		assertEquals(atest.toString(), Resultados.resultado_IS_LONG_METHOD(amet, dados4).toString());
		assertEquals(atest.toString(), Resultados.resultado_IS_LONG_METHOD(amet1, dados5).toString());
		
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
