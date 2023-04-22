package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1);
		System.out.print("-");
		System.out.print(num2);
		for (int cont = 3; cont <= 8; cont++) {
			int res = num1 + num2;
			System.out.print("-"+res);
			num1 = num2;
			num2 = res;
		}

	}

}
