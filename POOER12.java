package Ejersicios_Trabajao1_POO;

import javax.swing.JOptionPane;

public class POOER12 {

	public static void main(String[] args) {
		double rete_fuente;
		double sa_bruto;
		final int dias;
		final double precio;
		double re_fuente;
		double sa_neto;
		
	int pregunta=Integer.parseInt(JOptionPane.showInputDialog("Desea realizar el ejerciso con: \n1. Valores por defecto: \n2.Valores por consola: "));
	if (pregunta==1) {
		precio=5000;
		dias=48;
		rete_fuente=(12.5)/100;
		sa_bruto= dias*precio;
		re_fuente=sa_bruto*rete_fuente;
		sa_neto=sa_bruto-re_fuente;
		System.out.println("El salario bruto: "+sa_bruto+"\nLa retencion fuente: "+re_fuente+"\nSalario neto del Trabajador: "+sa_neto);
	}
	else {
		dias=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dias trabajados: "));
		precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor de hora trabajada: "));
		rete_fuente=Double.parseDouble(JOptionPane.showInputDialog("Ingrese retencion en la fuente en porcentaje (%): "));
		rete_fuente/=100;
		sa_bruto= dias*precio;
		re_fuente=sa_bruto*rete_fuente;
		sa_neto=sa_bruto-re_fuente;
		System.out.println("El salario bruto: "+sa_bruto+"\nLa retencion fuente: "+re_fuente+"\nSalario neto del Trabajador: "+sa_neto);
		
	}
	
	

	}

}
