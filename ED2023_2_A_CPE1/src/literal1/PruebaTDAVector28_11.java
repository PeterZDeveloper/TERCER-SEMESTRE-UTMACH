package literal1;

import algoritmos.Algoritmos;
import algoritmos.Persona;

public class PruebaTDAVector28_11 {
public static void main(String[] args) {
	long  resul;
	
	Persona p1 = new Persona("Juan", 20);
	Persona p2 = new Persona("Timoteo", 20);

	//Algoritmo recursivo factorial
	resul = Algoritmos.factorial(4);
	
	System.out.println("6! = " + resul);
	//Algoritmo recursivo potencia
	resul = Algoritmos.potencia(2, 4);
	
	System.out.println("2^4= "+ resul);
	
	//Comparar por edad
	if (p1.compareTo(p2) < 0)
		System.out.println(p1 + " Es menor que " + p2);
	else
		if(p1.compareTo(p2)>0)
			System.out.println(p1 + " Es mayor " + p2);
		else 
			System.out.println(p1 + " es igual a " + p2);
	
}
}
