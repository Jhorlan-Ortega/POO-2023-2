package Ejersicios_Trabajao1_POO;

import javax.swing.JOptionPane;

public class POOER14 {

	public static void main(String[] args) {
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero: "));
		System.out.println("El cuadrado del numero"+numero+" es: "+Math.pow(numero, 2)+"\nEl cuadrado del numero "+numero+" es: "+Math.pow(numero,3));
	}

}
