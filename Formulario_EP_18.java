package Actividad_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class Formulario_EP_18 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtHoras;
	private JTextField txtValor;
	private JTextField txtRete;
	private JTextField txtSalario_bruto;
	private JTextField txtSalario_neto;
	private double codigo;
	private String nombre;
	private int horas;
	private double valor_hora;
	private double retefuente;
	private double salario_bruto ;
	private double salario_neto;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_EP_18 frame = new Formulario_EP_18();
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
	
	
	
	public Formulario_EP_18(int horas,double valor_hora,double retefuente) {
			
			this.horas=horas;
			this.valor_hora=valor_hora;
			this.retefuente=retefuente;
		}
	public double  Salario_bruto(int horas,double valor_hora) {
			return  horas*valor_hora;
			
		}
	public double Salario_neto(int horas,double valor_hora) {
			salario_bruto=Salario_bruto(horas,valor_hora);
			salario_neto=salario_bruto-(salario_bruto*(retefuente/100));
			return salario_neto;
		}
	
		
	public Formulario_EP_18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(45, 21, 45, 13);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CODIGO");
		lblNewLabel_1.setBounds(72, 10, 99, 39);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NOMBRES");
		lblNewLabel_2.setBounds(72, 44, 108, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("HORAS TRABAJADAS");
		lblNewLabel_3.setBounds(72, 74, 136, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("VALOR POR HORA");
		lblNewLabel_4.setBounds(72, 105, 108, 29);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RETEFUENTE");
		lblNewLabel_5.setBounds(72, 144, 99, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("SALARIO BRUTO");
		lblNewLabel_6.setBounds(72, 177, 99, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("SALARIO NETO");
		lblNewLabel_7.setBounds(72, 206, 99, 13);
		contentPane.add(lblNewLabel_7);
		
		txtCodigo = new JTextField();
		txtCodigo.setToolTipText("txtCodigo");
		txtCodigo.setBounds(241, 21, 128, 19);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(241, 49, 128, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(241, 79, 128, 19);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(241, 110, 128, 19);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtRete = new JTextField();
		txtRete.setBounds(241, 141, 128, 19);
		contentPane.add(txtRete);
		txtRete.setColumns(10);
		
		txtSalario_bruto = new JTextField();
		txtSalario_bruto.setBounds(241, 174, 128, 19);
		contentPane.add(txtSalario_bruto);
		txtSalario_bruto.setColumns(10);
		
		txtSalario_neto = new JTextField();
		txtSalario_neto.setBounds(241, 203, 128, 19);
		contentPane.add(txtSalario_neto);
		txtSalario_neto.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setIcon(new ImageIcon(Formulario_EP_18.class.getResource("/Actividad_3/ICONOS/calculadora.png")));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				codigo=Double.parseDouble(txtCodigo.getText());
		        String nom=txtNombre.getText();
		        nombre=nom.toUpperCase();
		        horas=Integer.parseInt(txtHoras.getText());
		        valor_hora=Double.parseDouble(txtValor.getText());
		        retefuente=Double.parseDouble(txtRete.getText());
		        
		        Formulario_EP_18 empleado=new Formulario_EP_18(horas,valor_hora,retefuente);
		        txtCodigo.setText(String.valueOf(codigo));
		        txtNombre.setText(nombre);
		        txtHoras.setText(String.valueOf(horas));
		        txtValor.setText(String.valueOf(valor_hora));
		        txtRete.setText(String.valueOf(retefuente));
		        txtSalario_bruto.setText(String.valueOf(empleado.Salario_bruto(horas,valor_hora)));
		        txtSalario_neto.setText(String.valueOf(empleado.Salario_neto(horas,valor_hora)));
			
			}
		});
		btnCalcular.setBounds(45, 265, 136, 54);
		contentPane.add(btnCalcular);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(555, 265, -27, 7);
		contentPane.add(desktopPane);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCodigo.setText("");
		        txtNombre.setText("");
		        txtHoras.setText("");
		        txtRete.setText("");
		        txtValor.setText("");
		        txtSalario_bruto.setText("");
		        txtSalario_neto.setText("");
		        
		        
		        
			}
		});
		btnBorrar.setIcon(new ImageIcon(Formulario_EP_18.class.getResource("/Actividad_3/ICONOS/borrar.png")));
		btnBorrar.setBounds(215, 265, 154, 54);
		contentPane.add(btnBorrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setIcon(new ImageIcon(Formulario_EP_18.class.getResource("/Actividad_3/ICONOS/salida-de-emergencia.png")));
		btnSalir.setBounds(400, 265, 128, 54);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_8 = new JLabel("EMPLEADO");
		lblNewLabel_8.setBounds(150, 0, 92, 13);
		contentPane.add(lblNewLabel_8);
		
		
	}
}
