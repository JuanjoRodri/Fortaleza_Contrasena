package FortalezaContrasena;

import java.util.Scanner;

public class FCConsultor {
	
private FCAsignacion fca;
	
	public FCConsultor(FCAsignacion fca) {
		this.fca=fca;
	}

	public String fortaleza (int puntuacionFinal) {
		
		String respuesta=null;
		
		if (puntuacionFinal>=0 && puntuacionFinal<=2) {
			
			respuesta= fca.getPuntuacionDos();
					
		}else if ( puntuacionFinal >=3 && puntuacionFinal <=5) {
			
			respuesta = fca.getPuntuacionCinco();
			
		}else if ( puntuacionFinal >=6 && puntuacionFinal <=7) {
			
			respuesta = fca.getPuntuacionSiete();
			
		}else if (puntuacionFinal >=8 && puntuacionFinal <=9) {
			
			respuesta = fca.getPuntuacionNueve();
			
		}else if (puntuacionFinal == 10) {
			
			respuesta = fca.getPuntuacionDiez();
			
		}
		return respuesta;
	}
	
	//Puntuacion inferior a 8 que el usuario confirme

	public void preguntaUsuario (int puntuacionFinal) {
		
		Scanner respuesta = new Scanner(System.in);
		
		if (puntuacionFinal < 8) {

			System.out.println("La contraseña no es suficientemente fuerte.");
			System.out.println("Desea aceptar dicha contraseña? SI/NO");
			
			String decision=respuesta.nextLine();
			
			decision.toUpperCase();
			
			if (decision.equals("SI")) {
				System.out.println("Contraseña aceptada");
			}else if(decision.equals("NO")){
				
				FortalezaContrasena.Main.inicioPrograma();
			}
			
		}else {
			System.out.println("Contraseña aceptada");
		}
	}
		
}
