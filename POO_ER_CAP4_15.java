package Ejercicios_Trabajo_2;

import javax.swing.JOptionPane;

public class POO_ER_CAP4_15 {

	public static void main(String[] args) {
	double PESOA=0; 
	double PESOB=0; 
	double PESOC=0; 
	double PESOD=0; 
	
	PESOA=Double.parseDouble(JOptionPane.showInputDialog("ESFERA_A: "));
	PESOB=Double.parseDouble(JOptionPane.showInputDialog("ESFERA_B: "));
	PESOC=Double.parseDouble(JOptionPane.showInputDialog("ESFERA_C: "));
	PESOD=Double.parseDouble(JOptionPane.showInputDialog("ESFERA_D: "));
	
	if ((PESOA==PESOB)&&(PESOA==PESOC)) {
		if (PESOD>PESOA) {
			System.out.println("LA ESFERA D ES LA DIFERENTE Y ");	
		}
		else {
			System.out.println("LA ESFERA D ES LA DIFERENTE Y  ");
		}
	}
	else if ((PESOA==PESOB)&&(PESOA==PESOD)) {
		System.out.println("LA ESFERA C ES LA DIFERENTE");
		if (PESOC>PESOA) {
			System.out.println("Y ES MAYOR PESO");
		}
		else {
			System.out.println("Y ES MENOR PESO");
		}
	}
	else if ((PESOA==PESOC)&&(PESOA==PESOD)) {
		System.out.println("LA ESFERA B ES LA DIFERENTE");
		if (PESOB>PESOD) {
			System.out.println("Y ES DE MAYOR PESO");
		}
		else {
			System.out.println("Y ES MENOR DE PESO");
		}
	}
	else {
		System.out.println("LA ESFERA A ES LA DIFERENTE");
		if (PESOA>PESOB) {
			System.out.println("Y ES DE MAYOR PESO");
		}
		else {
			System.out.println("Y ES DE MENOR PESO");
		}
	}
	
	
	
	}

}
