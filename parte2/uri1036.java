package parte2;

import java.util.Locale;
import java.util.Scanner;

public class uri1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, r1, r2, delta;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = b*b-4.0*a*c;
		
		if (a==0 || delta<0.0) { //A não pode ser zero e delta não pode ser negativo
			System.out.println("Impossível calcular");
		}
		else {
			r1 = (-b+Math.sqrt(delta))/(2.0*a);
			r2 = (-b-Math.sqrt(delta))/(2.0*a);
			System.out.printf("R1 = %.5f%nR2 = %.5f%n", r1, r2);
		}
		
					
		sc.close();
		
	}

}
