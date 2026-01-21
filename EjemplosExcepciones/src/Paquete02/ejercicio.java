/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ejercicio {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int valor1 = ingresarValor();
        int valor2 = ingresarValor();
        int result = obtenerSuma(valor1, valor2);
        imprimir(valor1, valor2, result);

    }

    public static int ingresarValor() {
        int valor = 0;
        try {
            boolean bandera = true;
            while (bandera) {
                System.out.println("Ingrese el valor:");
                valor = entrada.nextInt(); // se espera un valor entero 
                if (valor < 0 || valor % 2 == 1) {
                    throw new Exception("valor invalido");
                }
                bandera = false;
            }
        } catch (Exception e) {
            System.out.printf(" Lo sentimos hay un error de tipo %s\n", e);
        }
        return valor;
    }

    public static void imprimir(int a, int b, int c) {
System.out.printf("Los valores que se ingresaron son %d y %s\nResultado de la "
        + "suma: %d\n", a, b, c);
    }

    public static int obtenerSuma(int a, int b) {
        int resultado;
        resultado = a + b;
        return resultado;
    }
}
