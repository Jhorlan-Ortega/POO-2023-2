package Ejercicios_Trabajo_2;
import javax.swing.*;
public class POO_EP_CAP4_11 {

	public static void main(String[] args) {
	System.out.println("INGRESA 3 VALORES DIFERETES");
	 double NUM_1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero A: "));
	 double NUM_2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero B: "));
	 double NUM_3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero C: "));
	 double MAYOR=0; 
	 if ((NUM_1>NUM_2)&&(NUM_1>NUM_3)) {
		 MAYOR=NUM_1;
	 }
	 else if ((NUM_2>NUM_1)&&(NUM_2>NUM_3)){
		 MAYOR=NUM_2;
	 }
	 else if ((NUM_3>NUM_2)&&(NUM_3>NUM_1)) {
		 MAYOR=NUM_3;
	 }
	 else if ((NUM_1==NUM_2)&&(NUM_2==NUM_3) ){
		 System.out.println("Haz ingreso tres valores de igual valor");
	 }
	 System.out.println("El numero mayor es: "+MAYOR);

	}

}
