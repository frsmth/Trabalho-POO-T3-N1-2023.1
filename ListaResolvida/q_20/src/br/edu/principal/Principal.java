package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double cel = 1;
		for (double faren = 50; faren <= 65; faren++) {
			System.out.println("Farenheit: "+faren+"°F");
			cel = (faren - 32) * 5/9;
			long round = Math.round(cel * 1000);
			double result = (double) round/1000;
			System.out.println("Celcius: "+result+"°C");
			System.out.println("");
		}
	}
}
