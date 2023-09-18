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

public class Formulario_ER_10 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIN;
	private JTextField txtNombre;
	private JTextField txtPatrimonio;
	private JTextField txtEstrato;
	private JTextField txtMatricula;
	private int NI;
	private String NOM; 
	private double PAT;
	private int EST;
	private double PAGMAT=50000;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_ER_10 frame = new Formulario_ER_10();
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
	public Formulario_ER_10 (int NI,String NOM,double PAT,int EST) {
		this.NI=NI;
		this.NOM=NOM;
		this.PAT=PAT;
		this.EST=EST;
	}
	
	public double Proceso(double PAT,int EST) {
		if ((PAT>2000000) && (EST>3)) {
			PAGMAT=PAGMAT+(0.03*PAT);
			return PAGMAT;
		}
		else {
			return PAGMAT;
		}
	}
	
	public Formulario_ER_10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N° INSCRIPCION");
		lblNewLabel.setBounds(67, 51, 94, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRES");
		lblNewLabel_1.setBounds(67, 74, 94, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PATRIMONIO");
		lblNewLabel_2.setBounds(67, 97, 94, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ESTRATO");
		lblNewLabel_3.setBounds(67, 120, 94, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MATRICULA");
		lblNewLabel_4.setBounds(67, 143, 94, 13);
		contentPane.add(lblNewLabel_4);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				NI=Integer.parseInt(txtIN.getText());
				NOM=txtIN.getText();
				PAT=Double.parseDouble(txtPatrimonio.getText());
				EST=Integer.parseInt(txtEstrato.getText());
				
				Formulario_ER_10 matricula=new Formulario_ER_10(NI,NOM,PAT,EST) ;
				
				txtIN.setText(String.valueOf(NI));
				txtNombre.setText(NOM);
				txtPatrimonio.setText(String.valueOf(PAT));
				txtEstrato.setText(String.valueOf(EST));
				txtMatricula.setText(String.valueOf(matricula.Proceso(PAT, EST)));
				
				
				
				
				
				
			}
		});
		btnCalcular.setIcon(new ImageIcon(Formulario_ER_10.class.getResource("/Actividad_3/ICONOS/calculadora.png")));
		btnCalcular.setBounds(32, 192, 119, 44);
		contentPane.add(btnCalcular);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtIN.setText("");
				txtNombre.setText("");
				txtPatrimonio.setText("");
				txtEstrato.setText("");
				txtMatricula.setText("");
				
				
				
			}
		});
		btnBorrar.setIcon(new ImageIcon(Formulario_ER_10.class.getResource("/Actividad_3/ICONOS/borrar.png")));
		btnBorrar.setBounds(166, 192, 125, 44);
		contentPane.add(btnBorrar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setIcon(new ImageIcon(Formulario_ER_10.class.getResource("/Actividad_3/ICONOS/salida-de-emergencia.png")));
		btnSalir.setBounds(301, 192, 125, 44);
		contentPane.add(btnSalir);
		
		txtIN = new JTextField();
		txtIN.setBounds(208, 48, 169, 19);
		contentPane.add(txtIN);
		txtIN.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(208, 71, 169, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtPatrimonio = new JTextField();
		txtPatrimonio.setBounds(208, 94, 169, 19);
		contentPane.add(txtPatrimonio);
		txtPatrimonio.setColumns(10);
		
		txtEstrato = new JTextField();
		txtEstrato.setBounds(208, 117, 169, 19);
		contentPane.add(txtEstrato);
		txtEstrato.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(208, 140, 169, 19);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("PAGO DE MATRICULA");
		lblNewLabel_5.setBounds(136, 10, 169, 13);
		contentPane.add(lblNewLabel_5);
	}
}
