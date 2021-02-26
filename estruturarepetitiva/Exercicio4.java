package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double celsius, fahrenheit;
		char resposta;
		
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();
			
			fahrenheit = (9*celsius)/5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);			
			
			System.out.print("Deseja repetir? ");
			resposta = sc.next().charAt(0);

		} while (resposta == 's');
		
		
		sc.close();
	}

}
