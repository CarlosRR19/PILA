package go;

import ejercicio.Pila;
import error.PilaLlenaException;
import utilidad.Write;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pila pila = new Pila();
		
		//Primera tanda de instrucciones
		for(int i = 0; i < 40; i++) {
			try {
				//Se genera un número aleatorio
				int numero = (int) (Math.random() * 100 - 1 + 1) + 1;
				pila.add(numero);
			} catch (PilaLlenaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(pila.toString());
		Write.save(pila, "salida1.txt");
		
		//Segunda tanda de instruncciones
		for(int i = 0; i < 10; i++) {
			pila.get();
		}
		System.out.println(pila.toString());
		Write.save(pila, "salida2.txt");
		
		//Tercera tanda de instrucciones
		for(int i = 0; i < 30; i++) {
			pila.get();
		}
		System.out.println(pila.toString());
		
	}

}
