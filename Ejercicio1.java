package Ejercicios;
import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] arg) {
		//Menu interactivo
		Scanner entry = new Scanner(System.in);
		int option, howMany, operation = 0, numToOperate;
		boolean flagOut = false;
		do {
			System.out.print("Por favor ingresa la cantidad de números con la que quieras operar: ");
			howMany = entry.nextInt();
			if(howMany > 1) {
				System.out.print("Ingresa el número de la operación que quieras hacer,\n teclea 1 si quieres sumar,\n 2 si quieres restar,\n 3 si quieres multiplicar,\n 4 si quieres dividir\n y 5 si quieres salir:");
				option = entry.nextInt();
				String mostrarOperacion = "";
				if(option == 1 ) {
					
					for (int i = 0; i < howMany; i++) {
						if(i == 0) {
							System.out.print("Ingresa el número " + (i + 1) + " para sumarlo: ");
							operation = entry.nextInt();
							mostrarOperacion = String.valueOf(operation);
						} else {
							System.out.print("Ingresa el número " + (i + 1) + " para sumarlo: ");
							numToOperate = entry.nextInt();
							operation += numToOperate;
							mostrarOperacion += " + " + String.valueOf(numToOperate);
						}
					}
					System.out.println("La suma de " + mostrarOperacion + " es igual a " + operation);
				} else if(option ==2) {
					for (int i = 0; i < howMany; i++) {
						if(i == 0) {
							System.out.print("Ingresa el número " + (i + 1) + " para restarlo: ");
							operation = entry.nextInt();
							mostrarOperacion = String.valueOf(operation);
						} else {
							System.out.print("Ingresa el número " + (i + 1) + " para restarlo: ");
							numToOperate = entry.nextInt();
							operation -= numToOperate;
							mostrarOperacion += " - " + String.valueOf(numToOperate);
						}
					}
					System.out.println("La resta de " + mostrarOperacion + " es igual a " + operation);
					
				} else if(option ==3) {
					for (int i = 0; i < howMany; i++) {
						if(i == 0) {
							System.out.print("Ingresa el número " + (i + 1) + " para multiplicarlo: ");
							operation = entry.nextInt();
							mostrarOperacion = String.valueOf(operation);
						} else {
							System.out.print("Ingresa el número " + (i + 1) + " para multiplicarlo: ");
							numToOperate = entry.nextInt();
							operation *= numToOperate;
							mostrarOperacion += " * " + String.valueOf(numToOperate);
						}
					}
					System.out.println("La multiplicación de " + mostrarOperacion + " es igual a " + operation);
					
				} else if(option ==4) {
					for (int i = 0; i < howMany; i++) {
						if(i == 0) {
							System.out.print("Ingresa el número " + (i + 1) + " para dividirlo: ");
							operation = entry.nextInt();
							mostrarOperacion = String.valueOf(operation);
						} else {
							System.out.print("Ingresa el número " + (i + 1) + " para dividirlo: ");
							numToOperate = entry.nextInt();
							operation /= numToOperate;
							mostrarOperacion += " / " + String.valueOf(numToOperate);
						}
					}
					System.out.println("La división de " + mostrarOperacion + " es igual a " + operation);
				} else if(option ==5) {
					System.out.print("¡Gracias por utilizar el programa!");
					flagOut = true;
				}
			} else {
				System.out.println("Lo siento pero tienen que ser minimo dos números para poder operarlos");
			}
			
		} while(flagOut == false);
		entry.close();
	}

}
