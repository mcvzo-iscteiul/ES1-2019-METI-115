package GUI;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.DadosParaPesquisa;

public class JanelaAdicionarRegra {

	private JFrame frameSecun;
	private ArrayList<JPanel> listaPaineis;

	private JComboBox<String> es1;
	private JComboBox<String> es2;
	private JComboBox<String> mI1;
	private JComboBox<String> mI2;
	private JComboBox<String> jun;
	private JTextField v1;
	private JTextField v2;

	private static DadosParaPesquisa exit;

	private String tipo1="";
	private String tipo2;
	private String junt;
	private String lim1;
	private String lim2;

	public void makeSecondWindow() {
		listaPaineis = new ArrayList<JPanel>();
		makeRuleWindow();
	}


	private void makePainel1() {
		//Primeira escolha de valor
		JPanel esct = new JPanel(new BorderLayout());

		JPanel esc1 = new JPanel(new GridLayout(1,3));

		String[] ess1 = {" ", "LOC", "CYCLO", "LAA", "ATFD"};

		es1 = new JComboBox<String>(ess1);

		esc1.add(es1,0);

		String[] mmI1 = { "<", ">"};

		mI1 = new JComboBox<String>(mmI1);

		mI1.setEditable(false);
		mI1.setEnabled(false);
		esc1.add(mI1, 1);

		v1 = new JTextField();

		esc1.add(v1,-1);

		esct.add(esc1, BorderLayout.CENTER);

		JButton prox = new JButton("Proximo passo");

		esct.add(prox, BorderLayout.SOUTH);

		listaPaineis.add(esct);

		prox.addActionListener(new ActionListener() {
	

			@Override
			public void actionPerformed(ActionEvent e) {
				tipo1 = es1.getSelectedItem().toString();
				if(!v1.getText().isEmpty()) {
					lim1 =	v1.getText();
					}else {
						lim1 = "0";
					}

				frameSecun.setContentPane(listaPaineis.get(1));
				frameSecun.invalidate();
				frameSecun.validate();
			}
		});
		
		es1.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	if(es1.getSelectedItem().toString().contentEquals("LOC") || es1.getSelectedItem().toString().contentEquals("CYCLO")) {
					mI1.setSelectedIndex(0);
				}
				
				if(es1.getSelectedItem().toString().contentEquals("ATFD") ||es1.getSelectedItem().toString().contentEquals("LAA")) {
					mI1.setSelectedIndex(1);		
				}
		    	
		    }
		});
		
	}

	private void makePainel3() {
		
		JPanel esct = new JPanel(new BorderLayout());

		JPanel esc1 = new JPanel(new GridLayout(1,3));

		String[] ess1 = {" ", "LOC"};
		String[] ess15 = {" ", "CYCLO"};
		String[] ess2 = {" ", "ATFD"};	
		String[] ess25 = {" ","LAA"};	
		
		if(tipo1.contentEquals("LOC")){
			es2 = new JComboBox<String>(ess15);
		}
		
		if(tipo1.contentEquals("CYCLO")) {
			es2 = new JComboBox<String>(ess1);
		}
		
		if(tipo1.contentEquals("ATFD")){
			es2 = new JComboBox<String>(ess25);
		}
		
		if(tipo1.contentEquals("LAA")){
			es2 = new JComboBox<String>(ess2);
		}
		

		esc1.add(es2,0);

		String[] mmI1 = { "<", ">"};

		mI2 = new JComboBox<String>(mmI1);

		mI2.setEditable(false);
		mI2.setEnabled(false);
		esc1.add(mI2, 1);

		v2 = new JTextField();

		esc1.add(v2,-1);

		esct.add(esc1, BorderLayout.CENTER);

		JButton prox = new JButton("Adicionar Regra");

		esct.add(prox, BorderLayout.SOUTH);

		listaPaineis.add(esct);

		prox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tipo2 = es2.getSelectedItem().toString();
				if(!v2.getText().isEmpty()) {
				lim2 =	v2.getText();
				}else {
					lim2 = "0";
				}
				 exit = new DadosParaPesquisa(tipo1, tipo2, junt, Integer.parseInt(lim1), Integer.parseInt(lim2));
				 frameSecun.dispose();
			}
		});
		
		es2.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	if(es2.getSelectedItem().toString().contentEquals("LOC") || es2.getSelectedItem().toString().contentEquals("CYCLO")) {
					mI2.setSelectedIndex(0);
				}
				
				if(es2.getSelectedItem().toString().contentEquals("ATFD") ||es2.getSelectedItem().toString().contentEquals("LAA")) {
					mI2.setSelectedIndex(1);
				}
		    	
		    }
		});
		

	}


	private void makePainel2() {

		JPanel eOU = new JPanel(new BorderLayout());

		String[] ess3 = {"e", "ou"};
		jun= new JComboBox<String>(ess3);

		eOU.add(jun,BorderLayout.CENTER);

		JButton prox2 = new JButton("Proximo passo");

		eOU.add(prox2, BorderLayout.SOUTH);

		listaPaineis.add(eOU);
		prox2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				junt = jun.getSelectedItem().toString();
				makePainel3();
				frameSecun.setContentPane(listaPaineis.get(2));
				frameSecun.invalidate();
				frameSecun.validate();
			}
		});
	}


	public void makeRuleWindow() {
		frameSecun = new JFrame("Adicionar Regra");

		frameSecun.setLayout(new BorderLayout());

		makePainel1();	
		makePainel2();
		frameSecun.add(listaPaineis.get(0));

		frameSecun.pack();

		frameSecun.setLocationRelativeTo(null);
		
		frameSecun.setVisible(true);
	}


	public DadosParaPesquisa getExit() {
		return exit;
	}

}
