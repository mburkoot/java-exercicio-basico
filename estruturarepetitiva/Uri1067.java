package estruturarepetitiva;

import java.util.Scanner;

public class Uri1067 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			int x = sc.nextInt();
				
			if (x >= 0 && x <= 1000) {
				
			for (int i=1; i<=x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
			}
			
			else {
			System.out.println("Não será calculado!");
			}
			
			sc.close();
	}
}