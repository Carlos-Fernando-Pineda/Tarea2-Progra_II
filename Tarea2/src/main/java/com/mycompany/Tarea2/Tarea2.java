/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Tarea2;

import java.util.Scanner;


/**
 *
 * @author carlo
 */
public class Tarea2 {
    private static Scanner teclado = new Scanner(System.in);
     public static String Codifica(String palabra, int llave){
        int codificar = 0;
        String Resultado = "";
        
        for (int x = 0; x < palabra.length(); x++){
            codificar = (int)palabra.charAt(x);
            codificar = codificar + llave;
            char caracter = (char) codificar;
            Resultado = Resultado + caracter;
        }
        return Resultado;
     }
     public static String Desencriptar(String palabra, int llave){
         int descencriptar = 0;
        String Resultado = "";
        
        for (int x = 0; x < palabra.length(); x++){
            descencriptar = (int)palabra.charAt(x);
            descencriptar = descencriptar - llave;
            String caracter = new Character((char) descencriptar).toString();
            Resultado = Resultado + caracter;
        }
        return Resultado;
     }
     
      public static void main(String[] args) {
      String pal;
      String res;
        System.out.println("Ingresa una palabra");
        pal = teclado.nextLine();
        res = Desencriptar(pal,4);
        System.out.println("res Palabra = " + res);
        
    }
}
