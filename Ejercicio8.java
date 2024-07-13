package Ejercicios;
import java.util.Scanner;
public class Ejercicio8 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		int [][] matrizCuadrada = new int[3][3];
		boolean isSimmetrical = true;
		for(int i = 0; i < matrizCuadrada.length; i++) {
			for(int j = 0; j < matrizCuadrada.length;j++) {
				System.out.print("Ingresa algún valor en la matriz: ");
				matrizCuadrada[i][j] = entry.nextInt(); 		
			}
		}
		entry.close();
		System.out.println();
		System.out.println("LA MATRIZ QUE INGRESASTE ES LA SIGUIENTE: \n");
		for(int i = 0; i < matrizCuadrada.length; i++) {
			for(int j = 0; j < matrizCuadrada.length;j++) {
				System.out.print(matrizCuadrada[i][j] + "   ");			
			}
			System.out.println();
		}
		for(int i = 0; i < matrizCuadrada.length; i++) {
			for(int j = 0; j < matrizCuadrada.length;j++) {
				if(matrizCuadrada[i][j] != matrizCuadrada[j][i]) {
					isSimmetrical = false;
					break;
				}			
			}
		}
		if(isSimmetrical == true) {
			System.out.println("La matriz cuadrada es simetrica");
		} else {
			System.out.println("La matriz cuadrada no es simetrica");
		}
	}
}
