import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class INICIAL extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2039950359250296113L;
	private JPanel contentPane;
	private JTextField usuario;
	private JLabel titcontrasenia;
	private JLabel titnombre;
	private JPasswordField contrasenia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INICIAL frame = new INICIAL();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public INICIAL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAplicacionAlumno = new JLabel("APLICACION ALUMNO");
		lblAplicacionAlumno.setBounds(124, 11, 166, 21);
		lblAplicacionAlumno.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblAplicacionAlumno);
		
		titnombre = new JLabel("NOMBRE:");
		titnombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		titnombre.setBounds(10, 80, 166, 21);
		contentPane.add(titnombre);
		
		titcontrasenia = new JLabel("CONTRASE\u00D1A:");
		titcontrasenia.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		titcontrasenia.setBounds(10, 136, 166, 21);
		contentPane.add(titcontrasenia);
		
		usuario = new JTextField();
		usuario.setBackground(new Color(0, 206, 209));
		usuario.setBounds(124, 80, 149, 21);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setForeground(new Color(0, 0, 0));
		btnEntrar.setBackground(new Color(0, 206, 209));
		btnEntrar.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				accionInicial();
				
			}

			
		});
		btnEntrar.setBounds(124, 206, 89, 32);
		contentPane.add(btnEntrar);
		
		contrasenia = new JPasswordField();
		contrasenia.setBackground(new Color(0, 206, 209));
		contrasenia.setBounds(124, 136, 149, 21);
		contentPane.add(contrasenia);
		
	}
	private void accionInicial() {
		if ((usuario.getText().equals("asier"))
				&& (contrasenia.getText().equals("12345"))
				){
			COMPROBACION comprobacion=new COMPROBACION(this,true,usuario.getText());
			comprobacion.setLocation(50,50);
			comprobacion.setVisible(true);
			this.dispose();
		}else{
			JOptionPane.showMessageDialog(this,"Usuario o Contraseña incorrectos");
		}
		
	}
}
