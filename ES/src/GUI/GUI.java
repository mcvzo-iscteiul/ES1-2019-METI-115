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
	
	private void makeWindow() {
		jan = new JanelaAdicionarRegra();
		
		frame = new JFrame("Excel search");
		
		frame.setLayout(new GridLayout(1,1));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		makeWindowPrincipal();
		
		actionButtonEx(importExcel);
		actionButtonRe(addRegra);
		actionButtonRun(runProgram); 
		actionButtonLer(lerExcel);
		
		frame.setSize(500, 150);

		frame.setVisible(true);
		
	}
	
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
	
	
	private synchronized void actionButtonRe(JButton addRegra) {
		addRegra.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!checkExce) {
					new JanelaErroExcel().errorSemExcel();;
				}
				else {
					jan.makeSecondWindow();
				}
			}

		});

	}  
	
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
				}
			}

		});
	} 	
	
	
	
	
	
	public static void main(String[] args) {
		new GUI().makeWindow();
	}
	
}

