import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		byte numero;

		while (true) {
			System.out.print("Ingrese numero (entre el 1 y el 100) (si es 0 termina): ");
			numero = sc.nextByte();

			if (numero == 0) {
				break;
			}

			if (numero < 0 || numero > 100) {
				System.out.println("El numero " + numero + " invalido!");
				continue;
			}

			if (numero % 2 == 0) {
				System.out.println("El numero " + numero + " es par");
			} else {
				System.out.println("El numero " + numero + " es impar");
			}
		}

		sc.close();
	}
}