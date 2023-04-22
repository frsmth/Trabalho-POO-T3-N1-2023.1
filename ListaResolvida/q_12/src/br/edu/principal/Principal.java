package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite um número X: ");
		double x = sc.nextDouble();
		System.out.println("Por favor, digite o número de termos: ");
		double num = sc.nextDouble();
		double s = 1;
		for (int i = 2; i <= num; i++) {
			int fat = 1;
			for (int j = 1; j <= i+1; j++) {
				fat = fat * j;
			}
			if (i % 2 == 0) {
				s = s + (Math.pow(x, i))/fat;
			}
			else {
				s = s - (Math.pow(x, i))/fat;
			}
		}
		System.out.println(s);

	}

}
