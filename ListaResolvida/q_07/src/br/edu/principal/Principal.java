package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
    public static void main(String args[]) { 
    Scanner sc = new Scanner (System.in);
    	    
       System.out.println("Por favor, digite um número positivo X: ");
       int x = sc.nextInt();
       System.out.println("Por favor, digite o número de termos: ");
       int num_termos = sc.nextInt();
       double s = 0.0;
       int denominador = 1;
       int den = 0;
    
    for (int i = 1; i <= num_termos; i++){
      int fim = denominador;
      int fator = 1;
      for (int j = 1; j <= fim; j++){
        fator = fator * j;
      }
      int expoente = i + 1;
      if (expoente % 2 == 0){
      s = s - (Math.pow(x, expoente)/fator);
      }
      else{
        s = s + (Math.pow(x, expoente)/fator);
      }
      if (denominador == 4){
        den = -1;
      }
      if (denominador == 1){
        den = 1;
      }
      if (den == 1){
        denominador = denominador + 1;
      }
      else{
        denominador = denominador - 1;
      }
    }
    System.out.println(s);
   }
 }