package br.com.aula027;

public class Aula027 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		nums[5] = 60;
		nums[6] = 70;
		nums[7] = 80;
		nums[8] = 90;
		nums[9] = 100;
		
		int soma = 0;
		
		for(int item : nums) {
			soma += item;
		}
		
		float media = soma / nums.length;
		System.out.println("A média aritmetica é: "+media);
		
		int menor = 0;
		int maior = 0;
		
		for(int item : nums) {
			if(item < menor || menor == 0)
				menor = item;
			if(item > maior)
				maior = item;
			
		}
		System.out.println("O menor valor é: "+menor);
		System.out.println("O maior valor é: "+maior);
		
		
	}

}
