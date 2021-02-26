package estruturarepetitiva;

import java.util.Scanner;

public class Uri1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int preferencia, alcool1, gasolina2, diesel3;
		
		alcool1 = 0;
		gasolina2 = 0;
		diesel3 = 0;
		
		preferencia = sc.nextInt();
				
		while (preferencia!=4){
			
			if (preferencia==1) {
				alcool1 = alcool1+1;
				preferencia = sc.nextInt();
			}
			else if (preferencia==2) {
				gasolina2 = gasolina2+1;
				preferencia = sc.nextInt();
			}
			else if (preferencia==3) {
				diesel3 = diesel3+1;
				preferencia = sc.nextInt();
			}
			else {
				preferencia = sc.nextInt();
			}
					
		}
		
		System.out.println("MUITO OBRIGADA");
		System.out.println("Alcool: " + alcool1);
		System.out.println("Gasolina: " + gasolina2);
		System.out.println("Diesel: " + diesel3);
		
		sc.close();
	}

}
