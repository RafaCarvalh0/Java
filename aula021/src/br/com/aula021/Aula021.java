package br.com.aula021;

public class Aula021 {

	public static void main(String[] args) {
		label1: 
		{
			labelIf: 
			if(true){
				System.out.println("instrução if");
				break labelIf;
			}
			System.out.println("label 1 iniciado");
			label2: {
				System.out.println("label 2 iniciado");
				label3: {
					System.out.println("label 3 iniciado");
					if(true)
						break label2;
				}
				System.out.println("label 2 encerrado");
			}
			System.out.println("label 1 encerrado");
		}

	}

}
