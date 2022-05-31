package br.com.aula012;

import java.util.Scanner;

public class Aula012 {

	public static void main(String[] args) {
		
		final int iJ, iI; //constante
		iJ = 17;
		iI = 60;
		
		System.out.println("Digite a idade de uma pessoa: ");
		Scanner in = new Scanner(System.in);
		int idade = in.nextInt();
		
		if(idade <= iJ) {
			System.out.println("A idade da pessoa é informada é de um jovem");
		}else {
			if(idade >= iI) {
				System.out.println("A idade da pessoa é informada é de um idoso");
			}else {
				if((idade > iJ)&&(idade < iI)) {
					System.out.println("A idade da pessoa é informada é de um adulto ");
				}
			}
		}
	}

}
