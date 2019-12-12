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

class ResultadosTest {

	DadosParaPesquisa dados1;
	DadosParaPesquisa dados2;
	DadosParaPesquisa dados3;
	DadosParaPesquisa dados4;
	DadosParaPesquisa dados5;
	DadosParaPesquisa dados6;
	DadosParaPesquisa dados7;
	DadosParaPesquisa dados8;
	DadosParaPesquisa dados9;
	DadosParaPesquisa dados10;
	DadosParaPesquisa dados11;
	DadosParaPesquisa dados12;
	DadosParaPesquisa dados13;
	DadosParaPesquisa dados14;
	DadosParaPesquisa dados15;
	DadosParaPesquisa dados16;
	Metodo m1;
	Metodo m2;
	Metodo m3;
	Metodo m11;
	Metodo m12;
	Metodo m13;
	ArrayList<Metodo> amet;
	ArrayList<Metodo> amet1;
//	ArrayList<Metodo> amet2;
	Estrutura est1;
	Estrutura est2;
	Estrutura est3;
	Estrutura est11;
	Estrutura est12;
	Estrutura est4;
	Estrutura est5;
	Estrutura est6;
//	Estrutura est7;
	ArrayList<Estrutura> atest;
	ArrayList<Estrutura> atest1;
//	ArrayList<Estrutura> atest2;
	
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
		dados9 = new DadosParaPesquisa("LAA", "ATFD", "e", 9, 9);
		dados10 = new DadosParaPesquisa("LAA", "", "e", 9, 11);
		dados11 = new DadosParaPesquisa("ATFD", "", "e", 9, 9);
		dados12 = new DadosParaPesquisa("ATFD", "LAA", "e", 9, 9);
		dados13 = new DadosParaPesquisa("LAA", "ATFD", "ou", 9, 9);
		dados14 = new DadosParaPesquisa("LAA", "", "ou", 9, 2);
		dados15 = new DadosParaPesquisa("ATFD", "", "ou", 9, 10);
		dados16 = new DadosParaPesquisa("ATFD", "LAA", "ou", 9, 9);
		m1 = new Metodo("Adicionar", 10, 8, 10, 8, false, false, false, false);
		m2 = new Metodo("Remover", 20, 10, 30, 18, false, false, false, false);
		m3 = new Metodo("Subtrair", 30, 7, 20, 15, false, false, false, false);
		m11 = new Metodo("Adicionar", 10, 1, 10, 28, false, false, false, false);
		m12 = new Metodo("Remover", 20, 10, 8, 18, false, false, false, false);
		m13 = new Metodo("Subtrair", 30, 7, 7, 15, false, false, false, false);
		amet = new ArrayList<Metodo>();
		amet1 = new ArrayList<Metodo>();
		amet.add(m1);
		amet.add(m2);
		amet.add(m3);
		amet1.add(m11);
		amet1.add(m12);
		amet1.add(m13);
		est1 = new Estrutura(m1, false, "IsLongMethod");
		est2 = new Estrutura(m2, true, "IsLongMethod");
		est3 = new Estrutura(m3, true, "IsLongMethod");
		est11 = new Estrutura(m1, true, "IsLongMethod");
		est4 = new Estrutura(m1, true, "FeatureEnvy");
		est5 = new Estrutura(m2, false, "FeatureEnvy");
		est6 = new Estrutura(m3, false, "FeatureEnvy");
//		est7 = new Estrutura(m11, true, "FeatureEnvy");
		atest = new ArrayList<Estrutura>();
		atest1 = new ArrayList<Estrutura>();
//		atest2 = new ArrayList<Estrutura>();
		atest.add(est1);
		atest.add(est2);
		atest.add(est3);
		atest1.add(est4);
		atest1.add(est5);
		atest1.add(est6);
//		atest2.add(est7);
//		atest2.add(est5);
//		atest2.add(est6);
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
		
	}

	@Test
	void testDistinguirResultado() {
		assertEquals(atest.toString(), Resultados.distinguirResultado(amet, dados1).toString());
		assertEquals(atest.toString(), Resultados.distinguirResultado(amet, dados2).toString());
		assertEquals(atest.toString(), Resultados.distinguirResultado(amet1, dados3).toString());
		assertEquals(atest.toString(), Resultados.distinguirResultado(amet, dados4).toString());
		assertEquals(atest.toString(), Resultados.distinguirResultado(amet1, dados5).toString());
		assertEquals(atest.toString(), Resultados.distinguirResultado(amet, dados6).toString());
		assertEquals(atest.toString(), Resultados.distinguirResultado(amet1, dados7).toString());
		assertEquals(atest.toString(), Resultados.distinguirResultado(amet1, dados8).toString());
		assertEquals(atest1.toString(), Resultados.distinguirResultado(amet, dados9).toString());
		assertEquals(atest1.toString(), Resultados.distinguirResultado(amet, dados10).toString());
		assertEquals(atest1.toString(), Resultados.distinguirResultado(amet1, dados11).toString());
		assertEquals(atest1.toString(), Resultados.distinguirResultado(amet, dados12).toString());
		assertEquals(atest1.toString(), Resultados.distinguirResultado(amet1, dados13).toString());
		assertEquals(atest1.toString(), Resultados.distinguirResultado(amet, dados14).toString());
		assertEquals(atest1.toString(), Resultados.distinguirResultado(amet1, dados15).toString());
		assertEquals(atest1.toString(), Resultados.distinguirResultado(amet1, dados16).toString());
	}

}
