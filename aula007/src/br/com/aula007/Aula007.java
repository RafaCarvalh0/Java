package br.com.aula007;

import java.util.Scanner;

public class Aula007 {
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Digite um valor: ");
		
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		
		if (num == 10) {
			System.out.println("Sim, é igual a 10");
		}else{
			System.out.println("Não, é diferente de 10");
		}
		
	}
}