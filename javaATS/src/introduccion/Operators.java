package introduccion;

import java.util.Scanner;

//Operators.java - Vamos a ver las operaciones basicas en Java
public class Operators {
	public static void main(String[] args) {
		//Primero tomamos dos numeros del usuario
		Scanner entrada = new Scanner(System.in);
		float numero1, numero2, suma, resta, mult, div, residuo;
		System.out.print("Digite primer numero: ");
		numero1 = entrada.nextFloat();
		System.out.print("Digite segundo numero: ");
		numero2 = entrada.nextFloat();
		
		//Ahora las operaciones:
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		mult = numero1 * numero2;
		div = numero1 / numero2;
		residuo = numero1 % numero2; 
		
		//Y por ultimo los resultados en consola:
		System.out.println("Resultado de la Suma: " + suma);
		System.out.println("Resultado de la Resta: " + resta);
		System.out.println("Resultado de la Multiplicacion: " + mult);
		System.out.println("Resultado de la Division: " + div);
		System.out.println("Residuo de la operacion: " + residuo);
	}
}
