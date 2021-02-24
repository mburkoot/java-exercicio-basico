package parte2;

import java.util.Locale;
import java.util.Scanner;

public class uri1040 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1, n2, n3, n4, media, exame;
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();
		
		media = (n1*2f + n2*3f + n3*4f + n4*1f)/10f;
		System.out.printf("Media: %.1f%n",  media);
		
		if (media>=7f){
			System.out.println("Aluno aprovado");
		}
		else if (media<=5f){
			System.out.println("Aluno reprovado");
		}
		else {
			System.out.println("Aluno em exame");
			exame = sc.nextFloat();
			System.out.printf("Media: %.1f%n",  exame);
			media = (media + exame)/2f;
			if (media>=5f) {
				System.out.println("Aluno aprovado");
				System.out.printf("Media final: %.1f%n",  media);
			}
			else {
				System.out.println("Aluno reprovado");
				System.out.printf("Media final: %.1f%n",  media);
			}
		}
		
		sc.close();
	}

}
