package estruturarepetitiva;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Fazer um programa que l� um valor inteiro N e depois N n�meros inteiros. Ao final, mostra a 
		//soma dos N n�meros lidos. Entrada: 3,5,2,4; SAIDA: 11;
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}

		System.out.println(soma);
		
		sc.close();
	}

}
