package br.edu.principal;
import java.util.Scanner;
import java.lang.Math;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("O programa a seguir continuará rodando até que se digite 0 ou um valor negativo.");
		System.out.println("Por favor, digite um número: ");
		System.out.println("Valor  |  Quadrado  |  Cubo  |  Raiz");
		double num = sc.nextDouble();
		int linhas = 1;
		while (num >= 0) {
			double quad = num * num;
			double cubo = num * num * num;
			if (linhas < 20) {
				linhas = linhas + 1;
				System.out.println("        "+quad+"       "+cubo+"      "+Math.sqrt(num));
			}
			else {
			    System.out.flush();  
				linhas = 1;
				System.out.println("Valor  |  Quadrado  |  Cubo  |  Raiz");
				linhas = linhas + 1;
				System.out.println("        "+quad+"       "+cubo+"      "+Math.sqrt(num));
			}
			num = sc.nextDouble();
			
		}
	}

}
