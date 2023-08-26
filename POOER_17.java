package Ejersicios_Trabajao1_POO;
import javax.swing.*;

public class POOER_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SUMA = 0;
		int NUM = 1;
		int N=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de números natuales a sumar: "));
		while (NUM<=N) {
			SUMA = SUMA + NUM;
			NUM = NUM + 1;
		}
		System.out.println("La suma es: "+SUMA);

	}

}
