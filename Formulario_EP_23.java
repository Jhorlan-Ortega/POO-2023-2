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

public class Formulario_EP_23 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtr1;
	private JTextField txtr2;
	private double a; 
	private double b; 
	private double c;
	private double solucion_1; 
	private double solucion_2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_EP_23 frame = new Formulario_EP_23();
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
	
	public Formulario_EP_23(double a, double b , double c) {
		this.a=a;
		this.b=b; 
		this.c=c;
	}
	public double Solucion_1(double a, double b,double c) {
		solucion_1=(((-1)*b)+(Math.sqrt((Math.pow(b, 2)-(4*a*c)))))/(2*a);
		return solucion_1;
	}
	public double Solucion_2(double a, double b, double c) {
		solucion_2=(((-1)*b)-(Math.sqrt((Math.pow(b, 2)-(4*a*c)))))/(2*a);
		return solucion_2;
	}
	
	
	public Formulario_EP_23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("VALOR DE B");
		lblNewLabel_1.setBounds(54, 77, 82, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("VALOR DE C");
		lblNewLabel_2.setBounds(54, 110, 82, 13);
		contentPane.add(lblNewLabel_2);
		
		txtA = new JTextField();
		txtA.setBounds(219, 36, 182, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(219, 71, 182, 19);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setBounds(219, 107, 182, 19);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				a=Double.parseDouble(txtA.getText());
				b=Double.parseDouble(txtB.getText());
				c=Double.parseDouble(txtC.getText());
				
				Formulario_EP_23 ecuacion=new Formulario_EP_23();
				
				txtr1.setText(String.valueOf(ecuacion.Solucion_1(a,b,c)));
				txtr2.setText(String.valueOf(ecuacion.Solucion_2(a,b,c)));
				
			}
		});
		btnCalcular.setIcon(new ImageIcon(Formulario_EP_23.class.getResource("/Actividad_3/ICONOS/calculadora.png")));
		btnCalcular.setBounds(51, 217, 121, 44);
		contentPane.add(btnCalcular);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
				txtr1.setText("");
				txtr2.setText("");
			}
		});
		btnBorrar.setIcon(new ImageIcon(Formulario_EP_23.class.getResource("/Actividad_3/ICONOS/borrar.png")));
		btnBorrar.setBounds(182, 217, 110, 44);
		contentPane.add(btnBorrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setIcon(new ImageIcon(Formulario_EP_23.class.getResource("/Actividad_3/ICONOS/salida-de-emergencia.png")));
		btnSalir.setBounds(302, 217, 99, 44);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("VALOR DE A");
		lblNewLabel.setBounds(54, 39, 71, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("SOLUCION_1");
		lblNewLabel_3.setBounds(54, 148, 82, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SOLUCION_2");
		lblNewLabel_4.setBounds(54, 183, 82, 13);
		contentPane.add(lblNewLabel_4);
		
		txtr1 = new JTextField();
		txtr1.setBounds(219, 145, 182, 19);
		contentPane.add(txtr1);
		txtr1.setColumns(10);
		
		txtr2 = new JTextField();
		txtr2.setBounds(219, 180, 182, 19);
		contentPane.add(txtr2);
		txtr2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("ECUACION DE SEGUNDO GRADO");
		lblNewLabel_5.setBounds(127, 10, 297, 13);
		contentPane.add(lblNewLabel_5);
	}
}
