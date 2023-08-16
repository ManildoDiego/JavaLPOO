import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		byte opcion;

		do {
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.print("Ingrese opcion: ");

			opcion = sc.nextByte();
		} while (opcion < 1 || opcion > 4);

		System.out.print("Ingrese primer operando: ");
		var op1 = sc.nextLong();
		System.out.print("Ingrese segundo operando: ");
		var op2 = sc.nextLong();

		switch (opcion) {
			case 1: op1 += op2; break;
			case 2: op1 -= op2; break;
			case 3: op1 *= op2; break;
			case 4: op1 /= op2; break;
		}

		System.out.println("Resultado: " + op1);

		sc.close();
	}
}