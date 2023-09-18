package Actividad_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Cuadrado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLado;
	private JTextField txtArea;
	private JTextField txtPerimetro;
	private double lado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuadrado frame = new Cuadrado();
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
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	public double calcularArea() {
		double area=Math.pow(lado, 2);
		return area;
	}
	public double calcularPerimetro() {
		double perimetro=4*lado;
		return perimetro;
	}
	
	public Cuadrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LADO");
		lblNewLabel_1.setBounds(50, 77, 106, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AREA");
		lblNewLabel_2.setBounds(50, 113, 106, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PERIMETRO");
		lblNewLabel_3.setBounds(50, 145, 106, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lado=Double.parseDouble(txtLado.getText());
				Cuadrado cuadrado=new Cuadrado(lado);
				txtLado.setText(String.valueOf(lado));
				txtArea.setText(String.valueOf(cuadrado.calcularArea()));
				txtPerimetro.setText(String.valueOf(cuadrado.calcularPerimetro()));
				
				
			}
		});
		btnCalcular.setIcon(new ImageIcon(Cuadrado.class.getResource("/Actividad_3/ICONOS/calculadora.png")));
		btnCalcular.setBounds(27, 194, 138, 39);
		contentPane.add(btnCalcular);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setIcon(new ImageIcon(Cuadrado.class.getResource("/Actividad_3/ICONOS/borrar.png")));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLado.setText("");
				txtArea.setText("");
				txtPerimetro.setText("");
				
			
			}
		});
		btnBorrar.setBounds(194, 194, 138, 39);
		contentPane.add(btnBorrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setIcon(new ImageIcon(Cuadrado.class.getResource("/Actividad_3/ICONOS/salida-de-emergencia.png")));
		btnSalir.setBounds(342, 194, 106, 39);
		contentPane.add(btnSalir);
		
		txtLado = new JTextField();
		txtLado.setBounds(193, 74, 182, 19);
		contentPane.add(txtLado);
		txtLado.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setBounds(193, 110, 183, 19);
		contentPane.add(txtArea);
		txtArea.setColumns(10);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setBounds(194, 142, 182, 19);
		contentPane.add(txtPerimetro);
		txtPerimetro.setColumns(10);
	}

}
