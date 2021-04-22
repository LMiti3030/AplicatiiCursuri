package lauramititelu.java11arrayscollections.maps;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
       // hashMaps();

        TreeMap<Integer, String> planets = new TreeMap<>();
        Map<String, String> englishSpanish = new TreeMap<>();

        planets.put(3, "Earth");
        planets.put(2, "Venus");
        planets.put(4, "Mars");

        planets.forEach((key, value) -> {
            System.out.println(key +  "  " + value);
        });

        System.out.println(planets.keySet().toString());

        System.out.println("englishSpanish");
        englishSpanish.put("dog", "perro");
        englishSpanish.put("cat", "gato");
        englishSpanish.put("fish", "pez");

        System.out.println(englishSpanish.keySet().toString());

        planets.put( 20, null);
        planets.forEach((key, value) -> {
            System.out.println(key +  "  " + value);
        });
        planets.put(null, null);

    }

    private static void hashMaps() {
        HashMap countries = new HashMap();
        HashMap<Integer, String> countries2 = new HashMap<>();
        Map languages = new HashMap();
        Map<String, String> languages2 = new HashMap<>();

        countries2.put(840,"USA");
        countries2.put(484, "MEX");
        countries2.put(124, "CAN");

        System.out.println(countries2.get(124));

        Set<Integer> countryCodes = countries2.keySet();
        countryCodes.forEach(System.out::println);

        countries2.forEach((key, value) ->{
            System.out.print("key " + key);
            System.out.println(" value " + value);
        });


        if(countries2.get(124)==null) {
            countries2.put(124, "ABC");
        }
        else {
            System.out.println("Code already exists");
        }
        countries2.forEach((key, value) ->{
            System.out.print("key " + key);
            System.out.println(" value " + value);
        });

        Collection<String> countriesFromMap = countries2.values();
        countriesFromMap.forEach(System.out::println);

        countries2.containsKey(840);
        countries2.containsValue("USA");

        countries2.put(-1, null);
        countries2.put(null, null);
        countries2.forEach((key, value) ->{
            System.out.print("key " + key);
            System.out.println(" value " + value);
        });
    }

}
