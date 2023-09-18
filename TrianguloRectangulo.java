package Actividad_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TrianguloRectangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JTextField txtPerimetro;
	private JTextField txtArea;
	private JTextField txtHipotenusa;
	private JTextField txtTipo;
	private double base; 
	private double altura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrianguloRectangulo frame = new TrianguloRectangulo();
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
	
	
	public TrianguloRectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	public double calcularArea() {
		double area=(base*altura)/2;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro=base+altura+(Math.sqrt((Math.pow(base, 2)+Math.pow(altura, 2))));
		return perimetro;
	}
	
	public double calcularHipotenusa() {
		double hipotenusa=(Math.sqrt((Math.pow(base, 2)+Math.pow(altura, 2))));
		return hipotenusa;
	}
	public String determinarTipoTriangulo() {
		if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
			return "Es un triángulo equilátero";
		}
		else if ((base != altura) && (base != calcularHipotenusa()) &&(altura != calcularHipotenusa())) {
			return "Es un triángulo escaleno";
		}
		else {
			return "Es un triángulo isósceles";
		}
	}
	
	
	
	public TrianguloRectangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BASE");
		lblNewLabel.setBounds(58, 29, 93, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ALTURA");
		lblNewLabel_1.setBounds(58, 64, 93, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PERIMETRO");
		lblNewLabel_2.setBounds(58, 96, 93, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AREA");
		lblNewLabel_3.setBounds(58, 137, 93, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.setIcon(new ImageIcon(TrianguloRectangulo.class.getResource("/Actividad_3/ICONOS/calculadora.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				base=Double.parseDouble(txtBase.getText());
				altura=Double.parseDouble(txtAltura.getText());
				
				
				TrianguloRectangulo triangulo=new TrianguloRectangulo(base,altura);
				
				
				
				
				txtBase.setText(String.valueOf(base));
				txtAltura.setText(String.valueOf(altura));
				txtArea.setText(String.valueOf(triangulo.calcularArea()));
				txtPerimetro.setText(String.valueOf(triangulo.calcularPerimetro()));
				txtHipotenusa.setText(String.valueOf(triangulo.calcularHipotenusa()));
				txtTipo.setText(triangulo.determinarTipoTriangulo());
				
				
			}
		});
		btnNewButton.setBounds(20, 276, 146, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BORRAR");
		btnNewButton_1.setIcon(new ImageIcon(TrianguloRectangulo.class.getResource("/Actividad_3/ICONOS/borrar.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText("");
				txtAltura.setText("");
				txtArea.setText("");
				txtPerimetro.setText("");
				txtHipotenusa.setText("");
				txtTipo.setText("");
			}
		});
		btnNewButton_1.setBounds(176, 276, 135, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SALIR");
		btnNewButton_2.setIcon(new ImageIcon(TrianguloRectangulo.class.getResource("/Actividad_3/ICONOS/salida-de-emergencia.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(321, 276, 114, 50);
		contentPane.add(btnNewButton_2);
		
		txtBase = new JTextField();
		txtBase.setBounds(232, 26, 203, 19);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(232, 61, 203, 19);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setBounds(231, 93, 204, 19);
		contentPane.add(txtPerimetro);
		txtPerimetro.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setBounds(232, 134, 203, 19);
		contentPane.add(txtArea);
		txtArea.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("HIPOTENUSA");
		lblNewLabel_4.setBounds(58, 174, 93, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("TIPO DE TRIANGULO");
		lblNewLabel_5.setBounds(58, 210, 144, 13);
		contentPane.add(lblNewLabel_5);
		
		txtHipotenusa = new JTextField();
		txtHipotenusa.setBounds(232, 171, 203, 19);
		contentPane.add(txtHipotenusa);
		txtHipotenusa.setColumns(10);
		
		txtTipo = new JTextField();
		txtTipo.setBounds(232, 207, 203, 19);
		contentPane.add(txtTipo);
		txtTipo.setColumns(10);
	}

}
