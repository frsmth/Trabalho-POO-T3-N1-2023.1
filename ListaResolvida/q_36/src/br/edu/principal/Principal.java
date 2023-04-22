package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double soma = 0;
	double qtd = 0;
	System.out.println("O programa abaixo continuará rodando até que você digite uma idade como 0.");
	System.out.println("Por favor, digite a idade da primeira pessoa: ");
	int idade = sc.nextInt();
	while (idade > 0) {
		soma = soma + idade;
		qtd = qtd + 1;
		System.out.println("Por favor, digite a idade da próxima pessoa: ");
		int idade1 = sc.nextInt();
		idade = idade1;
	}
	double media = soma / qtd;
	System.out.println("A média das idades digitadas foi de "+media+" anos.");
	}
}