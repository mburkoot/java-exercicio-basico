package parte2;

import java.util.Scanner;

public class uri1049 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String animal1, animal2, animal3;
		animal1 = sc.next();
		animal2 = sc.next();
		animal3 = sc.next();
		
		if (animal1.equals("vertebrado")){
			if (animal2.equals("ave")){
				if(animal3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else { //onivoro
					System.out.println("pomba");
				}
			}
			else {//mamífero
				if (animal3.equals("onivoro")) {
					System.out.println("homem");
				}
				else { //herbivoro
					System.out.println("vaca");
				}
			}
		}
				
		else { //invertebrado
			if(animal2.equals("inseto")) {
				if (animal3.equals("hematofago")) {
					System.out.println("pulga");
				}
				else { //herbivoro
					System.out.println("lagarta");
				}
			}
			else { //anelideo
				if (animal3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else { //herbivoro
					System.out.println("minhoca");
				}
			}
		}
		
		sc.close();
	}

}
