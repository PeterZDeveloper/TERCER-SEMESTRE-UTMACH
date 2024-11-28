package algoritmos;

import tadLista.Lista;

public class AlgoritmosListas {
 public static <T> void insertarAlPrincipio (Lista<T> lista, T dato) {
	 lista.crearNodo();
	 lista.asignarClave(dato);
 }


 public static <T> void insertarEntreNodos(Lista<T> lista, T dato) {
     if (!lista.esNulo() && lista.devolverReferencia() != null) {
         Lista<T> aux = (Lista<T>) lista.devolverReferencia();
         aux.crearNodo();
         aux.asignarClave(dato);
     } else {
         System.out.println("No hay suficientes nodos para realizar la inserción.");
     }
 }
 




}
