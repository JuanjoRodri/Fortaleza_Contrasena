package FortalezaContrasena;



public class FCCalculos {
private FCAsignacion fca;
	
	public FCCalculos(FCAsignacion fca) {
		this.fca=fca;
	}

	
	int puntuacionFinal = 0;
	
	//Longitud
	public int longitudContrasena (String contrasenaDesdeMain) {
		int puntuacion = 0 ;

		int longitud =contrasenaDesdeMain.length();
		
		if (longitud >=0 && longitud <=6) {
			puntuacion=fca.getMayorZeroMenorIgualSeis();
		}else if(longitud >= 7 && longitud <= 8) {
			puntuacion=fca.getMayorSIETEMenorIgualOcho();
		}else if(longitud >= 9 && longitud <= 12) {
			puntuacion=fca.getMayorNUEVEMenorIgualDoce();
		}else 
			puntuacion=fca.getMayorTrece();
		
		this.puntuacionFinal = puntuacion;
		return longitud;
	
	}
	/*
	 * Uso de letras. Se le pone un or por si tiene muchos caracteres 
	 * y con que tenga 1 letra al principio dejaria de ejecutarse el if
	 * 
	 */

	
	public int usoDeLetras (String contrasenaDesdeMain) {

		int letras = 0;
		for (int i = 0; i < contrasenaDesdeMain.length(); i++) {
			char c = contrasenaDesdeMain.charAt(i);
			if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {

				letras++;	
			}
		}
		if (letras > 0) {
			puntuacionFinal++;	
			
		}
		
		if (letras > 1) {
			usoMayusculasYMinusculas(contrasenaDesdeMain);
			
		}
		return letras;
	}
	//Uso de Mayusculas y minusculas solo si uso de letras ha encontrado una letra.
	public void usoMayusculasYMinusculas(String contrasenaDesdeMain) {
		boolean mayusculas=false;
		boolean minusculas=false;
		for (int i = 0; i < contrasenaDesdeMain.length(); i++) {
			char c = contrasenaDesdeMain.charAt(i);
			if (c >= 'a' && c <= 'z') {
				minusculas=true;
				
			}else if (c >= 'A' && c <= 'Z') {
				mayusculas=true;
				
			}
			
		}
		if (minusculas && mayusculas) {
			puntuacionFinal+=2;

		}
		
	}
//Numeros
	public void usoDeNumeros (String contrasenaDesdeMain) {
		boolean contieneNumero=false;
		for (int i = 0; i < contrasenaDesdeMain.length(); i++) {
			char c = contrasenaDesdeMain.charAt(i);
			if (c >='0' && c <='9') {
				contieneNumero=true;
				
			}
			
		}
		
		if (contieneNumero) {
			puntuacionFinal++;
		}
		
	}
	
	//Uso de Simbolos
	public void usoDeSimbolos (String contrasenaDesdeMain) {
		
		boolean contieneSimbolo=false;
		for (int i = 0; i < contrasenaDesdeMain.length(); i++) {
			char c = contrasenaDesdeMain.charAt(i);
			for(int caracter:fca.getCaracteresValidos()) {
				if (caracter == c)				
			
					contieneSimbolo=true;
			}
			
		}
		if (contieneSimbolo) {
			puntuacionFinal+=2;

			
		}
		
	}
	//Extra punto
	public void extraPunto(int puntuacionactual) {
		
		if (puntuacionactual==9) {
			puntuacionFinal++;
			
		}	
		
	}
	
	public int getPuntuacionFinal() {
		return puntuacionFinal;
	}

}
