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
import utils.Metodo;

/**
 * @author carlosguerra
 *
 */
public class JanelaPMD {
	
	private ArrayList<Metodo> arrayExcel;
	private ArrayList<Integer> res;
	
	/**
	 * @param arrayExcel
	 * Constructor for the window, this window needs the arrayExcel to be able to display the results
	 */
	public JanelaPMD(ArrayList<Metodo> arrayExcel) {
		super();
		this.arrayExcel = arrayExcel;
		makeWindow();
	}
	
	/**
	 * Makes the window, also displaying the results based on the Excel file which was given on the constructor
	 */
	private void makeWindow() {
		
		JFrame frame = new JFrame("Resultados PMD");
		
		JPanel painel = new JPanel(new BorderLayout());
		
		JTextArea resul = new JTextArea();
		resul.setBounds(10, 79, 179, 339);
		resul.setEditable(false);
		
		res = QualidadeFerramentas.PMD_Quality(arrayExcel);
		
		for(int i = 0; i < res.size(); i++) {
			switch(i){
			case(0):
				resul.append("DCI do PMD =" + res.get(i) + "\n");
				break;
			
			case(1):
				resul.append("DII do PMD =" + res.get(i) + "\n");
				break;
			
			case(2):
				resul.append("ADII do PMD =" + res.get(i) + "\n");
				break;
				
			case(3):
				resul.append("ADCI do PMD =" + res.get(i) + "\n");
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
