package df;
import algoritmos.Algoritmos;

public class Fibonacci {
	public static void main(String[] args) {
		long fibo;
		long tiempo;
		int n=40;
		
		tiempo = System.nanoTime();
		fibo = Algoritmos.fibonacci(n);
		tiempo = System.nanoTime() - tiempo;
		System.out.println("Termino " + n + " de la serie de fibonacci: " + fibo + " en " + tiempo + " ns");
		
		tiempo = System.nanoTime();
		fibo = Algoritmos.fibonacci(n);
		tiempo = System.nanoTime() - tiempo;
		System.out.println("Termino " + n + " de la serie de fibonacci: " + fibo + " en " + tiempo + " ns");
		
		tiempo = System.nanoTime();
		fibo = Algoritmos.fibonacciOptimo(n);
		tiempo = System.nanoTime() - tiempo;
		System.out.println("Termino " + n + " de la serie de fibonacci: " + fibo + " en " + tiempo + " ns");
	}
}
