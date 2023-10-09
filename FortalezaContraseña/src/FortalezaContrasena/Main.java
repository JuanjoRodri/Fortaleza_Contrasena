package FortalezaContrasena;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inicioPrograma();
		
	}
		
	public static void inicioPrograma () {
		
		
		
		FCAsignacion fca= new FCAsignacion();
		FCUsuario usuario = new FCUsuario(fca);
		FCCalculos contrasena = new FCCalculos(fca);
		FCConsultor consultor = new FCConsultor(fca);
		
		usuario.IntroduccionContrasena();
			
		//introduccion contraseña
		System.out.println("La contraseña escrita por el usuario es : " + usuario.getContrasena());
		System.out.println("Se va a proceder al calculo de la fortaleza de la contraseña.");
		System.out.println("*****************************************************");
		
		//Longitud 
		System.out.println("La longitud de la contraseña es de: "+ contrasena.longitudContrasena(usuario.getContrasena()) + " caracteres");
		System.out.println("*****************************************************");
		
		//Uso de letras, mayusculas y minusculas 
		System.out.println("Calculando si tiene letras, mayusculas y minusculas.");
		contrasena.usoDeLetras(usuario.getContrasena());
		System.out.println("*****************************************************");
		
		//numeros
		System.out.println("Calculando si tiene numeros.");
		contrasena.usoDeNumeros(usuario.getContrasena());
		System.out.println("*****************************************************");
		
		//Simbolos
		System.out.println("Calculando si tiene simbolos.");
		contrasena.usoDeSimbolos(usuario.getContrasena());	
		System.out.println("*****************************************************");
		
		//extra punto
		System.out.println("Calculando si la contraseña mereze un extra por seguridad.");
		contrasena.extraPunto(contrasena.getPuntuacionFinal());;
		System.out.println("*****************************************************");
		
		
		System.out.println("Su contraseña tiene un total de : "+ contrasena.getPuntuacionFinal()+ " Puntos.");
		System.out.println("Y tiene una fortaleza: " + consultor.fortaleza(contrasena.getPuntuacionFinal()));
		consultor.preguntaUsuario(contrasena.getPuntuacionFinal());
		
	
		
	}

}
