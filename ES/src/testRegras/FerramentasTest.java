package testRegras;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import results.QualidadeFerramentas;
import utils.Estrutura;
import utils.Metodo;

public class FerramentasTest {

	ArrayList<Metodo> listaTeste = new ArrayList<>();
	ArrayList<Integer> expectedPMD = new ArrayList<Integer>();
	ArrayList<Integer> expectedPlasma = new ArrayList<Integer>();
	ArrayList<Estrutura> listaRegras = new ArrayList<>();
	ArrayList<Integer> expectedRegras = new ArrayList<>();


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Metodo metodo1 = new Metodo("Construtor",1,2,3,4,true,true,true,true);
		Metodo metodo2 = new Metodo("Adicionar",1,2,3,4,true,true,false,true);
		Metodo metodo3 = new Metodo("Remover",1,2,3,4,false,true,true,true);
		Metodo metodo4 = new Metodo("Copiar",1,2,3,4,false,true,false,true);
		Metodo metodo5 = new Metodo("Ver",1,2,3,4,false,false,false,true);
		Metodo metodo6 = new Metodo("Contar",1,2,3,4,true,false,false,true);

		listaTeste.add(metodo1);
		listaTeste.add(metodo2);
		listaTeste.add(metodo3);
		listaTeste.add(metodo4);
		listaTeste.add(metodo5);
		listaTeste.add(metodo6);

		expectedPMD.add(1);
		expectedPMD.add(1);
		expectedPMD.add(2);
		expectedPMD.add(2);	

		expectedPlasma.add(2);
		expectedPlasma.add(2);
		expectedPlasma.add(1);
		expectedPlasma.add(1);

		Estrutura e1 = new Estrutura(metodo1, true, "IsLongMethod");
		Estrutura e2 = new Estrutura(metodo2, true,"IsLongMethod");
		Estrutura e3 = new Estrutura(metodo3, true,"IsLongMethod");
		Estrutura e4 = new Estrutura(metodo4, false,"IsLongMethod");
		Estrutura e5 = new Estrutura(metodo5, true,"IsLongMethod");
		Estrutura e6 = new Estrutura(metodo6, false,"IsLongMethod");
		listaRegras.add(e1);
		listaRegras.add(e2);
		listaRegras.add(e3);
		listaRegras.add(e4);
		listaRegras.add(e5);
		listaRegras.add(e6);
		

		expectedRegras.add(2);
		expectedRegras.add(1);
		expectedRegras.add(1);
		expectedRegras.add(2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPMD_Quality() {
		assertEquals(expectedPMD, QualidadeFerramentas.PMD_Quality(listaTeste)); 
		assertNotEquals(expectedPlasma, QualidadeFerramentas.PMD_Quality(listaTeste));
	}

	@Test
	public void testIPlasma_Quality() {
		assertEquals(expectedPlasma, QualidadeFerramentas.iPlasma_Quality(listaTeste));
		assertNotEquals(expectedPMD, QualidadeFerramentas.iPlasma_Quality(listaTeste));
	}

	@Test
	public void testRegras_Quality() {
		assertEquals(expectedRegras, QualidadeFerramentas.Regras_Quality(listaTeste, listaRegras));
		assertNotEquals(expectedPMD, QualidadeFerramentas.iPlasma_Quality(listaTeste));
	}
}
