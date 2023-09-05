package Ejercicios_Trabajo_2;

public class PruebaFiguras {

	public static void main(String[] args) {
		Circulo figura_1=new Circulo(2);
		Rectangulo figura_2=new Rectangulo(1,2);
		Cuadrado figura_3=new Cuadrado(3);
		TrianguloRectangulo figura_4=new TrianguloRectangulo(3,5);
		System.out.println("El area del circulo es: "+figura_1.calcularArea());
		System.out.println("El perimetro del circulo es: "+figura_1.calcularPerimetro());
		System.out.println(" ");
		System.out.println("El area del rectangulo es: "+figura_2.calcularArea());
		System.out.println("El perimetro el rectangulo es: "+figura_2.calcularPerimetro());
		System.out.println(" ");
		System.out.println("El area del cuadrado es: "+figura_3.calcularArea());
		System.out.println("El perimetro del cuadrado es: "+figura_3.calcularPerimetro());
		System.out.println(" ");
		System.out.println("El area del triangulo es: "+figura_4.calcularArea());
		System.out.println("El perimetro del triangulo es: "+figura_4.calcularPerimetro());
		System.out.println("La hipotenusa del triangulo es: "+figura_4.calcularHipotenusa());
		figura_4.determinarTipoTriangulo();
	}

}
class Circulo {
	int radio; 
	
	public Circulo(int radio){
		this.radio=radio;
	}
	public double calcularArea() {
		double area=Math.PI*Math.pow(radio, 2);
		return area; 
	}
	public double calcularPerimetro() {
		double perimetro=2*Math.PI*radio;
		return perimetro;
	}
}

class Cuadrado{
	int lado; 
	
	public Cuadrado(int lado) {
		this.lado=lado;
	}
	public double calcularArea() {
		double area=Math.pow(lado, 2);
		return area;
	}
	public double calcularPerimetro() {
		double perimetro=4*lado;
		return perimetro;
	}
}
class Rectangulo{
	int base; 
	int altura;
	
	public Rectangulo(int base, int altura) {
		this.base=base; 
		this.altura=altura;
	}
	public double calcularArea() {
		double area=base*altura;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro=2*(base+altura);
		return perimetro;
	}
}
class TrianguloRectangulo{
	int base; 
	int altura; 
	
	public TrianguloRectangulo(int base, int altura) {
		this.base=base;
		this.altura=altura;
	}
	public double calcularArea() {
		double area=(base*altura)/2;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro=base+altura+(Math.sqrt((Math.pow(base, 2)+Math.pow(altura, 2))));
		return perimetro;
	}
	public double calcularHipotenusa() {
		double hipotenusa=(Math.sqrt((Math.pow(base, 2)+Math.pow(altura, 2))));
		return hipotenusa;
	}
	public void determinarTipoTriangulo() {
		if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
			System.out.println("Es un triángulo equilátero");
		}
		else if ((base != altura) && (base != calcularHipotenusa()) &&(altura != calcularHipotenusa())) {
			System.out.println("Es un triángulo escaleno");
		}
		else {
			System.out.println("Es un triángulo isósceles");
		}
	}
	
	
	
	
	
}