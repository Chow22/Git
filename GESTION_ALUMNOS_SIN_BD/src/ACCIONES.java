import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tablas.ALUMNO;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class ACCIONES extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 826593465021821966L;
	private final JPanel contentPanel = new JPanel();
	private JComboBox<String> lista;
	private JMenuItem mntmInsertar;
	private JMenuItem mntmBorrar;
	private JMenuItem mntmMedia;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public ACCIONES(JDialog comprobacion, Boolean modal) {
		
		//super(comprobacion,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(192, 192, 192));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblDatosAlumno = new JLabel("DATOS ALUMNO");
			lblDatosAlumno.setBounds(148, 10, 138, 23);
			lblDatosAlumno.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
			contentPanel.add(lblDatosAlumno);
		}
		{
			JButton introAlumno = new JButton("INTRO ALUMNO");
			introAlumno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					accionInsertarAlum();
				}
			});
			introAlumno.setBackground(new Color(0, 206, 209));
			introAlumno.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
			introAlumno.setBounds(10, 69, 138, 23);
			contentPanel.add(introAlumno);
		}
		{
			JButton borrarAlumno = new JButton("BORRAR ALUMNO");
			borrarAlumno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					accionBorrarAlum();
				}
			});
			borrarAlumno.setBackground(new Color(0, 206, 209));
			borrarAlumno.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
			borrarAlumno.setBounds(10, 103, 138, 23);
			contentPanel.add(borrarAlumno);
		}
		{
			JButton media = new JButton("MEDIA ALUMNO");
			media.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					accionMedia();

				}
			});
			media.setBackground(new Color(0, 206, 209));
			media.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
			media.setBounds(10, 137, 138, 23);
			contentPanel.add(media);
		}

		lista = new JComboBox();
		lista.setBackground(new Color(0, 206, 209));
		lista.setBounds(208, 66, 171, 31);
		contentPanel.add(lista);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnAcciones = new JMenu("Acciones");
		menuBar.add(mnAcciones);
		
		mntmInsertar = new JMenuItem("Insertar");
		mnAcciones.add(mntmInsertar);
		
		mntmBorrar = new JMenuItem("Borrar");
		mnAcciones.add(mntmBorrar);
		
		mntmMedia = new JMenuItem("Media");
		mnAcciones.add(mntmMedia);
	}

	protected void accionMedia() {
		
		int i=0;
		while (lista.getItemAt(i).equals("")){
			i++;
		}
		
		double resultado=0.0;
		JOptionPane.showMessageDialog(this, "La media es "+resultado);
		
	}

	protected void accionBorrarAlum() {
		lista.removeItem(lista.getSelectedItem());
		
	}

	protected void accionInsertarAlum() {
		ENTRADA_DATOS entrada_datos = new ENTRADA_DATOS(this,true);
		entrada_datos.setLocation(450, 50);
		entrada_datos.setVisible(true);

	}
	protected void rellenarLista(ALUMNO alumno){
		lista.addItem(alumno.getnumMatricula()+" "+alumno.getNombre()+" "+alumno.getApellido()+" "+alumno.getEdad());
		
	}
}
