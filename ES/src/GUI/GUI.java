package GUI;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

import org.apache.poi.EncryptedDocumentException;

import results.Resultados;
import results.TratamentoDosDadosExcel;
import utils.DadosParaPesquisa;
import utils.Estrutura;
import utils.Metodo;

/**
 * @author carlosguerra
 *
 * 
 */

/**
 * @author carlosguerra
 *
 */
public class GUI {

	private JFrame frame;
	private JButton importExcel;
	private JButton addRegra;
	private JButton runProgram;
	private JButton lerExcel;
	private boolean checkExce = false; //Um sinal para ver se o Excel 
	private static DadosParaPesquisa oQuePesquisar;
	private ArrayList<Metodo> ficheiro;
	private ArrayList<Estrutura> resultados;
	private JanelaAdicionarRegra jan;
	
	
	
	/**
	 * Makes the main windows and then add the listeners for the Buttons
	 * 
	 */
	private void makeWindow() {
		
		frame = new JFrame("Excel search");
		
		frame.setLayout(new GridLayout(1,1));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		makeWindowPrincipal();
		
		actionButtonEx(importExcel);
		actionButtonRe(addRegra);
		actionButtonRun(runProgram); 
		actionButtonLer(lerExcel);
		
		frame.setSize(500, 150);

		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
	}
	
	
	
	
	/**
	 * Makes the Buttons and adds them to the main window 
	 */
	private void makeWindowPrincipal() {
		
		JPanel Excel= new JPanel();
		Excel.setLayout(new GridLayout(2,1));
		
		importExcel = new JButton("Importar Excel");
		Excel.add(importExcel);
		
		lerExcel = new JButton("Abrir Excel");
		Excel.add(lerExcel);
		
		frame.add(Excel);
		
		addRegra = new JButton("Adicionar Regra");
		frame.add(addRegra);
		
		
		runProgram = new JButton("Correr");
		frame.add(runProgram);
		
		}
	
	
	
	/**
	 * @param importExcel
	 * 
	 *	Creates the listener for the importExcel button, which when pressed reads the file and saves it in an ArrayList
	 */
	private synchronized void actionButtonEx(JButton importExcel) {
		importExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//ADICIONAR CODIGO DE LER O FICHEIRO EXCEL
				try {
					TratamentoDosDadosExcel	excel = new TratamentoDosDadosExcel();
					excel.guardarDadosMatriz();
					ficheiro = excel.getMatrizExcel();
					 checkExce = true;
					 
					System.out.println(ficheiro);
					
				} catch (EncryptedDocumentException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
							
			}
		});
	} 
	
	
	/**
	 * @param lerExcel
	 * Creates the listener for the lerExcel button, which when pressed open the Excel file on the preferred program
	 */
	private synchronized void actionButtonLer(JButton lerExcel) {
		lerExcel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					
				try {
					Desktop.getDesktop().open(new File("../ES/src/Long-Method.xlsx"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}

		});

	} 
	
	
	
	/**
	 * @param addRegra
	 * Creates the listener for the addRegra button, when pressed open the window which allows the user to create his own rule only if the Excel has been
	 * read, if now shows a error window
	 */
	private synchronized void actionButtonRe(JButton addRegra) {
		addRegra.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!checkExce) {
					new JanelaErroExcel().errorSemExcel();;
				}
				else {
					jan = new JanelaAdicionarRegra();
					jan.makeRuleWindow();
				}
			}

		});

	}  
	
	
	/**
	 * @param runProgram
	 * Creates the listener for the runProgram button, whem pressed it runs the program based on the rule made by the user only if the Excel has been imported,
	 * if not shows a error window
	 */
	private synchronized void actionButtonRun(JButton runProgram) {
		runProgram.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!checkExce) {
					new JanelaErroExcel();
				}
				else {
					oQuePesquisar = jan.getExit();
					System.out.println(oQuePesquisar);
					resultados = Resultados.distinguirResultado(ficheiro, oQuePesquisar);
					
					System.out.println(resultados + "fwjpofjewpfjwepojfop");
					new JanelaResultados(resultados,ficheiro);
				}
			}

		});
	} 	
	
	
	
	
	
	public static void main(String[] args) {
		new GUI().makeWindow();
	}
	
}

