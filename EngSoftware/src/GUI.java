import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;


public class GUI {

	private JFrame frame;
	private JButton importExcel;
	private JButton addRegra;
	private JButton runProgram;
	private JTextField addRegratexto;
	private String regra;
	private int valorMin;
	private int valorMax;
	private JComboBox<Integer> valoresMax;
	private JComboBox<Integer> valoresMin;
	
	
	private void makeWindow() {
		
		frame = new JFrame("Excel search");
		
		frame.setLayout(new GridLayout(2,4));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		makeAll();
		
		actionButtonEx(importExcel);
		actionButtonRe(addRegra);
		actionButtonRun(runProgram);
		
		frame.setSize(500, 150);

		frame.setVisible(true);
		
	}
	
	private void makeAll() {
		
		importExcel = new JButton("Importar Excel");
		frame.add(importExcel);
		
		addRegratexto = new JTextField("Escrever Regra");
		frame.add(addRegratexto);
		
		addRegra = new JButton("Adicionar");
		frame.add(addRegra);
		
		JPanel textoValorMin = new JPanel();
		
		JLabel valorMin= new JLabel("Valor Minimo");
		textoValorMin.add(valorMin);
		
		Integer[] valores = new Integer[101]; 
		
		for(int i =0; i < 101; i++) {
			
			valores[i] = i;
		}
		
		valoresMin = new JComboBox<Integer>(valores);
		textoValorMin.add(valoresMin);
		
		frame.add(textoValorMin);
		
		JPanel textoValorMax = new JPanel();
		
		JLabel valorMax= new JLabel("Valor Máximo");
		textoValorMax.add(valorMax);
		
		valoresMax = new JComboBox<Integer>(valores);
		textoValorMax.add(valoresMax);
		frame.add(textoValorMax);
		
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
				
				regra = addRegratexto.getText();
				//A REGRA A ADICIONAR JÁ ESTÁ NOS ATRIBUTOS DA CLASSE 
				//UTILIZAR O GET
			
			}

		});

	} 
	
	private synchronized void actionButtonRun(JButton runProgram) {
		runProgram.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				valorMax= valoresMax.getSelectedIndex();
				valorMin= valoresMin.getSelectedIndex();
				
				//ADICIONAR CODIGO DE LER O FICHEIRO EXCEL
				
			}

		});

	} 
	
	public String getRegra() {
		return regra;
	}
	
	public int getValorMax() {
		return valorMax;
	}
	
	public int getValorMin() {
		return valorMin;
	}
	
	public static void main(String[] args) {
		new GUI().makeWindow();
	}
	
}

