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
		final var rango = 100;

		var sc = new Scanner(System.in);
		int numero;
		boolean primo;

		do {
			System.out.print("Ingrese numero: ");
			numero = sc.nextInt();
			primo = esPrimo(numero);
		} while (numero <= rango || !primo);


		System.out.println("El numero " + numero + " es un numero primo mayor a " + rango);

		sc.close();
	}
}