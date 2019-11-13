import java.util.ArrayList;

public class QualidadeFerramentas {
	public static int DCIcount=0;
	public static int DIIcount=0;
	public static int ADCIcount=0;
	public static int ADIIcount=0;
	public static ArrayList<Metodos> arrayMariana;
	public static ArrayList<Boolean> resultadoIsLongMeth;
	public static ArrayList<Boolean> resultadoPMD;
	public static ArrayList<Boolean> resultadoPlasma;


	public static void ObtencaoILM(){
		for (int i = 0; i < arrayMariana; i=i+6) {		
			resultadoIsLongMeth.add(arrayMariana.get(i));
		}
	}
	
	public static void ObtencaoPlasma(){
		for (int i = 0; i < arrayMariana; i=i+7) {		
			resultadoIsLongMeth.add(arrayMariana.get(i));
		}
	}
	
	public static void ObtencaoPMD(){
		for (int i = 0; i < arrayMariana; i=i+8) {		
			resultadoIsLongMeth.add(arrayMariana.get(i));
		}
	}


	public static void PMD_Quality(){
		for (int i = 0; i < resultadoIsLongMeth.size(); i++) {
			if (resultadoIsLongMeth.get(i) == true) {
				if (resultadoPMD.get(i) == true)
					DCIcount++;
				else ADIIcount++;
			}
			System.out.println("DCI = " + DCIcount);		
			System.out.println("ADII = " + ADIIcount);
		}
	}

	public static void iPlasma_Quality(){
		for (int i = 0; i < resultadoIsLongMeth.size(); i++) {		
			if (resultadoIsLongMeth.get(i) == false) {
				if (resultadoPlasma.get(i) == true)
					DIIcount++;
				else ADCIcount++;
			}	
			System.out.println("DII = " + DIIcount);
			System.out.println("ADCI = " + ADCIcount);
		}
	}
}


