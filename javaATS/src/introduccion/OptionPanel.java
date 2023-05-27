package introduccion;

import javax.swing.JOptionPane;

// Vamos a utilizar la interfaz grafica para preguntar datos, sin usar la consola
public class OptionPanel {
	public static void main(String[] args) {
		String cadena;
		int entero;
		char caracter;
		double decimal;
		
		//Pedimos al usuario el input:
		
		cadena = JOptionPane.showInputDialog("Ingresa una frase: ");
		entero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entero: ")); //ParseInt transforma todos los caracteres del input a numero entero
		caracter = JOptionPane.showInputDialog("Ingresa un caracter").charAt(0);
		decimal = Float.parseFloat(JOptionPane.showInputDialog("Ingresa un numero decimal usando: "));
		
		//Ahora mostramos los datos al usuario:
		
		JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
		JOptionPane.showMessageDialog(null, "El entero es: " + entero);
		JOptionPane.showMessageDialog(null, "El caracter es: " + caracter);
		JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
	}

}
