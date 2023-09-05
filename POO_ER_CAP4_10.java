package Ejercicios_Trabajo_2;
import javax.swing.*;
public class POO_ER_CAP4_10 {

	public static void main(String[] args) {
		int NI;
		String NOM; 
		double PAT;
		int EST;
		double PAGMAT=50000;
		NI=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de inscripcion: "));
		NOM=JOptionPane.showInputDialog("Ingrese nombres: ");
		PAT=Double.parseDouble(JOptionPane.showInputDialog("Ingrese patrimonio: "));
		EST=Integer.parseInt(JOptionPane.showInputDialog("Ingrese estrato: "));
		
		if ((PAT>2000000) && (EST>3)) {
			PAGMAT=PAGMAT+(0.03*PAT);
		}
		System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+NI+" Y NOMBRE "+NOM+" DEBE PAGAR: $"+PAGMAT);

	}

}
