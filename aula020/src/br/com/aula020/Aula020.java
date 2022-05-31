package br.com.aula020;

public class Aula020 {

	public static void main(String[] args) {
	
		labelFor1: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("O valor de I é: "+i+" o valor de J é: "+j);
				if(i==2 && j==3)
					break labelFor1;
			}
		}

	}

}