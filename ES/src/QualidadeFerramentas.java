import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;

public class QualidadeFerramentas {
	private int DCIcount=0;
	private int DIIcount=0;
	private int ADCIcount=0;
	private int ADIIcount=0;
	private static ArrayList<Metodo> arrayMariana = new TratamentoDosDadosExcel().guardarDadosMatriz();
	//private ArrayList<Boolean> resultadoIsLongMeth;
	private ArrayList<Metodo> resultadoPMD;
	private ArrayList<Metodo> resultadoPlasma;



	@SuppressWarnings("null")
	private static void ObtencaoILM(){	
		//ArrayList<Metodo> arrayMariana = new TratamentoDosDadosExcel().guardarDadosMatriz();
		ArrayList<Boolean> resultadoIsLongMeth = null;
		//System.out.println("indice= " + arrayMariana.get(6).getIs_long_method());
		//System.out.println("indice= " + arrayMariana.get(18).getIs_long_method());
		for (int i = 0; i < arrayMariana.size(); i=i+6) {
			boolean item = arrayMariana.get(i).getIs_long_method();
			System.out.println(item);
			System.out.println(resultadoIsLongMeth);
			resultadoIsLongMeth.add(item);
			System.out.println(resultadoIsLongMeth);
		}
	}

	//	public void ObtencaoPlasma(){
	//		for (int i = 0; i < arrayMariana.size(); i=i+7) {		
	//			resultadoIsLongMeth.add(arrayMariana.get(i));
	//			//System.out.println(resultadoPlasma);
	//		}
	//	}

	//	public void ObtencaoPMD(){
	//		for (int i = 0; i < arrayMariana.size(); i=i+8) {		
	//			resultadoIsLongMeth.add(arrayMariana.get(i));
	//			//System.out.println(resultadoPMD);
	//		}
	//	}


	//	public static void PMD_Quality(){
	//		for (int i = 0; i < resultadoIsLongMeth.size(); i++) {
	//			if (resultadoIsLongMeth.get(i) == true) {
	//				if (resultadoPMD.get(i) == true)
	//					DCIcount++;
	//				else ADIIcount++;
	//			}
	//			System.out.println("DCI = " + DCIcount);		
	//			System.out.println("ADII = " + ADIIcount);
	//		}
	//	}
	//
	//	public static void iPlasma_Quality(){
	//		for (int i = 0; i < resultadoIsLongMeth.size(); i++) {		
	//			if (resultadoIsLongMeth.get(i) == false) {
	//				if (resultadoPlasma.get(i) == true)
	//					DIIcount++;
	//				else ADCIcount++;
	//			}	
	//			System.out.println("DII = " + DIIcount);
	//			System.out.println("ADCI = " + ADCIcount);
	//		}
	//	}

	public static void main(String [] args) throws EncryptedDocumentException, IOException {
		ObtencaoILM();
		//ObtencaoPlasma();
		//ObtencaoPMD();
	}
}


