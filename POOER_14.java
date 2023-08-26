package Ejersicios_Trabajao1_POO;
import javax.swing.*;

public class POOER_14 {

	public static void main(String[] args) {
		int VD1;  //Ventas del departamento 1
		int VD2;  //Ventas del departamento 2
		int VD3;  //Ventas del departamento 3
		double SALAR; //Salario que reciben vendedores en cada departamento
		int TOTVEN;  //Total ventas en la empresa
		double PORVEN;  //Porcentaje equivalente al 33% de ventas totales
		double SALAR1; //Salario de los vendedores en el departamento 1
		double SALAR2; //Salario de los vendedores en el departamento 2
		double SALAR3; //Salario de los vendedores en el departamento 3
		
		VD1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ventas del departamento 1:" ));
		VD2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ventas del departamento 2:" ));
		VD3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ventas del departamento 3:" ));
		SALAR=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Salario que reciben vendedoras en cada departamento:" ));
		TOTVEN = VD1 + VD2 + VD3;
		PORVEN = 0.33 * TOTVEN;
		if (VD1>PORVEN){
			SALAR1 = SALAR + 0.2 * SALAR;
		}
		else {
			SALAR1 = SALAR;
		}
		if (VD2>PORVEN) {
			SALAR2 = SALAR + 0.2 * SALAR;
		}
		else {
			SALAR2 = SALAR;
		}
		if (VD3>PORVEN) {
			SALAR3=SALAR+0.2*SALAR;
		}
		else {
			SALAR3=SALAR;
		}
		System.out.println("SALARIO VENDEDORES DEPTO. 1: "+ SALAR1+
				"\nSALARIO VENDEDORES DEPTO. 2; "+ SALAR2+ "\nSALARIO VENDEDORES DEPTO. 3: "+SALAR3);
	}

}
