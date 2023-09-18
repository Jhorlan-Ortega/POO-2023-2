package Actividad_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Formulario_Prueba_Figuras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_Prueba_Figuras frame = new Formulario_Prueba_Figuras();
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
	
	
	
	
	public Formulario_Prueba_Figuras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCirculo = new JButton("CIRCULO");
		btnCirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Circulo circulo=new Circulo();
				circulo.setVisible(true);
			}
		});
		btnCirculo.setIcon(new ImageIcon(Formulario_Prueba_Figuras.class.getResource("/Actividad_3/ICONOS/circulo.png")));
		btnCirculo.setBounds(159, 38, 150, 37);
		contentPane.add(btnCirculo);
		
		JButton btnTriangulo = new JButton("TRIANGULO");
		btnTriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TrianguloRectangulo triangulo= new TrianguloRectangulo();
				triangulo.setVisible(true);
			}
		});
		btnTriangulo.setIcon(new ImageIcon(Formulario_Prueba_Figuras.class.getResource("/Actividad_3/ICONOS/angulo-recto.png")));
		btnTriangulo.setBounds(159, 93, 150, 37);
		contentPane.add(btnTriangulo);
		
		JButton btnNewButton_2 = new JButton("CUADRADO");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cuadrado cuadrado=new Cuadrado();
				cuadrado.setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Formulario_Prueba_Figuras.class.getResource("/Actividad_3/ICONOS/cuadrado.png")));
		btnNewButton_2.setBounds(159, 205, 150, 37);
		contentPane.add(btnNewButton_2);
		
		JButton btnRectangulo = new JButton("RECTANGULO");
		btnRectangulo.setIcon(new ImageIcon(Formulario_Prueba_Figuras.class.getResource("/Actividad_3/ICONOS/rectangulo.png")));
		btnRectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rectangulo rectangulo=new Rectangulo();
				rectangulo.setVisible(true);
				
			}
		});
		btnRectangulo.setBounds(159, 148, 150, 37);
		contentPane.add(btnRectangulo);
	}

}
