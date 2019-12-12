package results;

import java.util.ArrayList;

import utils.Estrutura;
import utils.Metodo;

/**
 * @author catarina_ribeiro
 *
 */
public class QualidadeFerramentas {

	/**
	 * This is a method to check the quality of the PMD tool
	 * @param arrayMaria
	 * @return arrayContadoresPMD
	 */
	public static ArrayList<Integer> PMD_Quality(ArrayList<Metodo> arrayMaria) {
		int DCIPMD = 0, DIIPMD=0, ADIIPMD=0, ADCIPMD=0;
		 ArrayList<Integer> arrayContadoresPMD = new ArrayList<Integer>();	 
		 /** 
	      * Declared four variables DCIPMD, DIIPMD, ADIIPMD, ADCIPMD. 
	      * to easily count the defects found and a list to put them after
	      */		
		for (int i = 0; i < arrayMaria.size(); i++) {
			if (arrayMaria.get(i).getIs_long_method() == true) {
				if (arrayMaria.get(i).getPMD() == true)
					DCIPMD++;
				else ADIIPMD++;
			}else{
				if (arrayMaria.get(i).getPMD() == true)
					DIIPMD++;
				else ADCIPMD++;
			}
			/** 
		      *iterate each the specific count IF:
		      *PMD its TRUE and is_long_method its TRUE;
		      *PMD its TRUE and is_long_method its FALSE;
		      *PMD its FALSE and is_long_method its FALSE;
		      *PMD its FALSE and is_long_method its TRUE.
		      */
		}
		System.out.println("DCI do PMD = " + DCIPMD);
		System.out.println("DII do PMD = " + DIIPMD);
		System.out.println("ADII do PMD = " + ADIIPMD);		
		System.out.println("ADCI do PMD = " + ADCIPMD);
		arrayContadoresPMD.add(DCIPMD);
		arrayContadoresPMD.add(DIIPMD);
		arrayContadoresPMD.add(ADIIPMD);		
		arrayContadoresPMD.add(ADCIPMD);
		System.out.println(arrayContadoresPMD);
		return arrayContadoresPMD;
	}

	/**
	 * This is a method to check the quality of the iPlasma tool
	 * @param arrayMaria
	 * @return arrayContadoresPlasma
	 */
	public static ArrayList<Integer> iPlasma_Quality(ArrayList<Metodo> arrayMaria){
		int DCIPlasma=0, DIIPlasma=0, ADIIPlasma=0, ADCIPlasma=0;
		ArrayList<Integer> arrayContadoresPlasma = new ArrayList<Integer>();
		/** 
	      * Declared four variables DCIPlasma, DIIPlasma, ADIIPlasma, ADCIPlasma. 
	      * to easily count the defects found and a list to put them after
	      */	
		for (int i = 0; i < arrayMaria.size(); i++) {
			if (arrayMaria.get(i).getIs_long_method() == true) {
				if (arrayMaria.get(i).getiPlasma() == true)
					DCIPlasma++;
				else ADIIPlasma++;
			}else{
				if (arrayMaria.get(i).getiPlasma() == true)
					DIIPlasma++;
				else ADCIPlasma++;
			}
			/** 
		      *iterate each the specific count IF:
		      *iPlasma its TRUE and is_long_method its TRUE;
		      *iPlasma its TRUE and is_long_method its FALSE;
		      *iPlasma its FALSE and is_long_method its FALSE;
		      *iPlasma its FALSE and is_long_method its TRUE.
		      */
		}
		System.out.println("DCI do iPlasma = " + DCIPlasma);		
		System.out.println("DII do iPlasma = " + DIIPlasma);
		System.out.println("ADII do iPlasma = " + ADIIPlasma);
		System.out.println("ADCI do iPlasma = " + ADCIPlasma);

		arrayContadoresPlasma.add(DCIPlasma);
		arrayContadoresPlasma.add(DIIPlasma);			
		arrayContadoresPlasma.add(ADIIPlasma);		
		arrayContadoresPlasma.add(ADCIPlasma);
		System.out.println(arrayContadoresPlasma);
		return arrayContadoresPlasma;
	}

	/**
	 * This is a method to check the quality of the rules made by the user
	 * @param arrayMaria
	 * @param arrayMariana
	 * @return arrayContadoresRegras
	 */
	public static ArrayList<Integer> Regras_Quality(ArrayList<Metodo> arrayMaria, ArrayList<Estrutura> arrayMariana){
		int DCIRegras=0, DIIRegras=0, ADIIRegras=0, ADCIRegras=0;
		ArrayList<Integer> arrayContadoresRegras = new ArrayList<Integer>();
		/** 
	      * Declared four variables DCIRegras, DIIRegras, ADIIRegras, ADCIRegras. 
	      * to easily count the defects found and a list to put them after
	      */
		for (int i = 0; i < arrayMaria.size(); i++) {
			if (arrayMaria.get(i).getIs_long_method() == true) {
				if (arrayMariana.get(i).getBol() == true)
					DCIRegras++;
				else ADIIRegras++;
			}else{
				if (arrayMariana.get(i).getBol() == false)
					DIIRegras++;
				else ADCIRegras++;
			}
			/** 
		      *iterate each the specific count IF:
		      *Rule its TRUE and is_long_method its TRUE;
		      *Rule its TRUE and is_long_method its FALSE;
		      *Rule its FALSE and is_long_method its FALSE;
		      *Rule its FALSE and is_long_method its TRUE.
		      *
		      *the Rule column its taken by an arrayList that its filtered with three positions,
		      *first with the method, second with a boolean and third with a String to distinguish
		      *if its Long_Method or Featured_Envy 
		      */
		} 
		System.out.println("DCI das Regras = " + DCIRegras);		
		System.out.println("DII das Regras = " + DIIRegras);
		System.out.println("ADII das Regras = " + ADIIRegras);
		System.out.println("ADCI das Regras = " + ADCIRegras);

		arrayContadoresRegras.add(DCIRegras);
		arrayContadoresRegras.add(DIIRegras);			
		arrayContadoresRegras.add(ADIIRegras);		
		arrayContadoresRegras.add(ADCIRegras);
		System.out.println(arrayContadoresRegras);
		return arrayContadoresRegras;
	}
}


