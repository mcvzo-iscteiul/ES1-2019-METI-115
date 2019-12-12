package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import utils.Estrutura;
import utils.Metodo;

/**
 * @author carlosguerra
 *
 */
public class JanelaResultados {

	private ArrayList<Estrutura> ficheiro;
	private ArrayList<Metodo> excel;

	/**
	 * @param ficheiro
	 * @param metodos
	 * When this window is made it needs the two Arrays to be able to display the results
	 */
	public JanelaResultados(ArrayList<Estrutura> ficheiro, ArrayList<Metodo> metodos) {
		this.ficheiro = ficheiro;
		this.excel=metodos;
		makeWindow();
	}

	/**
	 * Makes the window where the results will be displaying, also creates the buttons where will be created windows to display the other results
	 */
	private void makeWindow() {

		JFrame janela = new JFrame("Apresentação de Resultados");

		JPanel all = new JPanel(new BorderLayout());

		JTextArea display = new JTextArea();
		display.setBounds(10, 79, 179, 339);
		display.setEditable(false);

		JScrollPane scroll = new JScrollPane(display);

		for(Estrutura a : ficheiro){
			display.append(a.toString() + "\n");
		}

		all.add(scroll, BorderLayout.CENTER);

		JPanel def = new JPanel(new FlowLayout());

		JButton mostrarIPlasma = new JButton("Mostrar IPlasma");

		def.add(mostrarIPlasma);

		JButton mostrarPMD = new JButton("Mostrar PMD");

		def.add(mostrarPMD);
		
		JButton mostrarQualidade = new JButton("Mostrar Qualidade");
		
		def.add(mostrarQualidade);

		JButton fechar = new JButton("Fechar Resultados");

		def.add(fechar);

		all.add(def, BorderLayout.NORTH);

		janela.add(all);
		janela.setSize(500, 500);
		
		janela.setLocationRelativeTo(null);
		
		janela.setVisible(true);

		fechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				janela.dispose();
			}
		});

		mostrarIPlasma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new JanelaIPlasma(excel);
			}
		});
		
		mostrarPMD.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 new JanelaPMD(excel);
			}
		});
		
		mostrarQualidade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 new JanelaQuality(excel,ficheiro);
			}
		});


	}


}
