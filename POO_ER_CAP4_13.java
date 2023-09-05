package Ejercicios_Trabajo_2;
import javax.swing.*;
public class POO_ER_CAP4_13 {

	public static void main(String[] args) {
		double VALCOMP;
		String COLOR;
		double VALPAG;
		double PDES;
		
		VALCOMP=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la compra: "));
		COLOR=JOptionPane.showInputDialog("Ingresa el color: ");
		if (COLOR.equalsIgnoreCase("blanco")){
			PDES=0;	
		}
		else if (COLOR.equalsIgnoreCase("verde")) {
			PDES=10;
		}
		else if (COLOR.equalsIgnoreCase("amarillo")) {
			PDES=25;
		}
		else if (COLOR.equalsIgnoreCase("azul")) {
			PDES=50;
		}
		else {
			PDES=100;
		}
		
		VALPAG=VALCOMP-(PDES*VALCOMP/100);
		System.out.println("EL CLIENTE DEBE PAGAR:  $"+VALPAG);

	}

}
