package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaAdicionarRegra {

	
	
	private JFrame frameSecun;

	public void makeSecondWindow() {
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
}
