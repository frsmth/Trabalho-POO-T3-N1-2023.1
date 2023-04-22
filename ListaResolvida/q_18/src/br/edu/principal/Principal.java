package br.edu.principal;

import java.util.Scanner;

public class Principal {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite um número inteiro maior que 1: ");

        int num = sc.nextInt();

        int qtde = 0;

        int zero = 0;

        for (int i = 1; i < num; i++) {

         if ((num%i==0)) {

        	 qtde = qtde+1;

         }

        }

         if (qtde < 2) {

        	 System.out.println("Número primo!");

         }

         else {

        	 System.out.println("Número não primo!");

         

        }

 }

}