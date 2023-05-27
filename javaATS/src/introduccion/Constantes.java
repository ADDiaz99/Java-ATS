package introduccion;
/*Constantes.java - Trying constants*/
public class Constantes { 
	
	public static void main(String[] args) {
		int variable = 10;					//Una variable puede cambiar a lo largo del codigo
		variable = 15;						//Esta cambia a 15, a pesar de que fue definida como 10
		System.out.println(variable);
		
		final int CONSTANTE = 20;			//Una constante NO cambia a lo largo del codigo
		System.out.println(CONSTANTE);		//Se escriben el Mayuscula para saber mas facil que son inmodificables
	
	}
		
	

}
