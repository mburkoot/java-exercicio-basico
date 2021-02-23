package PARTE1;

import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, numeroPecas1, codigo2, numeroPecas2;
		double valorPeca1, valorPeca2, total;
		
		codigo1 = sc.nextInt();
		numeroPecas1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		numeroPecas2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		total = numeroPecas1*valorPeca1 + numeroPecas2*valorPeca2;
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);
		
		sc.close();
	}

}
