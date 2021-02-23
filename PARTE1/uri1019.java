package PARTE1;

import java.util.Scanner;

public class uri1019 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int segundos, minutos, horas, resto;
		
		horas = n/3600;
		resto = n % 3600;
		minutos = resto/60;
		segundos = resto%60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}

}
