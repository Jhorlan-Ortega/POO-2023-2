package Ejercicios_Trabajo_2;
import javax.swing.*;
public class POO_ER_CAP4_7 {

	public static void main(String[] args) {
		System.out.println("EN ESTE EJERCICIO EVALUAREMOS DOS VALORES NUMERICOS");
		double a=Double.parseDouble(JOptionPane.showInputDialog("INGRESA EL VALOR DE A: "));
		double b=Double.parseDouble(JOptionPane.showInputDialog("INGRESA EL VALOR DE B: "));
		if (a>b) {
			System.out.println("El numero "+a+" es mayor que el numero "+b);
		}
		else if(a==b) {
			System.out.println("El numero "+a+" es igual que el numero "+b);
		}
		else {
			System.out.println("El numero "+a+" es menor que el numero "+b);
		}
	}

	}


