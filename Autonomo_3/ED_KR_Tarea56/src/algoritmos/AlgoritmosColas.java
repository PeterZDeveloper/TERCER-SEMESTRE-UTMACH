package algoritmos;

import tadCola.Cola;
import tadCola.ColaVacia;

public class AlgoritmosColas {
	
	public static <T> int contarCola(Cola<T> cola) {
		int resul = 0;
		try {
			resul = contarColaR(cola);
			cola.invertirCola();
		} catch (ColaVacia e) {
		}

		return resul;
	}
	
	private static <T> int contarColaR(Cola<T> cola) throws ColaVacia {
		int resul;
		T elem;
		if(!cola.colaVacia()) {
			elem = cola.desencolar();
			resul = 1 + contarColaR(cola);
			cola.encolar(elem);
		}else {
			resul = 0;
		}
		return resul;
	}
}
