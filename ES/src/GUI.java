import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;


public class GUI {

	private JFrame frame;
	private JFrame frameSecun;
	private JButton importExcel;
	private JButton addRegra;
	private JButton runProgram;
	
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
				
			}

		});

	} 
	
	private synchronized void actionButtonRe(JButton addRegra) {
		addRegra.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				makeSecondWindow();
			}

		});

	} 
	
	private synchronized void actionButtonRun(JButton runProgram) {
		runProgram.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//ADICIONAR CODIGO DE LER O FICHEIRO EXCEL
				
			}

		});
	} 	
	
	private void makeSecondWindow() {
		frameSecun = new JFrame("Adicionar Regra");
		
		frameSecun.setLayout(new BorderLayout());
		
		frameSecun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
	public static void main(String[] args) {
		new GUI().makeWindow();
	}
	
}

