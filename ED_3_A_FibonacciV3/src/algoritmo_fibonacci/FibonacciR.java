package algoritmo_fibonacci;

public class FibonacciR {
	private long[] serieF;

	// Constructor que inicializa un objeto de la clase FibonacciR con un array de
	// tamaño "size"
	// Luego, invoca al método fibonacciOptimizado para calcular y almacenar los
	// términos de la serie optimizada hasta la posición (size - 1)
	public FibonacciR(int size) {
		// Inicializa el array "serieF" con un tamaño específico
		this.serieF = new long[size];
		// Calcula y almacena los términos de la serie de Fibonacci optimizada en el
		// array "serieF"
		fibonacciOptimizado(size - 1);
	}

	// Método estático que calcula el n-ésimo término de la serie de Fibonacci de
	// manera recursiva
	public static long fibonacci(int n) {
		// Caso base: si n es 1 o 2, devuelve n - 1
		if (n == 1 || n == 2) {
			return n - 1;
		} else {
			// Caso recursivo: suma los términos anteriores de la serie de Fibonacci
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	// Método público que devuelve el valor almacenado en la posición "pos" del
	// array "serieF"
	public long fibonacciControl(int pos) {
		return serieF[pos];
	}

//Método privado que calcula los términos de la serie de Fibonacci optimizada y los almacena en el array "serieF"
	private void fibonacciOptimizado(int n) {
		// Inicializa el primer elemento del array "serieF" con 0
		serieF[0] = 0;

		// Verifica que n sea mayor que 0 antes de continuar
		if (n > 0) {
			// Inicializa el segundo elemento del array "serieF" con 1
			serieF[1] = 1;

			// Inicializa el resto de los elementos del array "serieF" con -1
			for (int i = 2; i <= n; i++) {
				serieF[i] = -1;
			}

			// Invoca al método fibonacciOptimoR para calcular y almacenar los términos de
			// la serie optimizada
			fibonacciOptimoR(n, serieF);
		}
	}

//Método privado recursivo que calcula los términos de la serie de Fibonacci optimizada
	private long fibonacciOptimoR(int n, long[] vector) {
		// Verifica que n sea mayor que 1 y que el valor correspondiente en vector sea
		// -1
		if (n > 1 && vector[n - 1] == -1) {
			// Calcula y almacena el término n-1 de la serie optimizada de Fibonacci
			vector[n - 1] = fibonacciOptimoR(n - 1, vector);
		}

		// Verifica que n sea mayor que 2 y que el valor correspondiente en vector sea
		// -1
		if (n > 2 && vector[n - 2] == -1) {
			// Calcula y almacena el término n-2 de la serie optimizada de Fibonacci
			vector[n - 2] = fibonacciOptimoR(n - 2, vector);
		}

		// Calcula el término n-1 sumando los términos n-1 y n-2 previamente almacenados
		vector[n - 1] = vector[n - 1] + vector[n - 2];

		// Devuelve el término n-1 calculado
		return vector[n - 1];
	}

//Método público que imprime la serie de Fibonacci hasta la posición indicada y el valor en esa posición
	public void imprimirSerie(int pos) {
		// Imprime un encabezado indicando la posición máxima
		System.out.print("Serie de Fibonacci hasta la posición " + pos + ": ");

		// Recorre el array "serieF" hasta la posición indicada
		for (int i = 0; i <= pos; i++) {
			// Si i es mayor que 1 y el valor correspondiente en serieF es -1, calcula y
			// asigna el valor
			if (i > 1 && serieF[i] == -1) {
				serieF[i] = serieF[i - 1] + serieF[i - 2];
			}

			// Imprime el valor en la posición i seguido por un espacio en la misma línea
			System.out.print(serieF[i] + " ");
		}

		// Imprime una nueva línea después de imprimir toda la serie
		System.out.println();

		// Imprime el valor en la posición indicada
		System.out.println("Valor en la posición " + pos + ": " + (pos > 1 ? serieF[pos] : pos));
	}

}
