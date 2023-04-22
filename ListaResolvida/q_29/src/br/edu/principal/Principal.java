package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite o salário de carlos");
		double sal_carlos = sc.nextDouble();
		double sal_joao = sal_carlos/3;
		double meses = 0;
		while (sal_joao < sal_carlos) {
			sal_carlos = sal_carlos + (sal_carlos * 0.02);
			sal_joao = sal_joao + (sal_joao * 0.05);
			meses = meses + 1;
		}
		System.out.println(meses+" meses.");

	}

}
