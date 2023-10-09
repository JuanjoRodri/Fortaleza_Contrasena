package FortalezaContrasena;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FCAsignacion {
	public FCAsignacion() {
		cargar();
		
	}

	char[] caracteresValidos= {'!','@','.',',','+','-','$','#'};
	
	//Poner el directorio a partir del SRC
	private static final String FICHERO_CONFIGURACION ="src/FortalezaContrasena/config.properties";
	
	
	//Valores por defecto
	private static final String PUNTUACION_DOS_VALOR_DEFECTO= "Muy Debilloco";
	private static final String PUNTUACION_CINCO_VALOR_DEFECTO= "Debil";
	private static final String PUNTUACION_SIETE_VALOR_DEFECTO= "Moderada";
	private static final String PUNTUACION_NUEVE_VALOR_DEFECTO= "Fuerte";
	private static final String PUNTUACION_DIEZ_VALOR_DEFECTO= "Muy Fuerte";
	private static final int MAYOR_ZERO_MENOR_SEIS_VALOR_DEFECTO= 0;
	private static final int MAYOR_SIETE_MENOR_OCHO_VALOR_DEFECTO= 1;
	private static final int MAYOR_NUEVE_MENOR_DOCE_VALOR_DEFECTO= 2;
	private static final int MAYOR_TRECE_VALOR_DEFECTO= 3;
	


	//Claves para leer
	

	private static final String PUNTUACION_DOS_CLAVE = "puntuacionDos";
	private static final String PUNTUACION_CINCO_CLAVE = "puntuacionCinco";
	private static final String PUNTUACION_SIETE_CLAVE = "puntuacionSiete";
	private static final String PUNTUACION_NUEVE_CLAVE = "puntuacionNueve";
	private static final String PUNTUACION_DIEZ_CLAVE = "puntuacionDiez";
	private static final String MAYOR_ZERO_MENOR_SEIS_CLAVE = "mayor0MenorIgual6";
	private static final String MAYOR_SIETE_MENOR_OCHO_CLAVE = "mayor7MenorIgual8";
	private static final String MAYOR_NUEVE_MENOR_DOCE_CLAVE = "mayor9MenorIgual12";
	private static final String MAYOR_TRECE_CLAVE = "mayor13";
	
	private Properties configuracion;
	
	//Metodo que lee el fichero de configuracion y lo carga en el objeto Properties
	
	
	private void cargar() {
		
		configuracion = new Properties();
		
		File file = new File(FICHERO_CONFIGURACION);
		
		try (FileReader configReader = new FileReader(file)) {
            configuracion.load(configReader);
        } catch(IOException e) {
            //Do nothing
        }
    }
		
		
//	private void configuracion() {
//		
//		cargar();
//	}
	
	private String getValor(String clave) {
                       
        return (configuracion.getProperty(clave));
        
    }
	
	public String getPuntuacionDos() {
        try {
            return getValor(PUNTUACION_DOS_CLAVE);
        } catch(Exception e) {
        	System.out.println(e);
            return PUNTUACION_DOS_VALOR_DEFECTO ;
            
        }
    }

	public String getPuntuacionCinco() {
        try {
            return getValor(PUNTUACION_CINCO_CLAVE);
        } catch(Exception e) {
            return PUNTUACION_CINCO_VALOR_DEFECTO ;
        }
    }

	public String getPuntuacionSiete() {
        try {
            return getValor(PUNTUACION_SIETE_CLAVE);
        } catch(Exception e) {
            return PUNTUACION_SIETE_VALOR_DEFECTO ;
        }
    }

	public String getPuntuacionNueve() {
        try {
            return getValor(PUNTUACION_NUEVE_CLAVE);
        } catch(Exception e) {
            return PUNTUACION_NUEVE_VALOR_DEFECTO ;
        }
    }
	public String getPuntuacionDiez() {
        try {
            return getValor(PUNTUACION_DIEZ_CLAVE);
        } catch(Exception e) {
            return PUNTUACION_DIEZ_VALOR_DEFECTO ;
        }
    }
	public int getMayorZeroMenorIgualSeis() {
		try {
			return Integer.parseInt(MAYOR_ZERO_MENOR_SEIS_CLAVE);
		} catch (Exception e) {
			return MAYOR_ZERO_MENOR_SEIS_VALOR_DEFECTO;
		}
	}
	public int getMayorSIETEMenorIgualOcho() {
		try {
			return Integer.parseInt(MAYOR_SIETE_MENOR_OCHO_CLAVE);
		} catch (Exception e) {
			return MAYOR_SIETE_MENOR_OCHO_VALOR_DEFECTO;
		}
	}
	public int getMayorNUEVEMenorIgualDoce() {
		try {
			return Integer.parseInt(MAYOR_NUEVE_MENOR_DOCE_CLAVE);
		} catch (Exception e) {
			return MAYOR_NUEVE_MENOR_DOCE_VALOR_DEFECTO;
		}
	}
	public int getMayorTrece() {
		try {
			return Integer.parseInt(MAYOR_TRECE_CLAVE);
		} catch (Exception e) {
			return MAYOR_TRECE_VALOR_DEFECTO;
		}
	}

	public char[] getCaracteresValidos() {
		return caracteresValidos;
	}
	
}
