package literal2;

/**
@autor Pedro Zavala
@date 28/11/23
*/

/**
 * Esta clase realiza operaciones de suma y cálculo del MCD (Máximo Común Divisor) mediante recursividad.
 */
public class Recursividad_y_euclides {

    public static void main(String[] args) {
        int limite = 10;

        // Calcula la suma desde 1 hasta el límite e imprime el resultado.
        System.out.println("La suma desde 1 hasta " + limite + " es: " + sumarDesde1(limite));

        // Calcula y muestra el MCD entre 96 y 128.
        System.out.println("El MCD entre 78 y 36 es: " + calcularMCD(78,36));
    }

    /**
     * Método que realiza la suma desde 1 hasta n utilizando recursividad anidada.
     *
     * @param n Límite superior para la suma.
     * @return Suma desde 1 hasta n.
     */
    public static int sumarDesde1(int n) {
        int resultado;

        if (n == 1)
            resultado = 1;
        else
            resultado = n + sumarDesde1(n - 1);

        return resultado;
    }

    /**
     * Método que inicia la recursividad de cola para calcular la suma desde 1 hasta n.
     *
     * @param n           Límite superior para la suma.
     * @param acumulador  Valor acumulado durante la recursividad de cola.
     * @return Suma desde 1 hasta n.
     */
    public static int sumarDesde1ConRecursividadDeCola(int n) {
        return sumaRecursivaDeCola(n, 0);
    }

    /**
     * Método privado que realiza la recursividad de cola para calcular la suma desde 1 hasta n.
     *
     * @param n           Límite superior para la suma.
     * @param acumulador  Valor acumulado durante la recursividad de cola.
     * @return Suma desde 1 hasta n.
     */
    private static int sumaRecursivaDeCola(int n, int acumulador) {
        if (n == 0)
            return acumulador;

        return sumaRecursivaDeCola(n - 1, acumulador + n);
    }

    /**
     * Método que calcula el Máximo Común Divisor (MCD) utilizando el algoritmo de Euclides.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @return Máximo Común Divisor entre a y b.
     */
    
    public static int calcularMCD(int a, int b) {
        if (b > a)  // Corregir la condición aquí
            return calcularMCD(b, a);
        else
            return calcularMCDConRecursividad(a, b);
    }

    /**
     * Método privado que realiza la recursividad para calcular el Máximo Común Divisor (MCD).
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @return Máximo Común Divisor entre a y b.
     */
    private static int calcularMCDConRecursividad(int a, int b) {
        if (b == 0)
            return a;
        else
            return calcularMCDConRecursividad(b, a % b);
    }
}
