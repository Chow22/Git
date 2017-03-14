import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Calculadora {

	private JFrame frame;
	private JTextField display;

	private double primero;
	private double segundo;
	private double resultado;
	private String operacion;
	private Boolean punto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/com/sun/javafx/scene/web/skin/AlignJustified_16x16_JFX.png")));
		frame.getContentPane().setBackground(new Color(32, 178, 170));
		frame.getContentPane().setLayout(null);

		punto = false;
		primero = 0;
		segundo = 0;
		operacion = "";
		resultado = 0;

		JButton uno = new JButton("1");
		uno.setForeground(new Color(0, 0, 0));
		uno.setFont(new Font("Tahoma", Font.BOLD, 11));
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				display.setText(display.getText() + uno.getText());
			}
		});
		uno.setBounds(10, 189, 57, 46);
		frame.getContentPane().add(uno);

		JButton dos = new JButton("2");
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + dos.getText());
			}
		});
		dos.setForeground(Color.BLACK);
		dos.setFont(new Font("Tahoma", Font.BOLD, 11));
		dos.setBounds(77, 189, 57, 46);
		frame.getContentPane().add(dos);

		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + tres.getText());
			}
		});
		tres.setForeground(Color.BLACK);
		tres.setFont(new Font("Tahoma", Font.BOLD, 11));
		tres.setBounds(144, 189, 57, 46);
		frame.getContentPane().add(tres);

		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + seis.getText());
			}
		});
		seis.setForeground(Color.BLACK);
		seis.setFont(new Font("Tahoma", Font.BOLD, 11));
		seis.setBounds(144, 132, 57, 46);
		frame.getContentPane().add(seis);

		JButton cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + cuatro.getText());
			}
		});
		cuatro.setForeground(Color.BLACK);
		cuatro.setFont(new Font("Tahoma", Font.BOLD, 11));
		cuatro.setBounds(10, 132, 57, 46);
		frame.getContentPane().add(cuatro);

		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + cinco.getText());
			}
		});
		cinco.setForeground(Color.BLACK);
		cinco.setFont(new Font("Tahoma", Font.BOLD, 11));
		cinco.setBounds(77, 132, 57, 46);
		frame.getContentPane().add(cinco);

		JButton siete = new JButton("7");
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + siete.getText());
			}
		});
		siete.setForeground(Color.BLACK);
		siete.setFont(new Font("Tahoma", Font.BOLD, 11));
		siete.setBounds(10, 75, 57, 46);
		frame.getContentPane().add(siete);

		JButton ocho = new JButton("8");
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + ocho.getText());
			}
		});
		ocho.setForeground(Color.BLACK);
		ocho.setFont(new Font("Tahoma", Font.BOLD, 11));
		ocho.setBounds(77, 75, 57, 46);
		frame.getContentPane().add(ocho);

		JButton nueve = new JButton("9");
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + nueve.getText());
			}
		});
		nueve.setForeground(Color.BLACK);
		nueve.setFont(new Font("Tahoma", Font.BOLD, 11));
		nueve.setBounds(144, 75, 57, 46);
		frame.getContentPane().add(nueve);

		JButton sumar = new JButton("+");
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primero = Double.parseDouble(display.getText());
				display.setText("");

				operacion = "sumar";
				punto=false;
			}
		});
		sumar.setForeground(Color.BLACK);
		sumar.setFont(new Font("Tahoma", Font.BOLD, 11));
		sumar.setBounds(231, 75, 57, 46);
		frame.getContentPane().add(sumar);

		JButton restar = new JButton("-");
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primero = Double.parseDouble(display.getText());
				display.setText("");

				operacion = "restar";
				punto=false;
			}
		});
		restar.setForeground(Color.BLACK);
		restar.setFont(new Font("Tahoma", Font.BOLD, 11));
		restar.setBounds(231, 132, 57, 46);
		frame.getContentPane().add(restar);

		JButton multiplicar = new JButton("*");
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primero = Double.parseDouble(display.getText());
				display.setText("");

				operacion = "multiplicar";
				punto=false;
			}
		});
		multiplicar.setForeground(Color.BLACK);
		multiplicar.setFont(new Font("Tahoma", Font.BOLD, 11));
		multiplicar.setBounds(231, 189, 57, 46);
		frame.getContentPane().add(multiplicar);

		JButton dividir = new JButton("/");
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primero = Double.parseDouble(display.getText());
				display.setText("");

				operacion = "dividir";
				punto=false;
			}
		});
		dividir.setForeground(Color.BLACK);
		dividir.setFont(new Font("Tahoma", Font.BOLD, 11));
		dividir.setBounds(231, 246, 57, 46);
		frame.getContentPane().add(dividir);

		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
			}
		});
		clear.setForeground(Color.BLACK);
		clear.setFont(new Font("Tahoma", Font.BOLD, 11));
		clear.setBounds(144, 246, 57, 46);
		frame.getContentPane().add(clear);

		JButton decimal = new JButton(".");
		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (punto == false) {
					display.setText(display.getText() + decimal.getText());

				}
				punto = true;
			}
		});
		decimal.setForeground(Color.BLACK);
		decimal.setFont(new Font("Tahoma", Font.BOLD, 11));
		decimal.setBounds(77, 246, 57, 46);
		frame.getContentPane().add(decimal);

		JButton cero = new JButton("0");
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + cero.getText());
			}
		});
		cero.setForeground(Color.BLACK);
		cero.setFont(new Font("Tahoma", Font.BOLD, 11));
		cero.setBounds(10, 246, 57, 46);
		frame.getContentPane().add(cero);

		JButton cambiarSigno = new JButton("+/-");
		cambiarSigno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(String.valueOf(Double.parseDouble(display.getText())*(-1)));
			}
		});
		cambiarSigno.setForeground(Color.BLACK);
		cambiarSigno.setFont(new Font("Tahoma", Font.BOLD, 11));
		cambiarSigno.setBounds(10, 303, 124, 46);
		frame.getContentPane().add(cambiarSigno);

		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				segundo = Double.parseDouble(display.getText());
				if (operacion.equals("sumar")) {
					resultado = primero + segundo;
				} else if (operacion.equals("restar")) {
					resultado = primero - segundo;
				} else if (operacion.equals("multiplicar")) {
					resultado = primero * segundo;
				} else if (operacion.equals("dividir")) {
					resultado = primero / segundo;
				}
				display.setText(String.valueOf(resultado));
				primero = 0;
				segundo = 0;
				operacion = "";
				resultado = 0;
				punto=false;
			}
		});
		igual.setForeground(Color.BLACK);
		igual.setFont(new Font("Tahoma", Font.BOLD, 11));
		igual.setBounds(144, 303, 144, 46);
		frame.getContentPane().add(igual);

		display = new JTextField();
		display.setEnabled(false);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBounds(10, 11, 276, 53);
		frame.getContentPane().add(display);
		display.setColumns(10);
		frame.setBounds(100, 100, 316, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
