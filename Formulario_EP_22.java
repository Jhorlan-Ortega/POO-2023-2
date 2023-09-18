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

public class Formulario_EP_22 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtSalarioHora;
	private JTextField txtHoras;
	private JTextField txtSalario;
	private String nombre;
	private double salario_hora;
	private int horas;
	private double salario; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_EP_22 frame = new Formulario_EP_22();
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
	public Formulario_EP_22 (String nombre, double salario_hora,int horas) {
		this.nombre=nombre; 
		this.salario_hora=salario_hora; 
		this.horas=horas;	
	}
	
	public double calculaSalario(int horas, double salario_hora) {
		salario=horas*salario_hora;
		return salario;
	}
	
	public String getNombre(String nombre) {
		return nombre;
	}
	
	public String retorno(int horas, double salario_hora,String nombre) {
		salario=calculaSalario(horas,salario_hora);
		String nom=getNombre(nombre);
		nombre=nom.toUpperCase();
		if (salario>450000) {
			return "NOMBRE: "+nombre+" ,SALARIO: $ "+salario;
		}
		else {
			return "NOMBRE: "+nombre;
		}
	}
	
	public Formulario_EP_22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel =new JLabel("NOMBRE");
		lblNewLabel.setBounds(54, 31, 137, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SALARIO POR HORA");
		lblNewLabel_1.setBounds(54, 64, 137, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("HORAS TRABAJADAS");
		lblNewLabel_2.setBounds(54, 95, 137, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SALARIO");
		lblNewLabel_3.setBounds(54, 118, 137, 54);
		contentPane.add(lblNewLabel_3);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(225, 28, 201, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtSalarioHora = new JTextField();
		txtSalarioHora.setBounds(225, 61, 201, 19);
		contentPane.add(txtSalarioHora);
		txtSalarioHora.setColumns(10);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(225, 92, 201, 19);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(225, 121, 201, 47);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setIcon(new ImageIcon(Formulario_EP_22.class.getResource("/Actividad_3/ICONOS/calculadora.png")));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre=txtNombre.getText(); 
				salario_hora=Double.parseDouble(txtSalarioHora.getText());
				horas=Integer.parseInt(txtHoras.getText());
				Formulario_EP_22 empleado=new Formulario_EP_22() ;
				empleado.calculaSalario(horas, salario_hora);
				txtSalario.setText(String.valueOf(empleado.retorno(horas,salario_hora,nombre)));
				
				
				
				
			}
		});
		btnCalcular.setBounds(27, 193, 141, 47);
		contentPane.add(btnCalcular);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setIcon(new ImageIcon(Formulario_EP_22.class.getResource("/Actividad_3/ICONOS/borrar.png")));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombre.setText("");
				txtSalarioHora.setText("");
				txtHoras.setText("");
				txtSalario.setText("");
			}
		});
		btnBorrar.setBounds(178, 193, 139, 47);
		contentPane.add(btnBorrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setIcon(new ImageIcon(Formulario_EP_22.class.getResource("/Actividad_3/ICONOS/salida-de-emergencia.png")));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(327, 193, 121, 47);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_4 = new JLabel("EMPLEADO_SALARIO");
		lblNewLabel_4.setBounds(147, 0, 137, 13);
		contentPane.add(lblNewLabel_4);
	}
}
