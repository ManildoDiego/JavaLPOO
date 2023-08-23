import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de caracteres: ");
        var cadena = scanner.nextLine();

        System.out.print("Ingrese el caracter a reemplazar: ");
        var r = scanner.nextLine().charAt(0);

        System.out.print("Ingrese el nuevo caracter: ");
        var nuevo = scanner.nextLine().charAt(0);

        var resultado = cadena.replaceAll(String.valueOf(r), String.valueOf(nuevo));

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
