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

public class Formulario_ER_7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtRespuesta;
	private double a ; 
	private double b; 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_ER_7 frame = new Formulario_ER_7();
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
	
	public Formulario_ER_7(double a,double b) {
		this.a=a; 
		this.b=b; 
		
	}
	public String retorno(double a, double b) {
		if (a>b) {
			return "MAYOR: A = "+a;
		}
		else if (a<b) {
			return "MAYOR: B = "+b;
		}
		else {
			return "A="+a+"    SON IGUALES    B="+b;
		}
	}
	
	public Formulario_ER_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VALOR DE A");
		lblNewLabel.setBounds(47, 36, 101, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VALOR DE B");
		lblNewLabel_1.setBounds(47, 82, 101, 16);
		contentPane.add(lblNewLabel_1);
		
		txtA = new JTextField();
		txtA.setBounds(196, 33, 202, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(196, 79, 202, 19);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Double.parseDouble(txtA.getText());
				double b=Double.parseDouble(txtB.getText());
				Formulario_ER_7 mayor=new Formulario_ER_7();
				
				txtRespuesta.setText(String.valueOf(mayor.retorno(a, b)));
				
				
				
				
				
			}
		});
		btnCalcular.setIcon(new ImageIcon(Formulario_ER_7.class.getResource("/Actividad_3/ICONOS/calculadora.png")));
		btnCalcular.setBounds(29, 178, 138, 47);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_2 = new JLabel("N° MAYOR");
		lblNewLabel_2.setBounds(47, 129, 101, 13);
		contentPane.add(lblNewLabel_2);
		
		txtRespuesta = new JTextField();
		txtRespuesta.setBounds(195, 126, 203, 19);
		contentPane.add(txtRespuesta);
		txtRespuesta.setColumns(10);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtRespuesta.setText("");
				
				
				
				
				
			}
		});
		btnBorrar.setIcon(new ImageIcon(Formulario_ER_7.class.getResource("/Actividad_3/ICONOS/borrar.png")));
		btnBorrar.setBounds(183, 178, 140, 47);
		contentPane.add(btnBorrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		System.exit(0);
			}
		});
		btnSalir.setIcon(new ImageIcon(Formulario_ER_7.class.getResource("/Actividad_3/ICONOS/salida-de-emergencia.png")));
		btnSalir.setBounds(333, 178, 113, 47);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_3 = new JLabel("NUMERO MAYOR");
		lblNewLabel_3.setBounds(148, 10, 180, 13);
		contentPane.add(lblNewLabel_3);
	}

}
