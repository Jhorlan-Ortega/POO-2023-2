package Ejersicios_Trabajao1_POO;
import javax.swing.*;
public class POOER4 {
//Ejercisio 4
	public static void main(String[] args) {
		System.out.println("La mamá de Juan tiene tres hijos");
		int edad_juan=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de Juan: "));
		int edad_alberto=(2*edad_juan)/3;
		int edad_ana=(4*edad_juan)/3;
		int edad_mama=edad_juan+edad_alberto+edad_ana;
		System.out.println("Edad_Juan: "+edad_juan+"\nEdad_Alberto: "+edad_alberto+"\nEdad_Ana: "+edad_ana+"\nEdad_mamá: "+edad_mama);
		
		

	}

}
