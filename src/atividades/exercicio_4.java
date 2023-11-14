package atividades;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		String nome1,nome2,nome3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira característica:");
		nome1 = input.next();
		
		System.out.println("Digite a segunda característica:");
		nome2 = input.next();
		
		System.out.println("Digite a terceira característica:");
		nome3 = input.next();
		
		if(nome1.equalsIgnoreCase("Vertebrado")) {
			if (nome2.equalsIgnoreCase("ave")) {
				if (nome3.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");
				}else {
					System.out.println("Opção Inválida");
				}
				if (nome3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Pomba");
				}else {
					System.out.println("Opção Inválida");
				}
			}else {
				System.out.println("Opção Inválida");
			}
			
			if (nome2.equalsIgnoreCase("mamífero")) {
				if (nome3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Homem");
				}else {
					System.out.println("Opção Inválida");
				}
				if (nome3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Vaca");
				}else {
					System.out.println("Opção Inválida");
				}
			}else {
				System.out.println("Opção Inválida");
			}
		}else {
			System.out.println("Opção Inválida");
		}
		
		if(nome1.equalsIgnoreCase("Invertebrado")) {
			if (nome2.equalsIgnoreCase("Inseto")) {
				if (nome3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Pulga");
				}else {
					System.out.println("Opção Inválida");
				}
				if (nome3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Pulga");
				}else {
					System.out.println("Opção Inválida");
				}
			}else {
				System.out.println("Opção Inválida");
			}
			
			if (nome2.equalsIgnoreCase("Anelídio")) {
				if (nome3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Sanguessuga");
				}else {
					System.out.println("Opção Inválida");
				}
				if (nome3.equalsIgnoreCase("Onívoro")) {
					System.out.println("Minhoca");
				}else {
					System.out.println("Opção Inválida");
				}
			}
		}else {
			System.out.println("Opção Inválida");
		}
		
	}

}
