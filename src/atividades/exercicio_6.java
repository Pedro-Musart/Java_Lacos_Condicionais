package atividades;

import java.util.Scanner;

public class exercicio_6 {
	public static void main(String[] args) {
		
		 int cod;
		 double salario, novoSalario, reajuste;
		 String cargo, nomeColaborador;
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Digite o nome do Colaborador:");
		 nomeColaborador = input.next();
		 System.out.println("\nDigite o código do Cargo:");
		 cod = input.nextInt();
		 System.out.println("\nDigite o salário:");
		 salario = input.nextDouble();
		 
		 switch(cod) {
		 case 1:
			 cargo ="Gerente";
			 reajuste = 0.10;
			 break;
		 case 2:
			 cargo ="Vendedor";
			 reajuste = 0.07;
			 break;
		 case 3:
			 cargo ="Supervisor";		 
			 reajuste = 0.09;
			 break;
		 case 4:
			 cargo ="Motorista";
			 reajuste = 0.06;
			 break;
		 case 5:
			 cargo ="Estoquista";
			 reajuste = 0.05;
			 break;
		 case 6:
			 cargo ="Técnico de TI";
			 reajuste = 0.08;
			 break;
		 default:
			 cargo = "invalido";
			 reajuste = 0;
		 }
		 
		 novoSalario = salario + (salario * reajuste);
		 
		 
		 if(reajuste != 0 && cargo != "invalido") {
		 System.out.println("\nNome do Colaborador: " + nomeColaborador + "\nCargo: " + cargo + "\nSalário: " + novoSalario);
		 }else {
			 System.out.println("\nValor Inválido");
		 }
	 
	 } 
	
}

