package atividades;

import java.util.Scanner;

public class exercicio_5 {
 public static void main(String[] args) {
	 int cod,quanti, valor, total;
	 
	 String nome_pedido = "";
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Digite o código do pedido:");
	 cod = input.nextInt();
	 System.out.println("Digite a quantidade do pedido:");
	 quanti = input.nextInt();
	 
	 switch(cod) {
	 case 1:
		 nome_pedido ="Cachorro Quente";
		 valor = 10;
		 break;
	 case 2:
		 nome_pedido ="X-Salada";
		 valor = 15;
		 break;
	 case 3:
		 nome_pedido ="X-Bacon";		 
		 valor = 18;
		 break;
	 case 4:
		 nome_pedido ="Bauru";
		 valor = 12;
		 break;
	 case 5:
		 nome_pedido ="Refrigerante";
		 valor = 8;
		 break;
	 case 6:
		 nome_pedido ="Suco de Laranja";
		 valor = 13;
		 break;
	 default:
		 nome_pedido = "invalido";
		 valor = 0;
	 }
	 
	 total = valor * quanti;
	 
	 
	 if(valor != 0 && nome_pedido != "invalido") {
	 System.out.println("\n Produto: " + nome_pedido + "\nValor Total: " + total);
	 }else {
		 System.out.println("\nValor Inválido");
	 }
 
 } 
}
