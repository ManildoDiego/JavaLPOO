import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Ingrese cadena: ");
        var str = sc.nextLine();

        System.out.print("La palabra \"" + str + "\" ");
        if (esPalindromo(str)) {
            System.out.println("es palindromo");
        } else {
            System.out.println("no es palindromo");
        }

        sc.close();
    }

    private static boolean esPalindromo(String str) {
        str = str.toLowerCase();
        var length = str.length();

        for (var i = 0; i < (length / 2); i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
