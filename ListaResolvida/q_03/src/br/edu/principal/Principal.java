package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Por favor, digite a quantidade de números que seram lidos: ");
	int n = sc.nextInt();
	for (int i = 0; i < n; i++) {
		int fat = 1;
		System.out.println("Por favor, digite um número: ");
		int num = sc.nextInt();
		for (int j = 1; j <= num; j++) {
			fat = fat * j;
		}
		System.out.println("O valor do fatorial de "+num+" é igual a "+fat+".");	
	}

	}
}