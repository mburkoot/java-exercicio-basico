package PARTE1;

import java.util.Scanner;

public class uri1016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int velocidadeX = 60;
		int velocidadeY = 90;
		int distancia, tempo;
		
		distancia = sc.nextInt();
		
		tempo = 2 * distancia;
		
		System.out.println(tempo + " minutos");

	}

}
