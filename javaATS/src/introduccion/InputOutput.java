package introduccion;

import java.util.Scanner;									//Primero importamos el Scanner para tomar datos de la consola

/*InputOutput.java - testing inputs and outputs*/


public class InputOutput {
	public static void main(String[] args) {
		//Int
		Scanner numero_input = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite un numero: ");
		numero = numero_input.nextInt();					//Debemos definir 'next.Int()' para enteros
		
		System.out.println("El numero que escogiste fue: " + numero);
		
		//Strings
		Scanner cadena_input = new Scanner(System.in);
		String cadena;
		
		System.out.print("Escribe una linea de texto: ");
		cadena = cadena_input.nextLine();					//nextLine() para cadenas de texto
		System.out.println("Texto registrado: " + cadena);
		
		//Character
		Scanner char_input = new Scanner(System.in);
		char caracter;
		
		System.out.print("Escribe un caracter: ");
		caracter = char_input.next().charAt(0);				//y next junto con charAt(0) para obtener solo la primera letra
		System.out.println("Tu caracter es: " + caracter);
		
	}

}
