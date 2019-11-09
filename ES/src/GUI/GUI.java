package GUI;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

import org.apache.poi.EncryptedDocumentException;

import geral.Tentativa;


public class GUI {

	private JFrame frame;
	private JFrame frameSecun;
	private JFrame frameErrorEx;
	private JButton importExcel;
	private JButton addRegra;
	private JButton runProgram;
	private int checkExce = 0; //Um sinal para ver se o Excel foi verificado: 0 == não foi lido e 1 == foi lido e pode continuar
	private ArrayList<String> lidaFicheiro;
	
	private void makeWindow() {
		
		frame = new JFrame("Excel search");
		
		frame.setLayout(new GridLayout(1,1));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		makeWindowPrincipal();
		
		actionButtonEx(importExcel);
		actionButtonRe(addRegra);
		actionButtonRun(runProgram);
		
		frame.setSize(500, 150);

		frame.setVisible(true);
		
	}
	
	private void makeWindowPrincipal() {
		
		importExcel = new JButton("Importar Excel");
		frame.add(importExcel);
		
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
					
					geral.Tentativa tnt1 = new Tentativa();
					tnt1.lerdados();
					lidaFicheiro = tnt1.getVec();
					
					checkExce = 1;
					
				} catch (EncryptedDocumentException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
	} 
	
	private synchronized void actionButtonRe(JButton addRegra) {
		addRegra.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(checkExce==0) {
					new JanelaErroExcel().errorSemExcel();;
				}
				else {
				new JanelaAdicionarRegra().makeSecondWindow();
				}
			}

		});

	} 
	
	private synchronized void actionButtonRun(JButton runProgram) {
		runProgram.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(checkExce==0) {
					new JanelaErroExcel();
				}
				else {
					//ADICIONAR CODIGO DE LER O FICHEIRO EXCEL
				}
			}

		});
	} 	
	
	
	
	
	
	public static void main(String[] args) {
		new GUI().makeWindow();
	}
	
}

