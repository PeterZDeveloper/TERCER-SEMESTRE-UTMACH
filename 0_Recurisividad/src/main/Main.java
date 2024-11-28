/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import clases.Factorial;

/**
 *
 * @author Dumitru
 */
public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        
        int resultado1 = factorial.factorialRecursivo(10);
        System.out.println("Resultado factorialRecursivo: "+resultado1);
        
//        int resultado2 = factorial.facorialIterativo(3);
//        System.out.println("Resultado factorialRecursivo: "+resultado2);
    }
}
