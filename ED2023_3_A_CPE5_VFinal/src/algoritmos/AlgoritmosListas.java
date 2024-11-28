package algoritmos;

import tadLista.Lista;
import tadLista.TadLista;

public class AlgoritmosListas {
	public static <T> void insertarAlPrincipio(Lista<T> lista, T dato) {
		if (lista != null) {
			lista.crearNodo();
			lista.asignarClave(dato);
		}
	}

//metodo para contar:

	public static <T> int contar(Lista<T> lista) {
		if (lista != null) {
			Lista<T> aux = new TadLista<>();
			aux.asignarReferencia(lista.devolverReferencia()); // solo se hace una vez asigna aux al primer termino
			return contarR(aux);
		} else
			return -1;
	}

	private static <T> int contarR(Lista<T> aux) {
		if (aux != null && !aux.esNulo()) {
			aux.asignarReferencia(aux.devolverSiguiente()); // Con esta linea se mueve el auxiliar
			return 1 + contarR(aux);
		} else
			return 0;
	}

// Método para eliminar el primer elemento de la lista
	public static <T> void eliminarPrimero(Lista<T> lista) {
		// Verifica si la lista no está vacía
		if (lista != null && !lista.esNulo()) {
			// Asigna la referencia del segundo nodo como nuevo primer nodo
			lista.asignarReferencia(lista.devolverSiguiente());
			// asignar referencia asigna la referncia de inicio
			// devolver siguiente te da el siguiente termino (su clave)
		}
	}

	public static <T> void insertarAlFinal(Lista<T> lista, T dato) {
		if (lista != null) {
			if (!lista.esNulo()) {
				Lista<T> aux = new TadLista<>(); // crear axuliar
				aux.asignarReferencia(lista.devolverReferencia()); // crea axuiliar
				insertarAlFinalR(aux, dato);
			} else {
				insertarAlPrincipio(lista, dato); // inserta al principio si la lista esta vacia
			}
		}
	}

	private static <T> void insertarAlFinalR(Lista<T> aux, T dato) {
		if (aux.devolverSiguiente() != null) {
			aux.asignarReferencia(aux.devolverSiguiente());
			insertarAlFinalR(aux, dato);
		} else {
			Lista<T> aux2 = new TadLista<>(); // se la declara aqui porque solo se la emplea en este momento
			insertarAlPrincipio(aux2, dato);
			aux.asignarReferenciaSiguiente(aux2.devolverReferencia());
		}
	}

	public static <T> void duplicarLista1(Lista<T> listaO, Lista<T> listaD) {
		if (listaO != null && listaD != null) {
			Lista<T> aux = new TadLista<>();
			aux.asignarReferencia(listaO.devolverReferencia()); // referencia al inicio una vez
			duplicarLista1R(aux, listaD);

		}

	}

	private static <T> void duplicarLista1R(Lista<T> aux, Lista<T> listaD) { // recursividad de cabeza, proceso en la
																				// ida
		if (!aux.esNulo()) {
			insertarAlFinal(listaD, aux.devolverClave()); // se inserta al final primero
			aux.asignarReferencia(aux.devolverSiguiente()); // Con esta linea se mueve el auxiliar por la lista
			duplicarLista1R(aux, listaD);
		}

	}

	public static <T> void duplicarLista2(Lista<T> listaO, Lista<T> listaD) {
		if (listaO != null && listaD != null) {
			Lista<T> aux = new TadLista<>();
			aux.asignarReferencia(listaO.devolverSiguiente());
			duplicarLista2R(aux, listaD);

		}
	}

	private static <T> void duplicarLista2R(Lista<T> aux, Lista<T> listaD) { // recursividad intermedia, proceso en la
																				// vuelta
		T elem;
		if (aux != null && !aux.esNulo()) { // proceso de ida
			elem = aux.devolverClave(); // alamacenamos el valor del nodo en elem
			aux.asignarReferencia(aux.devolverSiguiente()); // avanzar
			duplicarLista2R(aux, listaD); // repetir todo
			// proceso de vuelta
			insertarAlPrincipio(listaD, elem); //inserta al principio
			//hay procesos en la ida y en la vuelta por lo que es intermedia su recursividad
		}

	}

	public static <T extends Comparable<T>> boolean buscar(Lista<T> lista, T dato) {
		if (lista!= null) {
			Lista<T> aux = new TadLista<>();
			aux.asignarReferencia(lista.devolverReferencia()); // referencia al inicio una vez
			return buscarR(aux, dato);
		}else
		return false;
	}

	private static <T extends Comparable<T>> boolean buscarR(Lista<T> aux, T dato) { //recursividad de cola 
		boolean resul = false;
		if (!aux.esNulo()) {
			if(aux.devolverClave().compareTo(dato)==0) {
				resul = true; //transicion aqui todas las llamas culminan
			}
			else {
				aux.asignarReferencia(aux.devolverSiguiente()); // avanzar
				resul = buscarR(aux, dato); // se asiga el valor tras completar toda la recursividad
			}
		}
		return resul; 
	}

	/*
	 * recursivos de preferencia): •<T> int contar(Lista<T> lista) •<T> void
	 * eliminarPrimero(Lista<T>) •<T> void insertarAlFinal(Lista<T> lista, T dato)
	 * •<T> void duplicarLista1(Lista<T> listaO, Lista<T> listaD) •<T> void
	 * duplicarLista2(Lista<T> listaO, Lista<T> listaD) •<T> boolean buscar(Lista<T>
	 * lista, T dato)
	 */

}
