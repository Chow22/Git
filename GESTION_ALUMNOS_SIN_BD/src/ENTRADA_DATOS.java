import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tablas.ALUMNO;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ENTRADA_DATOS extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6551023060422021263L;
	private final JPanel contentPanel = new JPanel();
	private JTextField nmatricula;
	private JTextField nombre;
	private JTextField apellido;
	private JTextField edad;
	private JLabel lblNMatricula;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblEdad;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public ENTRADA_DATOS(JDialog acciones,Boolean modal) {
		
		super(acciones,modal);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNMatricula = new JLabel("N\u00BA MATRICULA");
			lblNMatricula.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			lblNMatricula.setBounds(10, 32, 108, 23);
			contentPanel.add(lblNMatricula);
		}
		{
			lblNombre = new JLabel("NOMBRE");
			lblNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			lblNombre.setBounds(10, 85, 108, 23);
			contentPanel.add(lblNombre);
		}
		{
			lblApellido = new JLabel("APELLIDO");
			lblApellido.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			lblApellido.setBounds(10, 136, 108, 23);
			contentPanel.add(lblApellido);
		}
		{
			lblEdad = new JLabel("EDAD");
			lblEdad.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			lblEdad.setBounds(10, 195, 108, 23);
			contentPanel.add(lblEdad);
		}
		{
			nmatricula = new JTextField();
			nmatricula.setColumns(10);
			nmatricula.setBackground(new Color(0, 206, 209));
			nmatricula.setBounds(128, 34, 149, 21);
			contentPanel.add(nmatricula);
		}
		{
			nombre = new JTextField();
			nombre.setColumns(10);
			nombre.setBackground(new Color(0, 206, 209));
			nombre.setBounds(128, 87, 149, 21);
			contentPanel.add(nombre);
		}
		{
			apellido = new JTextField();
			apellido.setColumns(10);
			apellido.setBackground(new Color(0, 206, 209));
			apellido.setBounds(128, 138, 149, 21);
			contentPanel.add(apellido);
		}
		{
			edad = new JTextField();
			edad.setColumns(10);
			edad.setBackground(new Color(0, 206, 209));
			edad.setBounds(128, 197, 149, 21);
			contentPanel.add(edad);
		}
		{
			JButton btnGuardar = new JButton("GUARDAR");
			btnGuardar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					accionGuardar();

				}
			});
			btnGuardar.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
			btnGuardar.setBackground(new Color(0, 206, 209));
			btnGuardar.setBounds(324, 227, 100, 23);
			contentPanel.add(btnGuardar);
		}
	}

	protected void accionGuardar() {
		ALUMNO alumno=new ALUMNO(nmatricula.getText(),nombre.getText(),apellido.getText(),Integer.parseInt(edad.getText()));
				((ACCIONES)this.getParent()).rellenarLista(alumno);
				this.dispose();
				
		
	}

}
