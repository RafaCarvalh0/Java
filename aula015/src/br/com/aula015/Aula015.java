package br.com.aula015;

import java.util.Scanner;

public class Aula015 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = 0;
		double num1, num2, resultado;
		
		do {
			System.out.println("Digite o código da operação: ");
			System.out.println("0) sair");
			System.out.println("1) somar");
			System.out.println("2) subtrair");
			System.out.println("3) multiplicar");
			System.out.println("4) dividir");
			
			x = in.nextInt();
			
			if(x!=0) {//verifica se o usuario deseja sair do programa
				
				System.out.println("primeiro número: ");
				num1 = in.nextDouble();
				
				System.out.println("segundo número: ");
				num2 = in.nextDouble();
				
				if(x==1) {//SOMA
					resultado = num1 + num2;
					System.out.println();
					System.out.println("O resultado é "+resultado);
					System.out.println();
				}else {
					if(x==2) {//SUBTRAÇÃO
						resultado = num1 - num2;
						System.out.println();
						System.out.println("O resultado é "+resultado);
						System.out.println();
					}else {
						if(x==3) {//MULTIPLICAÇÃO
							resultado = num1 * num2;
							System.out.println();
							System.out.println("O resultado é "+resultado);
							System.out.println();
						}else {
							if(x==4) {//DIVISÃO
								resultado = num1 / num2;
								System.out.println();
								System.out.println("O resultado é "+resultado);
								System.out.println();
							}
						}
					}
				}
			}
		}while(x!=0);
	}
}