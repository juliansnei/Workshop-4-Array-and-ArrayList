package Ejercicios;

public class Ejercicio9 {
	public static void main(String[] arg) {
		int[] nums =  new int[] {2,2,3,3,3,4,4,5,6};
		int[][] counts = new int[nums.length][2];
		boolean isAlreadyCount = false;
		for(int i = 0;  i < counts.length; i++) {
			for(int j = 0; j < 2; j++) {
				counts[i][j] = -1;
			}
		}
		for(int i = 0;  i < nums.length; i++) {
			int count = 0;
			int numActual = nums[i];
			for(int x = 0; x < counts.length; x++) {
				if(numActual == counts[x][0]) {
					isAlreadyCount = true;
					break;
				}
			}
			if(isAlreadyCount == false) {
				for(int j = 0; j < nums.length; j++) {
					if(numActual == nums[j]) {
						count++;
					}
				}
				for(int x = 0; x < counts.length; x++) {
					if(counts[x][0] == -1) {
						counts[x][0] = numActual;
						counts[x][1] = count;
						break;
					}
				}
			}
			isAlreadyCount = false;
		}
		for(int k = 0; k < counts.length; k++) {
			for(int f = 0; f < counts.length - k - 1; f++) {
				if(counts[f][1] < counts[f+1][1]) {
					int aux = counts[f][1];
					counts[f][1] = counts[f+1][1];
					counts[f+1][1] = aux;
				}
			}
		}
		for(int i = 0; i < counts.length; i++) {
		  if(counts[i][0] != -1) {
			  System.out.print("EL número [" + counts[i][0] + "]" + "aparece [" + counts[i][1] + "] veces");	
	          System.out.println();
		  }
          
		}
	}
}
