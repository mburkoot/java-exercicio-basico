package PARTE1;

import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int horasViagem, kmHora;
		double litrosNecessarios;
		
		//faz 12km/l
		
		horasViagem = sc.nextInt();
		kmHora = sc.nextInt();
		
		litrosNecessarios = (double) horasViagem*kmHora/12;
		
		System.out.printf("%.3f%n",litrosNecessarios);
		
		sc.close();
	}

}
