package estruturarepetitiva;

import java.util.Scanner;

public class Uri1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
			if (x%2 == 0) {
				x = x+(x+2)+(x+4)+(x+6)+(x+8);
				System.out.println(x);
				x = sc.nextInt();
			}
			else {
				x = x+1+(x+3)+(x+5)+(x+7)+(x+9);
				System.out.println(x);
				x = sc.nextInt();
			}
		}
		
		sc.close();
	}

}
