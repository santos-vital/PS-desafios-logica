package desafio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrimeiroDesafio {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int qtdNumeros;
		ArrayList<Integer> numerosDigitados = new ArrayList<>();
		List<Integer> saidaNumeros = new ArrayList<>();

		qtdNumeros = scan.nextInt();

		for (int i = 0; i < qtdNumeros; i++) {
			numerosDigitados.add(scan.nextInt());
		}

		var numerosPares = numerosDigitados.stream()
				.filter(numPar -> numPar % 2 == 0)
				.sorted()
				.collect(Collectors.toList());

		var numerosImpares = numerosDigitados.stream()
				.filter(numImpar -> numImpar % 2 != 0)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		saidaNumeros.addAll(numerosPares);
		saidaNumeros.addAll(numerosImpares);
		System.out.println();
		saidaNumeros.forEach(System.out::println);

		scan.close();
	}

}
