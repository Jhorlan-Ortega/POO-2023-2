package Ejercicios_Trabajo_2;
import javax.swing.*;
public class POO_EP_21 {

	public static void main(String[] args) {
		double area=0;
		double perimetro=0;
		double semiperimetro=0;
		String triangulo=" ";
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("TRIANGULOS: \n1. EQUILATERO\n2. ISOSCELES\n3. ESCALENO")); 
		switch(numero) {
		case 1: 
			double lado_unico=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado (cm): "));
			area=(Math.pow(lado_unico, 2)*Math.sqrt(3))/4;
			perimetro=lado_unico*3;
			semiperimetro=perimetro/2;
			triangulo="EQUILATERO";
			break;
		case 2: 
			double base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese base (cm): "));
			double altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura (cm): "));
			area=(base*altura)/2;
			perimetro=base+altura+(Math.sqrt((Math.pow(base,2)+Math.pow(altura,2))));
			semiperimetro=perimetro/2;
			triangulo="ISOSCELES";
			break;
		case 3:
			double lado_1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 1 (cm): "));
			double lado_2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 2 (cm): "));
			double lado_3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 3 (cm): "));
			perimetro=(lado_1+lado_2+lado_3);
			semiperimetro=(lado_1+lado_2+lado_3)/2;
			area=Math.sqrt(semiperimetro*(semiperimetro-lado_1)*(semiperimetro-lado_2)*semiperimetro-lado_3);
			triangulo="ESCALENO";
			break;
		}
		System.out.println("ES UN TRIANGULO: "+triangulo);
		System.out.print("PERIMETRO: ");
		System.out.printf("%1.2f",perimetro);
		System.out.println(" cm");
		System.out.print("SEMIPERIMETRO: ");
		System.out.printf("%1.2f",semiperimetro);
		System.out.println(" cm");
		System.out.print("AREA: ");
		System.out.printf("%1.2f",area);
		System.out.println(" (cm^2)");
		
		
		
		

	}

}
