package br.com.aula008;

import java.util.Scanner;

public class Aula008 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, soma;
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = in.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		nota2 = in.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		nota3 = in.nextDouble();
		
		System.out.println("Digite sua quarta nota: ");
		nota4 = in.nextDouble();
		
		soma = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("Sua média foi: "+soma);
		
		if(soma >= 7) {
			System.out.println("Vc foi aprovado! ");
		}else {
			System.out.println("Vc foi reprovado :( ");
		}

	}

}
