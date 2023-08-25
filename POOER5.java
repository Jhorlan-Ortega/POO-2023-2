package Ejersicios_Trabajao1_POO;
import javax.swing.*;
public class POOER5 {
//Ejersicio 5
	public static void main(String[] args) {
		System.out.println("La suma parte de cero");
		double suma=0; 
		
		double x=Double.parseDouble(JOptionPane.showInputDialog("Ingres el valor de x: ")); 
		suma+=x;
		double y = Double.parseDouble(JOptionPane.showInputDialog("Ingres el valor de y: "));; 
		x=x+(Math.pow(y,2));
		suma=suma+(x/y);
		System.out.println("El valor de la usma es: "+suma);

	}

}
