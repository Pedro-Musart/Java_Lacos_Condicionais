package atividades;

import java.util.Scanner;

public class exercicio_1 {
	public static void main(String[] args) {
		float a,b,c,soma;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número A:");
		a = input.nextFloat();
		System.out.println("Digite o número B:");
		b = input.nextFloat();
		System.out.println("Digite o número C:");
		c = input.nextFloat();
		
		soma = a + b;
		
		if(soma > c ) {
			System.out.println("\nA soma de A + B é Maior do que C");
		}
		else if(soma < c ) {
			System.out.println("\nA soma de A + B é Menor do que C");
		}
		else {
			System.out.println("\nA soma de A + B é Igual do que C");
		}
	}
}

