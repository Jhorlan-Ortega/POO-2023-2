package Ejercicios_Trabajo_2;
import javax.swing.*;
public class POO_EP_18 {

	public static void main(String[] args) {
		int codigo; 
		String nombre; 
		int h_trabajadas;
		double valor_h_trabajada;
		double retefuente;
		double salario_bruto;
		double salario_neto;
		
		
		codigo =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del empleado: "));
		nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
		h_trabajadas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas trabajadas en el mes:  "));
		valor_h_trabajada=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de horas trabajadas en el mes:  "));
		retefuente=Double.parseDouble(JOptionPane.showInputDialog(" Ingrese el valor de retencion en la fuente en porcentaje %: " ));
		
		salario_bruto=h_trabajadas*valor_h_trabajada;
		salario_neto= salario_bruto-(salario_bruto*(retefuente/100));
		String mayusculas=nombre.toUpperCase();
		
		System.out.println("DATOS DEL TRABAJADOR "+mayusculas);
		System.out.println("CODIGO: "+codigo+"\nNOMBRE: "+mayusculas+"\nSALARIO BRUTO: $ "+salario_bruto+"\nSALARIO NETO: $ "+salario_neto);

		
	}

}
