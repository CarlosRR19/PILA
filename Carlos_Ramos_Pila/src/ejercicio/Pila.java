package ejercicio;

import java.util.ArrayList;

import error.PilaLlenaException;

public class Pila {

	// Como no importa si hay número repetidos, se usa un ArrayList
	private ArrayList<Integer> numeros;
	private boolean llena;
	private boolean vacia;

	public Pila() {
		numeros = new ArrayList<Integer>();
		llena = false;
		vacia = false;
	}

	/*
	 * Antes de añadir un número se comprueba si el ArrayList ha alcanzado el límite
	 * de los 30, si lo ha hecho, la acción no se ejerce y se lanza una excepción
	 * 
	 * Los números se añaden siempre en la primera posición para cumplir con las
	 * condiciones establecidas
	 */

	public void add(int numero) throws PilaLlenaException {
		if (numeros.size() != 30) {
			numeros.add(0, numero);
		} else {
			PilaLlenaException error = new PilaLlenaException("Pila llena");
			throw error;
		}
	}

	/*
	 * Antes de eliminar un número se comprueba si el ArrayList está vacío, si lo
	 * está, la acción no se ejerce
	 * 
	 * Se va aliminando siempre el número en la primera posición
	 */
	public void get() {
		if (numeros.size() != 0) {
			numeros.remove(0);
		}
	}

	/*
	 * Se hace uso del else en ambos casos para evitar errores si el método se llama
	 * más de una vez
	 */
	public boolean isLlena() {
		if (numeros.size() == 30) {
			llena = true;
		} else {
			llena = false;
		}
		return llena;
	}

	public boolean isVacia() {
		if (numeros.size() == 0) {
			vacia = true;
		} else {
			vacia = false;
		}
		return vacia;
	}

	// Devuelve la cantidad de números dentro de la pila
	public int getCantidadNumeros() {

		return numeros.size();
	}

	// Devuelve la cantidad de números de la pila
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	// Imprime la pila
	@Override
	public String toString() {
		return ">> " + numeros;
	}

}
