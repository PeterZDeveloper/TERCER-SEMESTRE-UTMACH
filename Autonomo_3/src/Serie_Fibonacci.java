
public class Serie_Fibonacci {

	public static void main(String[] args) {
		long tiempo;
		System.out.println("Encontrar valores mediante el algoritmo FIBONACCI\n");
		System.out.println("Búsqueda del valor en la posición " + 5);
		tiempo= System.nanoTime();
		tiempo = System.nanoTime() - tiempo;
		System.out.println(serieFibonacciR(5));
		System.out.println(("El valor se encuentra en la posición = " + 5)+ " en " + tiempo + "ns\n");
		System.out.println("Búsqueda de los valores hasta la posición " + 5);
		tiempo= System.nanoTime();
		fibonacci(5);
		System.out.println(("\nEl valor se encuentra en la posición = " + 5)+ " en " + tiempo + "ns\n");
		
	}
	
	public static long serieFibonacciR(int n) {
		if(n == 1) {
			return 0;
		}else if(n == 2) {
			return 1;
		}else {
			return serieFibonacciR(n-1) + serieFibonacciR(n-2);
		}
	}
	
	public static void fibonacci(int n) {
		if(n <= 0) {
			System.out.println("Porfavor ingrese un numero entero positivo, iniciando desde 1");
		}else {
			for (int i = 1; i <= n; i++) {
                System.out.print(serieFibonacciR(i) + " ");
            }
		}
	}
}
