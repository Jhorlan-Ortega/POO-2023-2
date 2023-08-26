package Ejersicios_Trabajao1_POO;

import javax.swing.JOptionPane;

public class POOER_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom_trabajador=JOptionPane.showInputDialog("Nombre del trabajador: ");
		int horas_trabajadas=Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas: "));
		double valor_hora=Double.parseDouble(JOptionPane.showInputDialog("Valor de hora normal trabajada: "));
		int horas_extras;
		int horas_extras_de8;
		double salario;
		if (horas_trabajadas>40) {
			horas_extras=horas_trabajadas-40;
			if (horas_extras>8){
				horas_extras_de8=horas_extras-8;
				salario=40*valor_hora+(16*valor_hora)+(horas_extras_de8)*(valor_hora*3);
			}
			else {
				salario=(40*valor_hora)+(2*valor_hora)*horas_extras;
			}
			
		}else {
			salario=horas_trabajadas*valor_hora;
		}
		System.out.println("EL TRABAJADOR,"+nom_trabajador+" DEVENGO: $"+salario);
			

	}

}
