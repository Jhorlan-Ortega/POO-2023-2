package Actividad_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario_EP_19 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLado;
	private JTextField txtPerimetro;
	private JTextField txtAltura;
	private JTextField txtArea;
	private double lado; 
	private double altura; 
	private double perimetro; 
	private double area;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_EP_19 frame = new Formulario_EP_19();
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
	
	public Formulario_EP_19 (double lado) {
		this.lado=lado; 
	}
	public double calculaPerimetro(double lado) {
		return lado*3;
	}
	public double calcularArea(double lado) {
		return  ((Math.pow(lado,2 )*Math.sqrt(3))/4);
	}
	public double calcularAltura(double lado) {
		return ((lado*Math.sqrt(3))/2);
	}
	
	
	public Formulario_EP_19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LADO");
		lblNewLabel.setBounds(48, 30, 89, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PERIMETRO");
		lblNewLabel_1.setBounds(48, 64, 89, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ALTURA");
		lblNewLabel_2.setBounds(48, 98, 89, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AREA");
		lblNewLabel_3.setBounds(48, 131, 89, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lado=Double.parseDouble(txtLado.getText());
				Formulario_EP_19 triangulo=new Formulario_EP_19(lado);
				
				
				
				txtPerimetro.setText(String.valueOf(triangulo.calculaPerimetro(lado)));
				txtAltura.setText(String.valueOf(triangulo.calcularAltura(lado)));
				txtArea.setText(String.valueOf(triangulo.calcularArea(lado)));
				
				
	
			}
		});
		btnCalcular.setIcon(new ImageIcon(Formulario_EP_19.class.getResource("/Actividad_3/ICONOS/calculadora.png")));
		btnCalcular.setBounds(48, 189, 121, 47);
		contentPane.add(btnCalcular);
		
		txtLado = new JTextField();
		txtLado.setBounds(197, 27, 155, 19);
		contentPane.add(txtLado);
		txtLado.setColumns(10);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setBounds(197, 61, 155, 19);
		contentPane.add(txtPerimetro);
		txtPerimetro.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(197, 95, 155, 19);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setBounds(197, 128, 155, 19);
		contentPane.add(txtArea);
		txtArea.setColumns(10);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtLado.setText("");
				txtPerimetro.setText("");
				txtAltura.setText("");
				txtArea.setText("");
				
				
				}
		});
		btnBorrar.setIcon(new ImageIcon(Formulario_EP_19.class.getResource("/Actividad_3/ICONOS/borrar.png")));
		btnBorrar.setBounds(197, 189, 121, 47);
		contentPane.add(btnBorrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setIcon(new ImageIcon(Formulario_EP_19.class.getResource("/Actividad_3/ICONOS/salida-de-emergencia.png")));
		btnSalir.setBounds(341, 189, 109, 47);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_4 = new JLabel("TRIANGULO_EQUILATERO");
		lblNewLabel_4.setBounds(136, 0, 182, 23);
		contentPane.add(lblNewLabel_4);
	}
}
