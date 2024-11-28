/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Dumitru
 */
public class Factorial {

    //Metodo recursivo
    public int factorialRecursivo(int n) {
        int resultado = 0;

        if (n == 1) {
            return 1;
        } 
        
        resultado = factorialRecursivo(n - 1) * n;
        return resultado;

    }

    //Metodo iterativo
    public int facorialIterativo(int n) {
        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
