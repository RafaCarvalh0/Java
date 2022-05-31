package br.com.aula005;

import java.util.Scanner;

public class Aula005 {
	
	public static void main(String[] args) {
		System.out.println("Informe o valor em $ que será tranformado em R$: ");
		
		Scanner in = new Scanner(System.in);
		
		double valorDolar = in.nextDouble();
		double valorReal = valorDolar * 4.80;
		
		System.out.println("O valor em Real é: R$"+valorReal);
	}
}