package Ejercicios_Trabajo_2;
import java.util.*;
public class POO_EP_19 {

	public static void main(String[] args) {
		
		//Triangulo equilatero: Sus tres lados tienen la misma longitud
		Scanner entrada=new Scanner(System.in);
		
		double longitud; 
		double area; 
		double perimetro;
		double altura; 
		
		System.out.println("Ingrese la longitud del triangulo equilatero en cm: ");
		longitud=entrada.nextDouble();
		area=((Math.pow(longitud,2 )*Math.sqrt(3))/4);
		perimetro=3*longitud;
		altura= ((longitud*Math.sqrt(3))/2);
		
		System.out.print("El area del triangulo es: ");
		System.out.printf("%1.2f",area);
		System.out.println(" cm^2");
		System.out.println("El perimetro del triangulo es : "+perimetro+ " cm");
		System.out.print("La altura del trinagulo: "); 
		System.out.printf("%1.2f",altura);
		System.out.println(" cm");

		
		
		
		
	}

}
