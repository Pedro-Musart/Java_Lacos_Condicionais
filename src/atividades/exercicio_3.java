package atividades;

import java.util.Scanner;

public class exercicio_3 {
	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeira_doacao, valido = false;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do paciente: ");
		nome = input.next();
		System.out.println("\nDigite a idade do paciente: ");
		idade = input.nextInt();
		System.out.println("\nÉ a primeira doação? ('True' para Sim e 'False' para Não)");
		primeira_doacao = input.nextBoolean();
		
		
		if(idade >= 18 && idade <= 69 ) {
			if(idade >= 60 && primeira_doacao == true) {
			valido = false;
			} else {
				valido = true;
			}
			
		} else {
			valido = false;
		}
		
		
		if (valido == true) {
			System.out.println(nome + " está apto(a) para doar sangue!");
		}else {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}
	}
}
