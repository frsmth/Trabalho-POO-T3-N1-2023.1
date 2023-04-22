package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Por favor, digite um número inteiro M: ");
	int m = sc.nextInt();
	System.out.println("Por favor, digite um número inteiro N: ");
	int n = sc.nextInt();
	double soma = 0;
	while (m < n) {
		for (int i = m; i <= n; i++) {
			soma = soma + i;
		}
		System.out.println(soma);
		System.out.println("Por favor, digite um número inteiro M: ");
		int m1 = sc.nextInt();
		m = m1;
		System.out.println("Por favor, digite um número inteiro N: ");
		int n1 = sc.nextInt();
		n = n1;
	}
	

	}

}
