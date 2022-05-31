package br.com.aula006;

import java.util.Scanner;

public class Aula006 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, sub, multi, div;
		
		System.out.println("Insira o primeiro número: ");
		num1 = in.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		sub = num1 - num2;
		multi = num1 * num2;
		div = num1 / num2;
		
		System.out.println("O resultado da soma é: "+soma);
		System.out.println("O resultado da subtração é: "+sub);
		System.out.println("O resultado da multiplicação é: "+multi);
		System.out.println("O resultado da divisão é: "+div);
		
	}
}