//Se importa la clase Scanner
import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se crea el lector
		Scanner sc = new Scanner(System.in);
		
		//Se pide al usuario el valor de grados Cent�grados a convertir
		System.out.print("Inserte el valor que quiere convertir a grados Cent�grados:");

		//Se crea la variable para almacenar el valor solicitado
		double gcent = sc.nextDouble();

		//Se calcula el valor de grados Fahrenheit
		//final double c1 = 1.8;
		final double a = 9;
		final double b = 5;
		final double c1 = a / b;
		final double c2 = 32;
		double gfah = gcent * (c1) + 32;
		
		//Se imprime el valor de los grados Fahrenheit
		System.out.print("El valor de " + gcent + " �C en grados Fahrenheit es de: " + gfah + " �F");
		
		//Se cierra el lector
		sc.close();
	}

}
