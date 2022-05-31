package br.com.aula010;

import java.util.Scanner;

public class Aula010 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um valor inteiro para saber se é par ou impar: ");
		int num1 = in.nextInt();
		
		num1 = num1 % 2;
		
		if(num1 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é impar");
		}
		//System.out.println(3 % 2);
		//System.out.println(4 % 2);
		//System.out.println(7 % 3.1);

	}

}