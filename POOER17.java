package Ejersicios_Trabajao1_POO;
import javax.swing.*;
public class POOER17 {
//Ejercicio 17
	public static void main(String[] args) {
	String solicitud;
	double radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo en cm: "));
	double area=(Math.PI)*(Math.pow(radio, 2));
	double circunferencia=2*Math.PI*radio;
	double volumen;
	System.out.print("El area del circulo es: ");
	System.out.printf("%1.2f",+area);
	System.out.println(" cm^2");
	System.out.print("La circunferencia del circulo es: ");
	System.out.printf("%1.2f",circunferencia);
	System.out.println(" cm");
	solicitud=JOptionPane.showInputDialog("¿Quieres conocer tambien el volumen de una\nesfera de radio "+(int)radio+" cm ?:\nSi\nNo");
	if (solicitud.equalsIgnoreCase("si")){
		volumen=((Math.PI)*(Math.pow(radio, 3)*(4))/3);
		System.out.print("El volumen de una esfera con radio "+radio+" es: ");
		System.out.printf("%1.2f",volumen);
		System.out.println(" cm^3");
	}
	
	
	}

}
