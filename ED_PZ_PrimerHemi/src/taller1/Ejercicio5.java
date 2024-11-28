package taller1;

public class Ejercicio5 {

    public static void main(String[] args) {
        float[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = 3;

        int vueltas = traspuesta(matriz, n);

        // Imprimir la matriz después de la transposición
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprimir el número de vueltas al final
        System.out.println("Número de vueltas: " + vueltas);
    }

    static int traspuesta(float[][] d, int n) {
        int vueltas = 0;

        for (int i = n - 2; i > 0; i--) {
            for (int j = i + 1; j < n; j++) {
                float temp = d[i][j];
                d[i][j] = d[j][i];
                d[j][i] = temp;

                vueltas++;
                // Incrementar el contador de vueltas en cada iteración
            }
        }

        return vueltas;
    }
}


