package parte2;

import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero<0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
				
		
		sc.close();
	}

}
