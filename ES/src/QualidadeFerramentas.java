import java.util.ArrayList;

public class QualidadeFerramentas {
	public static int DCIcount=0;
	public static int DIIcount=0;
	public static int ADCIcount=0;
	public static int ADIIcount=0;
	public static ArrayList<Boolean> resultado;

	public static void PMD_Quality(){
		if (resultado.get(0) == true) {
			if (resultado.get(1) == true)
				DCIcount++;
			else ADIIcount++;
		}
		System.out.println("DCI = " + DCIcount);		
		System.out.println("ADII = " + ADIIcount);
	}

	public static void iPlasma_Quality(){
		if (resultado.get(0) == false) {
			if (resultado.get(1) == true)
				DIIcount++;
			else ADCIcount++;
		}
		System.out.println("DII = " + DIIcount);
		System.out.println("ADCI = " + ADCIcount);
	}
}


