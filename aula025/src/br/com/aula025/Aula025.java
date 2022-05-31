package br.com.aula025;

public class Aula025 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 9;
		nums[1] = 5;
		nums[2] = 8;
		nums[3] = 7;
		nums[4] = 10;

			
		int media = 0;
		for(int i = 0; i < nums.length; i++){
			media += nums[i];
		}
		
		float total = (float)media / nums.length;
		System.out.println("A média é: "+ total);
	}

}
