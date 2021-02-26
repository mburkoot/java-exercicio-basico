package estruturarepetitiva;

import java.util.Scanner;

public class Uri1074 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int numero;
		
		if (N < 10000){
			for (int i = 0; i < N; i++) {
				numero = sc.nextInt();
				
				if (numero == 0) {
					System.out.println("NULL");
				}
				else if (numero<0) {
					if (numero%2 == 0) {
						System.out.println("EVEN NEGATIVE");
					}
					else if (numero%2 != 0) {
						System.out.println("ODD NEGATIVE");
					}
				}
				else if (numero>0) {
					if (numero%2 == 0) {
					System.out.println("EVEN POSITIVE");
					}
					else if (numero%2 != 0) {
					System.out.println("ODD POSITIVE");
					}
				}
			
			}
			sc.close();
		}
	}

}
