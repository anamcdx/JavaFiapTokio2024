package logica.exercicios.aula08;

import java.util.Scanner;

import java.util.Calendar;

public class Exercicio1 {

	public static void main(String[] args) {
//		▪ Faça um programa que verifica a hora do dia e exiba a mensagem ao usuário com o
//		nome dele:
//		▪ “Bom dia, FULANO!” se for maior ou igual que 6h da manhã
//		▪ “Boa tarde, FULANO!” se for maior ou igual que 12h
//		▪ “Boa noite, FULANO!” se for maior ou igual que 18h
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		scanner.close();
		Calendar c = Calendar.getInstance();
		
		if (c.HOUR <= 6) {
			System.out.printf("Bom dia, " + nome);
		}else if (c.HOUR >= 12) {
				System.out.printf("Boa tarde, " + nome);
			}else if (c.HOUR >=18) {
				System.out.printf("Boa noite, " +nome);
			}
		
	}

}
