package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
//		Leia 3 valores de entrada, referentes à idade de uma pessoa em: anos, meses e dias.
//		Exemplo: eu tenho 30 anos, 2 meses 3 7 dias. Calcule e exiba o total de dias que essa
//		pessoa já viveu. Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias
//		e todo mês com 30 dias.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos inteiros: ");
		int anos = scanner.nextInt();
		
		System.out.println("Digite quantos meses: ");
		int meses = scanner.nextInt();
		
		System.out.println("Digite quantos dias: ");
		int dias = scanner.nextInt();
		
		int qtdDias = (anos *365) + (meses * 30) + dias;
		System.out.printf("Voce tem %d dias de vida ate hoje!", qtdDias);
		
		scanner.close();

	}

}
