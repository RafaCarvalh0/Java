package br.com.aula019;

import java.util.Scanner;

public class Aula019 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Qual seu dia da semana prefeiro? (1-7)");
		
		int num = in.nextInt();
		
		String dia = (num==1) ? "segunda" :
					 (num==2) ? "terça" :
					 (num==3) ? "quarta" :
					 (num==4) ? "quinta" :
					 (num==5) ? "sexta" :
					 (num==6) ? "sábado" :
					 (num==7) ? "domingo":
								"dia inválido";

		System.out.println(dia);
	}
}