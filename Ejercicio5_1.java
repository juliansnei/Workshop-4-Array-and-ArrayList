package Ejercicios;
import java.util.Scanner;
public class Ejercicio5_1 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		String sentence, word;
		int contador = 0, contador1 = 0, position = 0;
		boolean isFound = false;
		System.out.println("Ingresa una cadena de caracteres donde se buscara la palabra de tu elección:");
		sentence = entry.nextLine();
		System.out.print("Ahora ingresa la palabra que buscaremos en la cadena anteriormente ingresada: ");
		word = entry.nextLine();
		entry.close();
		while(contador < sentence.length() - 1 && isFound == false) {
			if(sentence.charAt(contador) == word.charAt(0)) {
				position = contador;
				contador++;
				for(int i = 1; i <= word.length() - 1; i++) {
					if(sentence.charAt(contador) == word.charAt(i)) {
						contador1++;
					} else {
						break;
					}
					contador++;
				}
				if(contador1 == word.length() - 1) {
					isFound = true;
				} else {
					position = 0;
					contador = contador - (contador1 + 1);
					contador1 = 0;
				}
			}
			contador++;
		}
		if(isFound == true) {
			System.out.print("La palabra se encontro desde la posición " + position + " hasta la posición " + (position + word.length() - 1));
		} else {
			System.out.print("La palabra no se ecnontro en la oración");
		}
	}
}
