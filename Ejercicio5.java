package Ejercicios;
import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] arg) {
		Scanner entry = new Scanner(System.in);
		String sentence, word;
		System.out.println("Ingresa una cadena de caracteres donde se buscara la palabra de tu elección:");
		sentence = entry.nextLine();
		System.out.print("Ahora ingresa la palabra que buscaremos en la cadena anteriormente ingresada: ");
		word = entry.nextLine();
		entry.close();
		int pos = sentence.indexOf(word);
		if(pos == -1) {
			System.out.println("La palabra '" + word + "' no esta contenida en la oración '" + sentence + "'");
		} else {
			System.out.println("La palabra " + word + " esta desde la posicion " + pos + " hasta la posicion " + (pos + word.length() - 1));
		}	
	}

}
