package Actividad_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Rectangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JTextField txtArea;
	private JTextField txtPerimetro;
	private double base,altura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rectangulo frame = new Rectangulo();
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
	
	public Rectangulo(double base, double altura) {
		this.base=base; 
		this.altura=altura;
	}
	public double calcularArea() {
		double area=base*altura;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro=2*(base+altura);
		return perimetro;
	}
	
	
	public Rectangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BASE");
		lblNewLabel.setBounds(50, 56, 114, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ALTURA");
		lblNewLabel_1.setBounds(50, 87, 114, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AREA");
		lblNewLabel_2.setBounds(50, 120, 114, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PERIMETRO");
		lblNewLabel_3.setBounds(50, 152, 114, 13);
		contentPane.add(lblNewLabel_3);
		
		txtBase = new JTextField();
		txtBase.setBounds(183, 53, 197, 19);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(183, 84, 197, 19);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setBounds(183, 117, 197, 19);
		contentPane.add(txtArea);
		txtArea.setColumns(10);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setBounds(183, 149, 197, 19);
		contentPane.add(txtPerimetro);
		txtPerimetro.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.setIcon(new ImageIcon(Rectangulo.class.getResource("/Actividad_3/ICONOS/calculadora.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				base=Double.parseDouble(txtBase.getText());
				altura=Double.parseDouble(txtAltura.getText());
				Rectangulo rectangulo=new Rectangulo(base,altura);
				txtBase.setText(String.valueOf(base));
				txtAltura.setText(String.valueOf(altura));
				
				txtArea.setText(String.valueOf(rectangulo.calcularArea()));
				txtPerimetro.setText(String.valueOf(rectangulo.calcularPerimetro()));
				
				
			}
		});
		btnNewButton.setBounds(31, 201, 143, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BORRAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText("");
				txtAltura.setText("");
				txtArea.setText("");
				txtPerimetro.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Rectangulo.class.getResource("/Actividad_3/ICONOS/borrar.png")));
		btnNewButton_1.setBounds(209, 201, 119, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SALIR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Rectangulo.class.getResource("/Actividad_3/ICONOS/salida-de-emergencia.png")));
		btnNewButton_2.setBounds(355, 201, 109, 39);
		contentPane.add(btnNewButton_2);
	}

}
