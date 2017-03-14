import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tablas.USUARIO;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class COMPROBACION extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1061243829864493340L;
	private final JPanel contentPanel = new JPanel();
	private JLabel saludo;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public COMPROBACION(JFrame inicial, Boolean modal, String usuario) {

		super(inicial,modal);

		setBounds(100, 100, 343, 205);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			saludo = new JLabel("ONGI ETORRI! Uruario");
			saludo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
			saludo.setBounds(33, 11, 271, 27);
			contentPanel.add(saludo);
		}
		saludo.setText(saludo.getText()+" " + usuario);
		{
			JButton btnContinuar = new JButton("CONTINUAR");
			btnContinuar.setBackground(new Color(0, 206, 209));
			btnContinuar.setForeground(new Color(0, 0, 0));
			btnContinuar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					accionComprobacion();
				}
			});
			btnContinuar.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
			btnContinuar.setBounds(111, 99, 103, 27);
			contentPanel.add(btnContinuar);
		}

	}

	private void accionComprobacion() {

		ACCIONES acciones = new ACCIONES(this, true);
		acciones.setVisible(true);
		this.dispose();
	}

}
