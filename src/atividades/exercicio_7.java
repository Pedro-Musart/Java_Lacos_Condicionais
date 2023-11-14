package atividades;

import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		float n1,n2, resultado;
		int op;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		n1 = input.nextFloat();
		System.out.println("\nDigite o segundo número");
		n2 = input.nextFloat();
		System.out.println("\nDigite a operação: ");
		op = input.nextInt();
		
		switch(op) {
		case 1:
			resultado = n1 + n2;
			break;
		case 2:
			resultado = n1 - n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4:
			resultado = n1 / n2;
			break;
			
			default:
			resultado = 0;
			
		}
		
		System.out.println("Resultado da operação: " + resultado);

	}

}
