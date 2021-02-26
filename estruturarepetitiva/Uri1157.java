package estruturarepetitiva;

import java.util.Scanner;

public class Uri1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int resultado;
		
		for (int i = 1; i<=N; i++) {
			
			if (N%i == 0) {
				resultado = i;
				System.out.println(resultado);
			}
					
		}
		
		sc.close();
	}

}
