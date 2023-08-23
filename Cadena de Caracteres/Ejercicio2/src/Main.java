import java.util.Scanner;

public class Main {
    private static int contarVocales(String str) {
        int vocales = 0;

        for (var c : str.toCharArray()) {
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }

        return vocales;
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de caracteres: ");
        var str = sc.nextLine();

        var numberVocales = contarVocales(str);

        if (numberVocales != 0) {
            System.out.println("La cadena \"" + str + "\" tiene " + numberVocales + " vocales");
        } else {
            System.out.println("La cadena \"" + str + "\" no tiene vocales");
        }

        sc.close();
    }
}
