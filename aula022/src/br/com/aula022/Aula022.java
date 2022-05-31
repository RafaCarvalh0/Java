package br.com.aula022;

public class Aula022 {

	public static void main(String[] args) {
		System.out.println("Imprimindo os valores pares de 0 até 100: ");
		for(int i = 0; i < 100; i++) {
			if(i%2==0)
				System.out.println(i);
			else
				continue;
			
			int a = 0, soma = 0;
			while(a < i) {
				a++;
				soma+=a;
			}
			System.out.println("A soma de todos os números é: "+soma);
		}

	}

}