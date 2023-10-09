package FortalezaContrasena;

import java.util.Arrays;
import java.util.Scanner;

public class FCUsuario {
	
String contrasena;
	
	private FCAsignacion fca;
	
	public FCUsuario(FCAsignacion fca) {
		this.fca=fca;
	}
	FCAsignacion asignacion = new FCAsignacion();
	public void IntroduccionContrasena() {
/*
 * 
 * comprobar que sean menos de 25 caracteres y
 *  '!','@','.',',','+','-','$','#' estos simbolos.
 *  
 */
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Introducir la contraseña que quiere calcular.");
		System.out.println("Evitar usar los simbolos que no aparezcan en la siguiente lista:" + Arrays.toString(asignacion.getCaracteresValidos()) );

		this.contrasena=sc.nextLine();
		
		//sc.close();
	}
	public String getContrasena() {
		return this.contrasena;
	}
	
}