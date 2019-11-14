import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.EncryptedDocumentException;

public class QualidadeFerramentas {
	private static ArrayList<Metodo> arrayMaria = new TratamentoDosDadosExcel().guardarDadosMatriz();

	public static ArrayList<Integer> PMD_Quality(){
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

	public static ArrayList<Integer> iPlasma_Quality(){
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

	public static void main(String [] args) throws EncryptedDocumentException, IOException {
		PMD_Quality();
		iPlasma_Quality();
	}
}


