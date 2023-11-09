package atividades;

import java.util.Scanner;

public class exercicio_2 {
	public static void main(String[] args) {
		int number;
		Scanner input= new Scanner(System.in);
		System.out.println("Digite um número:");
		number = input.nextInt();
		
		if(number > 0) {
			if(number % 2 == 0) {
				System.out.println("\nO número "+ number + " é par e positivo!");
			} else {
				System.out.println("\nO número "+ number + " é impar e positivo!");
			}
		}else {
			if(number % 2 == 0) {
				System.out.println("\nO número "+ number + " é par e negativo");
			} else {
				System.out.println("\nO número " + number + " é impar e negativo");
			}
		}
		
	}
}
