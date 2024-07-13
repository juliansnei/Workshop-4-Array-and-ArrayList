package Ejercicios;
import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		String[] names = new String[] {"Juan", "Carlos", "Mario", "Pepito"};	
		String userName;
		boolean nameNotFound = true;
		System.out.print("Ingresa porfavor tu nombre: ");
		userName = entry.nextLine();
		entry.close();
		for(int i = 0; i < names.length; i++) {
			if(userName.equalsIgnoreCase(names[i]) == true) {
				System.out.print("El nombre se encuentra en la posicion " + i + " del array");
				nameNotFound = false;
				break;
			}
		}
		if(nameNotFound == true) {
			System.out.print("El nombre no se encuentra en el array");
		}
	}

}
