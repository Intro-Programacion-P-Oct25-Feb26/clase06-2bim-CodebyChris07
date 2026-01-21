/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes﻿​_
 */
public class Ejemplo051 {

    public static void main(String[] args) {
        boolean bandera = true;
        
        while (bandera) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt(); // se espera un valor entero 
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt(); // se espera un valor entero // 0
                int resultado = valor1 / valor2;

                System.out.printf("Resultado %d\n", resultado);
                bandera = false;
                /*
                entramos a un ciclo while pedimos un valor por teclado, y ese 
                se le asigna al valor1, y volvemos a pedir un valor igual entero
                y este lo asume valor2, y una vez tengamos los dos valores se 
                immprime el resultado y la bandera se hace falsa, pero que pasa
                si ingresamos el cero, pasamos a la linea 42 al catch y nos 
                indica el error que hay pero si ponemos una cadena en cambio
                vamos a la linea 40 y nos sale igual el error que se a cometido
                y el ciclo se va a repetir hasta que pongamos los datos correctos
               
                */
            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
            } catch (ArithmeticException arithmeticException) {

                System.out.println("Lo sentimos hay un error");
                System.out.printf("De tipo %s\n", arithmeticException);

            }
        }

        System.out.println("Continuamos");

    }
}
