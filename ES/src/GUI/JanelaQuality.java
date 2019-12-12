package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import results.QualidadeFerramentas;
import utils.Estrutura;
import utils.Metodo;

public class JanelaQuality {
	
	private ArrayList<Metodo> arrayExcel;
	private ArrayList<Integer> res;
	private ArrayList<Estrutura> arrayResultados;
	
	public JanelaQuality(ArrayList<Metodo> arrayExcel, ArrayList<Estrutura> arrayResultados) {
		super();
		this.arrayExcel = arrayExcel;
		this.arrayResultados = arrayResultados;
		makeWindow();
	}
	
	private void makeWindow() {
		
		JFrame frame = new JFrame("Resultados Quality");
		
		JPanel painel = new JPanel(new BorderLayout());
		
		JTextArea resul = new JTextArea();
		resul.setBounds(10, 79, 179, 339);
		resul.setEditable(false);
		
		res = QualidadeFerramentas.Regras_Quality(arrayExcel, arrayResultados);
		
		for(int i = 0; i < res.size(); i++) {
			switch(i){
			case(0):
				resul.append("DCI das Regras =" + res.get(i) + "\n");
				break;
			
			case(1):
				resul.append("DII das Regras =" + res.get(i) + "\n");
				break;
			
			case(2):
				resul.append("ADII das Regras =" + res.get(i) + "\n");
				break;
				
			case(3):
				resul.append("ADCI das Regras =" + res.get(i) + "\n");
				break;
			}
		}
		
		painel.add(resul,BorderLayout.CENTER);
		
		JButton ok = new JButton("Ok");
		painel.add(ok, BorderLayout.SOUTH);
		
		frame.add(painel);
		frame.pack();
		
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
	}
	

}
