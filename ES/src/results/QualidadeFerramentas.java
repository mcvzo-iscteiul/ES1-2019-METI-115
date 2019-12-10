package results;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.EncryptedDocumentException;

import utils.Estrutura;
import utils.Metodo;

public class QualidadeFerramentas {
	
	public static ArrayList<Integer> PMD_Quality(ArrayList<Metodo> arrayMaria) {
		int DCIPMD = 0, DIIPMD=0, ADIIPMD=0, ADCIPMD=0;
		ArrayList<Integer> arrayContadoresPMD = new ArrayList<Integer>();
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

	public static ArrayList<Integer> iPlasma_Quality(ArrayList<Metodo> arrayMaria){
		int DCIPlasma=0, DIIPlasma=0, ADIIPlasma=0, ADCIPlasma=0;
		ArrayList<Integer> arrayContadoresPlasma = new ArrayList<Integer>();
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
	
	public static ArrayList<Integer> Regras_Quality(ArrayList<Metodo> arrayMaria, ArrayList<Estrutura> arrayMariana){
		int DCIRegras=0, DIIRegras=0, ADIIRegras=0, ADCIRegras=0;
		ArrayList<Integer> arrayContadoresRegras = new ArrayList<Integer>();
		for (int i = 0; i < arrayMariana.size(); i++) {
			if (arrayMaria.get(i).getIs_long_method() == true) {
				if (arrayMariana.get(i).getBol() == true)
					DCIRegras++;
				else ADIIRegras++;
			}else{
				if (arrayMaria.get(i).getiPlasma() == true)
					DIIRegras++;
				else ADCIRegras++;
			}
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

	public static void main(String [] args) {
		PMD_Quality(null);
		iPlasma_Quality(null);
	}
}


