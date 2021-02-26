package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Uri1116 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double divisor, dividendo, quociente;
		
		
		for(int i = 0; i<N; i++) {
			dividendo = sc.nextDouble();
			divisor = sc.nextDouble();
			
			quociente = dividendo / divisor;
			
			if (divisor == 0) {
				System.out.println("divisao impossivel");
			}
			else {
			System.out.printf("%.1f%n", quociente);
			}
			
		sc.close();
			
		}
		
	}

}
