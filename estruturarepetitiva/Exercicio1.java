package estruturarepetitiva;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Fazer um programa que l� n�meros inteiros at� que um zero seja lido. Ao final mostra a soma dos
		// n�meros lido. ENTRADA: 5, 2, 4, 0; SAIDA: 11;
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma = soma + x; // ou soma =+ x
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
