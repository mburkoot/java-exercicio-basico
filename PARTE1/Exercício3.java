package PARTE1;

import java.util.Locale;
import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		nome1 = sc.next();
		idade1 = sc.nextInt();
		nome2 = sc.next();
		idade2 = sc.nextInt();
		
		media = (double) (idade1+idade2)/2;
		
		System.out.printf("A idade m�dia de %s e %s � de %.1f anos %n", nome1, nome2, media);
		
		sc.close();
	}

}
