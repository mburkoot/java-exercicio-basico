package PARTE1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular
		//com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais.
		//Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno,
		//ambos com duas casas decimais, conforme exemplo.
		//Entrada: 10.0, 30.0
		//Saída: area=300.00, preco=60000.00
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Área igual %.2f m² %n", area);
		System.out.printf("Preço igual R$ %.2f%n", preco);
		
		sc.close();
		
		

	}

}
