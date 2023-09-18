package Actividad_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Circulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRadio;
	private JTextField txtPerimetro;
	private JTextField txtArea;
	private double radio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circulo frame = new Circulo();
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
	
	
	
	//MI CODIGO
	public Circulo(double radio){
		this.radio=radio;
	}
	public double calcularArea() {
		double area=Math.PI*Math.pow(radio, 2);
		return area; 
	}
	public double calcularPerimetro() {
		double perimetro=2*Math.PI*radio;
		return perimetro;
	}
	
	
	
	public Circulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RADIO");
		lblNewLabel.setBounds(55, 45, 115, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PERIMETRO");
		lblNewLabel_1.setBounds(55, 86, 115, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AREA");
		lblNewLabel_2.setBounds(55, 127, 115, 13);
		contentPane.add(lblNewLabel_2);
		
		txtRadio = new JTextField();
		txtRadio.setBounds(216, 42, 188, 19);
		contentPane.add(txtRadio);
		txtRadio.setColumns(10);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setBounds(216, 83, 188, 19);
		contentPane.add(txtPerimetro);
		txtPerimetro.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setBounds(214, 124, 190, 19);
		contentPane.add(txtArea);
		txtArea.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MI CODIGO
				radio=Double.parseDouble(txtRadio.getText());
				Circulo circulo=new Circulo(radio);
				txtArea.setText(String.valueOf(circulo.calcularArea()));
				txtPerimetro.setText(String.valueOf(circulo.calcularPerimetro()));
				
	
					
				
			}
		});
		btnCalcular.setIcon(new ImageIcon(Circulo.class.getResource("/Actividad_3/ICONOS/calculadora.png")));
		btnCalcular.setBounds(36, 196, 126, 45);
		contentPane.add(btnCalcular);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtRadio.setText("");
				txtArea.setText("");
				txtPerimetro.setText("");
				
			}
		});
		btnBorrar.setIcon(new ImageIcon(Circulo.class.getResource("/Actividad_3/ICONOS/borrar.png")));
		btnBorrar.setBounds(170, 196, 115, 45);
		contentPane.add(btnBorrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setIcon(new ImageIcon(Circulo.class.getResource("/Actividad_3/ICONOS/salida-de-emergencia.png")));
		btnSalir.setBounds(300, 196, 104, 45);
		contentPane.add(btnSalir);
	}

}
