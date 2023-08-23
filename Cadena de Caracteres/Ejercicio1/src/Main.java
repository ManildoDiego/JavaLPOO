import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        var nombre = sc.nextLine();

        System.out.println("Tu nombre es \"" + nombre + "\"");

        sc.close();
    }
}
