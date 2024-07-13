package Ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		float cantNotasFaltantes, notaIndividual, promedioFaltante;
		float sumatoriaNotasObtenidas = 0;
		System.out.println("¡Bienvenido a tu aplicación de promedios faltantes!");
		System.out.print("Por favor ingresa la cantidad de notas faltantes: ");
		cantNotasFaltantes = entry.nextFloat();
		System.out.println("Ahora ingresa cada nota obtenida: ");
		System.out.println();
		for(int i = 1; i <= 8 - cantNotasFaltantes; i++) {
			System.out.print("Ingresa la nota " + i + ":");
			notaIndividual = entry.nextFloat();
			sumatoriaNotasObtenidas += notaIndividual;
		}
		entry.close();
		promedioFaltante = (608 - sumatoriaNotasObtenidas)/cantNotasFaltantes;
		System.out.print("La calificacion promedio para aprobar el curso es de: " + promedioFaltante);
		if(promedioFaltante > 100) {
			System.out.println("Debido a que la calificación promedio que necesitas para aprobar el curso es mayor a 100, no puedes aprobarlo");
		}
	}

}
