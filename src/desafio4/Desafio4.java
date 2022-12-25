package desafio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<String> frasesCorrigidas = new ArrayList<>();
		int qtdFrases = scan.nextInt();
		scan.nextLine(); // para eliminar o \n deixado pelo nextInt() no buffer

		for (int i = 0; i < qtdFrases; i++) {
			String frase = scan.nextLine();
			StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
			StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
			parte1.reverse();
			parte2.reverse();
			frasesCorrigidas.add(parte1.toString() + parte2.toString());
		}

		System.out.println();

		frasesCorrigidas.forEach(System.out::println);

		scan.close();
	}
}
