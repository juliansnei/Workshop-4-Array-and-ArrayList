package Ejercicios;
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		int contador = 1;
		int[][] matriz = new int[2][3];
		int[][] matrizTranspuesta = new int[3][2];
		int[][] matrizVueltaAlOriginal = new int[2][3];
		System.out.println("A CONTINUACION INGRESARAS UNA SERIE DE VALORES A LA MATRIZ: \n");
		
		//Ingresa los valores de la matriz original
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Ingresa el número " + contador + " a la matriz");
				matriz[i][j] = entry.nextInt();
				contador++;
			}
		}
		entry.close();
		//imprime los valores de esa misma matriz
		System.out.println("Matriz original: ");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("[" + matriz[i][j] + "]" + "   ");
			}
			System.out.println();
		}
		
		//Llena la matriz transpuesta en las posiciones adecuadas
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				matrizTranspuesta[j][i] = matriz[i][j];
			}
		}
		System.out.println();
		
		//Imprime la matriz transpuesta
		System.out.println("Matriz transpuesta: ");
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 2; j++) {
				System.out.print("[" + matrizTranspuesta[i][j] + "]");
			}
			System.out.println();
		}
		
		//Vuelta a la normalidad
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				matrizVueltaAlOriginal[i][j] = matrizTranspuesta[j][i];
			}
		}
		System.out.println();
		
		System.out.println("Matriz vuelta a la original: ");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("[" + matrizVueltaAlOriginal[i][j] + "]" + "   ");
			}
			System.out.println();
		}
	}
}
