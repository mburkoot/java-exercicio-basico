package parte2;

import java.util.Locale;
import java.util.Scanner;

public class condicional_ternaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		//double preco = 34.5;
		//double desconto;
		//if (preco < 20.0) {
		//	desconto = preco * 0.1;
		//} else {
		//	desconto = preco * 0.05;
		//}

		sc.close();
	}

}
