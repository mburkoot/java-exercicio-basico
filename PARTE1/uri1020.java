package PARTE1;

import java.util.Scanner;

public class uri1020 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idadeDias, ano, meses, dias, resto;
		idadeDias = sc.nextInt();
		resto = idadeDias;
		
		ano = resto/365;
		System.out.println(ano + " ano(s)");
		resto = resto%365;
		
		meses = resto/30;
		System.out.println(meses + " mes(es)");
		resto = resto%30;
		
		dias = resto;
		System.out.println(dias + " dia(s)");
		
		
		sc.close();
	}
}
