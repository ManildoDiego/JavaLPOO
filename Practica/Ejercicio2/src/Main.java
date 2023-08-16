import java.util.Scanner;

public class Main {
	private static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
	
		for (int i = 2; i * i <= numero; ++i) {
			if (numero % i == 0) {
				return false;
			}
		}
	
		return true;
	}

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int numero;

		while (true) {
			System.out.print("Ingrese numero (1-100), 0 para salir: ");
			numero = sc.nextInt();

			if (numero == 0) {
				break;
			}

			if (esPrimo(numero)) {
				System.out.println(numero + " es primo");
				continue;
			}

			System.out.println("El numero " + numero + " no es primo");
			System.out.println("Divisores:");

			for (int i = 2; i < (numero / 2); i++) {
				if (numero % i == 0) {
					System.out.print(i + " ");
				}
			}
		}

		sc.close();
	}
}