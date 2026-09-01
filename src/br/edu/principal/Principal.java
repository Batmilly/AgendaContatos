package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String nome ="";
	 String email ="";
	 Boolean continuar= true;
	 
	 
	 System.out.println("==============================");
	 System.out.println("      AGENDA DE CONTATOS      ");
	 System.out.println("            V0.0.0            ");
	 System.out.println("==============================");
	 
	 System.out.println(" Olá ! seja bem vindo (a)");
	 
	 
	 System.out.println();
	 System.out.println("1 - Adicionar contato");
	 System.out.println("2 - Listar contato");
	 System.out.println("3 - Procurar contato");
	 System.out.println("4 - Excluir contato");
	 System.out.println("5 - Sair");
	 System.out.println();
	 
	 System.out.println("Escolha uma opção: ");
	 int opcao = sc.nextInt();
	 sc.nextLine();
	 
	 switch (opcao) {
	     case 1:
	    	 System.out.print("\n---ADICIONAR CONTATO---");
	    	 
	    	 System.out.println("Digite seu nome: ");
	    	 nome = sc.nextLine();
	    	 
	    	 System.out.println("Digite seu celular: ");
	    	 nome = sc.nextLine(); 
	    	 
	    	 System.out.println("Digite seu email: ");
	    	 nome = sc.nextLine();
	    	 
	         System.out.println("Seu contato foi salvo com sucesso!");
	 }	
	     case 2 -> {
	        System.out.print("Listar contato");
	     }	 
	     
	     case 3 -> {
	    	 System.out.println("3 - Procurar contato");
	    
	     case 4 -> {
	    	 System.out.println("4 - Excluir contato");
	    	
	     case 5 -> {
	    	 System.out.print("5 - Sair");
	    	 continuar=false\
	    	
	     default:
	    	 System.out.println(" Só tem até o 5, se faz é?");
	 }  
   }
}
	
