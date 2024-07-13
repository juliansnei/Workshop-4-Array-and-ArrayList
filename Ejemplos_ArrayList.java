package Ejercicios;

import java.util.ArrayList;

public class Ejemplos_ArrayList {
	public static void main(String[] arg) {
		ArrayList<Integer> arregloEjemplo1 = new ArrayList<Integer>();
		ArrayList<String> arregloEjemplo2 = new ArrayList<String>();
		ArrayList<Boolean> arregloEjemplo3 = new ArrayList<Boolean>();
		ArrayList<Float> arregloEjemplo4 = new ArrayList<Float>();
		ArrayList<Double> arregloEjemplo5 = new ArrayList<Double>();
		
		arregloEjemplo1.add(1);
		arregloEjemplo1.add(34);
		arregloEjemplo1.add(25);
		arregloEjemplo1.add(100);
		arregloEjemplo1.add(56);
		
		arregloEjemplo2.add("Mercurio");
		arregloEjemplo2.add("Marte");
		arregloEjemplo2.add("Pluton");
		arregloEjemplo2.add("Saturno");
		arregloEjemplo2.add("Jupiter");
		
		arregloEjemplo3.add(true);
		arregloEjemplo3.add(true);
		arregloEjemplo3.add(false);
		arregloEjemplo3.add(false);
		arregloEjemplo3.add(true);
		
		arregloEjemplo4.add(2.5f);
		arregloEjemplo4.add(3.5f);
		arregloEjemplo4.add(2.00001f);
		arregloEjemplo4.add(3.1416f);
		arregloEjemplo4.add(0.001f);
		
		arregloEjemplo5.add(45.45);
		arregloEjemplo5.add(239.001);
		arregloEjemplo5.add(23.8);
		arregloEjemplo5.add(1.0002);
		arregloEjemplo5.add(1.5);
		
		System.out.println(arregloEjemplo1.size());
		System.out.println(arregloEjemplo2.size());
		System.out.println(arregloEjemplo3.size());
		System.out.println(arregloEjemplo4.size());
		System.out.println(arregloEjemplo5.size());
		System.out.println("\n");
		
		System.out.println(arregloEjemplo1.get(1));
		System.out.println(arregloEjemplo2.get(2));
		System.out.println(arregloEjemplo3.get(4));
		System.out.println(arregloEjemplo4.get(4));
		System.out.println(arregloEjemplo5.get(4));
		System.out.println("\n");
	
		System.out.println(arregloEjemplo1.contains(100));
		System.out.println(arregloEjemplo2.contains("Jupiter"));
		System.out.println(arregloEjemplo3.contains(false));
		System.out.println(arregloEjemplo4.contains(3.1f));
		System.out.println(arregloEjemplo5.contains(1.50));
		System.out.println("\n");
		
		System.out.println(arregloEjemplo1.indexOf(100));
		System.out.println(arregloEjemplo2.indexOf("Jupiter"));
		System.out.println(arregloEjemplo3.indexOf(false));
		System.out.println(arregloEjemplo4.indexOf(3.1f));
		System.out.println(arregloEjemplo5.indexOf(1.50));
		System.out.println("\n");
		
		arregloEjemplo1.clear();
		ArrayList arrayListCopia = (ArrayList) arregloEjemplo2.clone();
		arrayListCopia.add(2, "Neptuno");
		for(Object planeta : arrayListCopia) {
			System.out.println(planeta);
		}
	}
}
