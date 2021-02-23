package PARTE1;

import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	int func, horasTrab;
	double valorHoras, salario;
	
	func = sc.nextInt();
	horasTrab = sc.nextInt();
	valorHoras = sc.nextDouble();
	
	salario = horasTrab*valorHoras;
	
	System.out.println("NUMBER = " + func);
	System.out.printf("SALARY = U$ %.2f%n", salario);
	
	
	sc.close();
	}

}
