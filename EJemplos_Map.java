package Ejercicios;

import java.util.HashMap;
import java.util.Map;

public class EJemplos_Map {
	public static void main(String[] arg) {
		Map<Integer, String> mapSports = new HashMap<Integer, String>();
		mapSports.put(1, "Karate");
		mapSports.put(2, "Futbol");
		mapSports.put(3, "Volleyball");
		mapSports.put(4, "Basketball");
		
		System.out.println(mapSports.get(3));
		System.out.println(mapSports.containsKey(5));
		System.out.println(mapSports.containsValue("Basketball"));
		System.out.println(mapSports.size());
		System.out.println(mapSports.isEmpty());
		System.out.println(mapSports.values());
		mapSports.remove(1);
		System.out.println(mapSports.values());
		mapSports.clear();
		System.out.println(mapSports.values());
	}
}
