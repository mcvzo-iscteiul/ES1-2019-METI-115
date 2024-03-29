package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * @author carlosguerra
 *
 */
public class JanelaErroExcel {

	private JFrame frameErrorEx;

	
	
	/**
	 * Makes the error window, which is called when the user tries to make a rule or run the program without importing the Excel
	 */
	public void errorSemExcel() {
		frameErrorEx = new JFrame("Erro Excel");
		
		frameErrorEx.setLayout(new GridLayout(2,1));
		
		JLabel textoErro = new JLabel("Erro ao verificar a existência do Excel, tem de correr o verificar Excel primeiro. Tente novamente");
		frameErrorEx.add(textoErro);
		
		JButton ok = new JButton("Ok");
		frameErrorEx.add(ok);
		
		actionButtonOk(ok);
		
		frameErrorEx.pack();
		frameErrorEx.setLocationRelativeTo(null);
		frameErrorEx.setVisible(true);
		
	}
	
	/**
	 * @param ok
	 * Creates the Button, which when pressed makes the window
	 */
	private synchronized void actionButtonOk(JButton ok) {
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frameErrorEx.dispose();
			}

		});
	} 
}
