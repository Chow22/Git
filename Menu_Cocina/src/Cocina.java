import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Cocina {

	private JFrame ventana;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cocina window = new Cocina();
					window.ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cocina() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ventana = new JFrame();
		ventana.setIconImage(Toolkit.getDefaultToolkit().getImage(Cocina.class.getResource("/com/sun/javafx/scene/web/skin/AlignJustified_16x16_JFX.png")));
		ventana.setTitle("Cocinando con Topi");
		ventana.getContentPane().setForeground(new Color(70, 130, 180));
		ventana.setBounds(100, 100, 572, 403);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 250, 154));
		panel.setBounds(0, 0, 556, 353);
		ventana.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton spaghettis = new JRadioButton("Spaghetti");
		buttonGroup.add(spaghettis);
		spaghettis.setBackground(new Color(119, 136, 153));
		spaghettis.setBounds(39, 21, 121, 31);
		panel.add(spaghettis);
		
		JRadioButton polloasado = new JRadioButton("Pollo asado");
		buttonGroup.add(polloasado);
		polloasado.setBackground(new Color(119, 136, 153));
		polloasado.setBounds(398, 21, 121, 31);
		panel.add(polloasado);
		
		JRadioButton hamburguesa = new JRadioButton("Hamburguesa");
		buttonGroup.add(hamburguesa);
		hamburguesa.setBackground(new Color(119, 136, 153));
		hamburguesa.setBounds(227, 21, 121, 31);
		panel.add(hamburguesa);
		
		JCheckBox pasta = new JCheckBox("Pasta");
		pasta.setBackground(new Color(119, 136, 153));
		pasta.setBounds(410, 147, 109, 31);
		panel.add(pasta);
		
		JCheckBox carnePicada = new JCheckBox("Carne Picada");
		carnePicada.setBackground(new Color(119, 136, 153));
		carnePicada.setBounds(410, 113, 109, 31);
		panel.add(carnePicada);
		
		JCheckBox arroz = new JCheckBox("Arroz");
		arroz.setBackground(new Color(119, 136, 153));
		arroz.setBounds(39, 113, 109, 31);
		panel.add(arroz);
		
		JCheckBox tomate = new JCheckBox("Tomate");
		tomate.setBackground(new Color(119, 136, 153));
		tomate.setBounds(278, 181, 121, 31);
		panel.add(tomate);
		
		JCheckBox chorizo = new JCheckBox("Chorizo");
		chorizo.setBackground(new Color(119, 136, 153));
		chorizo.setBounds(161, 147, 109, 31);
		panel.add(chorizo);
		
		JCheckBox pan = new JCheckBox("Pan");
		pan.setBackground(new Color(119, 136, 153));
		pan.setBounds(39, 147, 109, 31);
		panel.add(pan);
		
		JCheckBox queso = new JCheckBox("Queso");
		queso.setBackground(new Color(119, 136, 153));
		queso.setBounds(162, 113, 108, 31);
		panel.add(queso);
		
		JCheckBox zanahoria = new JCheckBox("Zanahoria");
		zanahoria.setBackground(new Color(119, 136, 153));
		zanahoria.setBounds(161, 181, 109, 31);
		panel.add(zanahoria);
		
		JCheckBox cebolla = new JCheckBox("Cebolla");
		cebolla.setBackground(new Color(119, 136, 153));
		cebolla.setBounds(278, 147, 121, 31);
		panel.add(cebolla);
		
		JCheckBox pollo = new JCheckBox("Pollo");
		pollo.setBackground(new Color(119, 136, 153));
		pollo.setBounds(278, 113, 121, 31);
		panel.add(pollo);
		
		JCheckBox estiercol = new JCheckBox("Estiercol");
		estiercol.setBackground(new Color(119, 136, 153));
		estiercol.setBounds(39, 181, 109, 31);
		panel.add(estiercol);
		
		JButton todosLosIngredientes = new JButton("Todos los ingredientes");
		todosLosIngredientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((hamburguesa.isSelected()==true)
					&&(pasta.isSelected()==false)
					&&(carnePicada.isSelected()==true)
					&&(arroz.isSelected()==false)
					&&(tomate.isSelected()==true)
					&&(chorizo.isSelected()==false)
					&&(pan.isSelected()==true)
					&&(queso.isSelected()==true)
					&&(zanahoria.isSelected()==false)
					&&(cebolla.isSelected()==true)
					&&(pollo.isSelected()==false)
					&&(estiercol.isSelected()==false)){
					display.setText("La receta es correcta");
				}else if((spaghettis.isSelected()==true)
					&&(pasta.isSelected()==true)
					&&(carnePicada.isSelected()==false)
				&&(arroz.isSelected()==false)
				&&(tomate.isSelected()==true)
					&&(chorizo.isSelected()==false)
					&&(pan.isSelected()==false)
					&&(queso.isSelected()==true)
					&&(zanahoria.isSelected()==false)
					&&(cebolla.isSelected()==false)
					&&(pollo.isSelected()==false)
					&&(estiercol.isSelected()==false)){
					display.setText("La receta es correcta");
				}else if((polloasado.isSelected()==true)
					&&(pasta.isSelected()==false)
					&&(carnePicada.isSelected()==false)
					&&(arroz.isSelected()==false)
					&&(tomate.isSelected()==false)
					&&(chorizo.isSelected()==false)
					&&(pan.isSelected()==false)
					&&(queso.isSelected()==false)
					&&(zanahoria.isSelected()==true)
					&&(cebolla.isSelected()==true)
					&&(pollo.isSelected()==true)
					&&(estiercol.isSelected()==false)){
					display.setText("La receta es correcta");
				}else{
					display.setText("Faltan ingredientes");
				}
					
			}
		});
		todosLosIngredientes.setForeground(new Color(0, 0, 0));
		todosLosIngredientes.setBackground(new Color(30, 144, 255));
		todosLosIngredientes.setBounds(172, 271, 244, 31);
		panel.add(todosLosIngredientes);
		
		display = new JTextField();
		display.setBackground(new Color(119, 136, 153));
		display.setBounds(172, 313, 244, 29);
		panel.add(display);
		display.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Cocina.class.getResource("/imagenes/Flmaes-Red-Violet-Purpe-Art-Texture-Fire-Smoke-Bright-Colorful-WallpapersByte-com-3840x2400.jpg")));
		label.setBounds(0, 0, 556, 365);
		panel.add(label);
	}
}

