package br.com.aula026;

public class Aula026 {

	public static void main(String[] args) {
		int[][] nums = {{1,2,3}, 
						{4,5,6}, 
						{7,8,9}};
		
		for(int x = 0; x<3; x++) {
			for(int y = 0; y<3; y++) 
				System.out.print(nums[x][y]+" ");
			System.out.println();
		}
	}

}