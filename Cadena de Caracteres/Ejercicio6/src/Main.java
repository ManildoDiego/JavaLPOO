import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        final var CANT_STRINGS = 5;
        
        String max = "";
        
        for (var i = 0; i < CANT_STRINGS; i++) {
            System.out.print("Ingrese cadena:");
            var linea = sc.nextLine();

            if (linea.length() > max.length()) {
                max = linea;
            }
        }

        System.out.println("La palabra con mas caracteres es \"" + max + "\"");

        sc.close();
    }
}
