package Ejercicios;
import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		System.out.print("De que tamaño quieres que sea tu arreglo: ");
		int arraySize = entry.nextInt();
		int[] nums = new int[arraySize];
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Ingresa cualquier valor al arreglo: ");
			nums[i] = entry.nextInt();
		}
		entry.close();
		System.out.println();
		System.out.println("Este es tu arreglo: ");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		int count = nums.length - 1;
		for(int i = 0; i < nums.length/2; i++) {
			int aux = nums[count];
			nums[count] = nums[i];
			nums[i] = aux;
			count--;
		}
		System.out.println();
		System.out.println("El arreglo invertido: ");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		
	}
}
