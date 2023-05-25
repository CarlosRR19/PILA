package ejercicio;

import java.util.ArrayList;

import error.PilaLlenaException;

public class Pila {

	// Como no importa si hay n�mero repetidos, se usa un ArrayList
	private ArrayList<Integer> numeros;
	private boolean llena;
	private boolean vacia;

	public Pila() {
		numeros = new ArrayList<Integer>();
		llena = false;
		vacia = false;
	}

	/*
	 * Antes de a�adir un n�mero se comprueba si el ArrayList ha alcanzado el l�mite
	 * de los 30, si lo ha hecho, la acci�n no se ejerce y se lanza una excepci�n
	 * 
	 * Los n�meros se a�aden siempre en la primera posici�n para cumplir con las
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
	 * Antes de eliminar un n�mero se comprueba si el ArrayList est� vac�o, si lo
	 * est�, la acci�n no se ejerce
	 * 
	 * Se va aliminando siempre el n�mero en la primera posici�n
	 */
	public void get() {
		if (numeros.size() != 0) {
			numeros.remove(0);
		}
	}

	/*
	 * Se hace uso del else en ambos casos para evitar errores si el m�todo se llama
	 * m�s de una vez
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

	// Devuelve la cantidad de n�meros dentro de la pila
	public int getCantidadNumeros() {

		return numeros.size();
	}

	// Devuelve la cantidad de n�meros de la pila
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	// Imprime la pila
	@Override
	public String toString() {
		return ">> " + numeros;
	}

}
