package atividades;

import java.util.Scanner;

public class exercicio_8 {
 
	public static void main(String[] args) {
	
		int op;
		float saldo = 1000, n;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a operação:");
		op = input.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\nOperação - Saldo \n"
					+ "Saldo: " + saldo);
			break;
		case 2:
			System.out.println("\nOperaçõa - Saque \n"
					+ "Digite o valor de saque: ");
			n = input.nextFloat();
			if(n  > saldo) {
				n = 0;
				System.out.println("Saldo Insuficiente!");
			}else {
				saldo -= n;
				System.out.println("Saque: " + n);
			}
			break;
		case 3:
			System.out.println("\nOperaçõa - Depósito \n"
					+ "Digite o valor de depósito: ");
			n = input.nextFloat();
			if(n  < 0) {
				n = 0;
				System.out.println("Valor inválido");
			}else {
				saldo += n;
				System.out.println("Novo Saldo: " + saldo);
			}
			break;
			
		default:
			System.out.println("Operação inválida");
		}
 }
}
