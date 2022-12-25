package desafio3;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int qtdNumeros;
		int[] numerosArray;
		int valorAlvo;
		int numeroPares = 0;

		qtdNumeros = scan.nextInt();
		scan.nextLine(); // para eliminar o \n deixado pelo nextInt() no buffer
		valorAlvo = scan.nextInt();
		scan.nextLine(); // para eliminar o \n deixado pelo nextInt() no buffer

		numerosArray = new int[qtdNumeros];

		for (int i = 0; i < numerosArray.length; i++) {
			numerosArray[i] = scan.nextInt();

			for (int j = 1; j <= qtdNumeros; j++) {
				if (numerosArray[i] - j == valorAlvo) {
					numeroPares++;
				}
			}
		}

		System.out.println();

		System.out.println(numeroPares);

		scan.close();
	}
}
