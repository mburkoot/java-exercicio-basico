package PARTE1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		altura = sc.nextDouble();
		base = sc.nextDouble();
		
		area = altura*base;
		perimetro = altura * 2 + base * 2; //porque é a soma dos de todos os lados.
		diagonal = Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2)); //teorema de pitagoras	
		
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();
	}

}
