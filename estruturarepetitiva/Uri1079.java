package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Uri1079 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double numero1, numero2, numero3, media;
		
		for (int i = 0; i<N; i++) {
			numero1 = sc.nextDouble();
			numero2 = sc.nextDouble();
			numero3 = sc.nextDouble();
			
			media = (numero1 * 2.0 + numero2 * 3 + numero3 * 5) /10.0;
			System.out.printf("%.1f%n", media);
			
		sc.close();
			
		}

	}

}
