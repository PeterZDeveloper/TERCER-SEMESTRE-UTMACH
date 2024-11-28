package mains;

import algoritmos.AlgoritmosListas;
import tadLista.Lista;
import tadLista.TadLista;

public class PruebaTADLista {

	public static void main(String[] args) {
Lista<Integer> lista = new TadLista<>("Mi lista");
AlgoritmosListas.insertarAlPrincipio(lista, 8);
//AlgoritmosListas.insertarAlPrincipio(lista, 1);
//tecnicamente lo inserta entre el 8 y 5
AlgoritmosListas.insertarAlPrincipio(lista, 5);
//metodo que inserta un valor entre el 5 y 5
//AlgoritmosListas.insertarEntreNodos(lista, 1);

lista.imprimirLista();

	}

}
