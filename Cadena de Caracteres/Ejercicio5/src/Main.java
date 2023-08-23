/*
    Realiza un programa que determine si una cadena de caracteres ingresada por el usuario es un anagramade otra cadena también ingresada por el usuario. Un anagrama es una palabra o frase formada por las mismas letras de otra palabra o frase, pero en un orden diferente, como por ejemplo "roma" y "amor".
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Ingrese cadena 1: ");
        var linea1 = sc.nextLine();

        System.out.print("Ingrese cadena 2: ");
        var linea2 = sc.nextLine();
        
        var es = (esAnagrama(linea1, linea2)) ? "\" es" : "\" no es";
        System.out.println("El \"" + linea1 + es + " un anagrama de \"" + linea2 + "\"");

        sc.close();
    }

    private static boolean esAnagrama(String str1, String str2) {
        var arr1 = str1.toLowerCase().toCharArray();
        var arr2 = str2.toLowerCase().toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
