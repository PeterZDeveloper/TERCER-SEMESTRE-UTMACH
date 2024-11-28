package principal;
import algoritmos.AlgoritmosListas;
import tadLista.Lista;
import tadLista.TadLista;

public class PruebaTadLista {

	public static void main(String[] args) {
        // Crear una lista
        Lista<Integer> lista = new TadLista<>("Mi lista");
        Lista<Integer> lista1 = new TadLista<>("Mi lista copia 1");
        Lista<Integer> lista2 = new TadLista<>("Mi lista copia 2");

        // Insertar datos al principio
        System.out.println("Insertando datos al principio se crea la lista: 8, 4, 3, 7");
        AlgoritmosListas.insertarAlPrincipio(lista, 7);
        AlgoritmosListas.insertarAlPrincipio(lista, 3);
        AlgoritmosListas.insertarAlPrincipio(lista, 4);
        AlgoritmosListas.insertarAlPrincipio(lista, 8);
        lista.imprimirLista();

        // Contar los elementos de la lista
        System.out.println("Contar los elementos de la lista:");
        System.out.println("Cantidad de elementos de la lista  " + lista.getNombre() + ": "+ AlgoritmosListas.contar(lista));

        // Eliminar el primero de la lista
        System.out.println("Eliminar el primero de la lista:");
        AlgoritmosListas.eliminarPrimero(lista);
        lista.imprimirLista();

        // Insertar al final el 99
        System.out.println("Insertar al final el 99:");
        AlgoritmosListas.insertarAlFinal(lista, 99);
        lista.imprimirLista();

        // Duplicar la lista con el método 1 (insertando al final)
        System.out.println("Se copia la lista método 1:");
        AlgoritmosListas.duplicarLista1(lista, lista1);
        lista1.imprimirLista();

        // Duplicar la lista con el método 2 (insertando al principio)
     System.out.println("Se copia la lista método 2:");
     AlgoritmosListas.duplicarLista2(lista, lista2);
     lista2.imprimirLista();

        // Buscar el 4 y el 5
   System.out.println("\nBuscar el 4 y el 5:");
   System.out.println("Se busca el dato 4: " + (AlgoritmosListas.buscar(lista, 4)? "ENCONTRADO":"NO ENCONTRADO"));
   System.out.println("Se busca el dato 5: " + (AlgoritmosListas.buscar(lista, 5)? "ENCONTRADO":"NO ENCONTRADO"));

    
	}

}
