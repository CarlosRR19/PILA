package utilidad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import ejercicio.Pila;

public class Write {

	private static String FICHERO = "C:\\Users\\rrcar\\Desktop\\Datos\\";
	
	public static void save(Pila pila, String nombreFichero) {
		
		BufferedWriter bw;
		//Se concatena el nombre del fichero con la ruta
		FICHERO += nombreFichero;
		
		try {
			bw = new BufferedWriter(new FileWriter(FICHERO));
			
			//Se usa el toString, ya que es más eficiente que recorrer el ArrayList e ir transcribiendo los números uno por uno
			bw.write(pila.getNumeros().toString());
			
			//Se resetea la ruta para el próximo uso
			FICHERO = "C:\\Users\\rrcar\\Desktop\\Datos\\";
			bw.close();
		} 
		
		catch (Exception e) {
			//fallos
			e.printStackTrace();
		}
	}
}
