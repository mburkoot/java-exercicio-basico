package parte2;

import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double valor;
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			valor  = (double)quantidade*4.0;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if (codigo == 2) {
			valor  = (double)quantidade*4.5;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if (codigo == 3) {
			valor  = (double)quantidade*5.0;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if (codigo == 4) {
			valor  = (double)quantidade*2.0;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else {
			valor  = (double)quantidade*1.5;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		
				
		sc.close();
	}

}
