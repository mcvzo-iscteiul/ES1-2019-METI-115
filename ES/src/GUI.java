import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

import org.apache.poi.EncryptedDocumentException;


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
					
					Tentativa tnt1 = new Tentativa();
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
					errorSemExcel();
				}
				else {
				makeSecondWindow();
				}
			}

		});

	} 
	
	private synchronized void actionButtonRun(JButton runProgram) {
		runProgram.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(checkExce==0) {
					errorSemExcel();
				}
				else {
					//ADICIONAR CODIGO DE LER O FICHEIRO EXCEL
				}
			}

		});
	} 	
	
	private void makeSecondWindow() {
		frameSecun = new JFrame("Adicionar Regra");
		
		frameSecun.setLayout(new BorderLayout());
		
		String regraExemplo = "Adicionar uma regra do tipo: SE ( ATFD > 4 E LAA < 0.42 ) ENTÃO is_feature_envy = TRUE SENÃO is_feature_envy = FALSE";
		
		JLabel tipoRegra = new JLabel(regraExemplo);
		
		
		frameSecun.add(tipoRegra,BorderLayout.NORTH);
		
		JTextField textRegra = new JTextField();
		
		frameSecun.add(textRegra,BorderLayout.CENTER);
		
		JButton makeRegra = new JButton("Adicionar Nova Regra");
		
		frameSecun.add(makeRegra,BorderLayout.EAST);
		
		frameSecun.setSize(800, 100);
		
		frameSecun.setVisible(true);

	}
	
	private void errorSemExcel() {
		frameErrorEx = new JFrame("Erro Excel");
		
		frameErrorEx.setLayout(new GridLayout(2,1));
		
		JLabel textoErro = new JLabel("Erro ao verificar a existência do Excel, tem de correr o verificar Excel primeiro. Tente novamente");
		frameErrorEx.add(textoErro);
		
		JButton ok = new JButton("Ok");
		frameErrorEx.add(ok);
		
		actionButtonOk(ok);
		
		frameErrorEx.pack();
		frameErrorEx.setVisible(true);
		
	}
	
	private synchronized void actionButtonOk(JButton ok) {
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameErrorEx.dispose();
			}

		});
	} 
	
	public static void main(String[] args) {
		new GUI().makeWindow();
	}
	
}

