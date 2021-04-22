package lauramititelu.java11arrayscollections.lists;

import java.util.*;

public class ListMain {
    public static void main(String[] args) {
        //joacaLaura();

        // examplesWithArrayLists();

       // examplesListToArray();

        // arraysToLists();

        //linkedList();

        sortList();

    }

    private static void sortList() {
        List numberList = new ArrayList();
        numberList.add(10);
        numberList.add(5);
        numberList.add(1);
        numberList.add(3);
        numberList.add(9);

        System.out.println(numberList);
        Collections.sort(numberList);
        System.out.println(numberList);
    }

    private static void linkedList() {
        LinkedList<String> orders = new LinkedList<>();
        orders.add("order 1");
        orders.add("order 2");
        orders.add("order 3");
        System.out.println(orders);
        orders.addFirst("order 4");
        orders.addLast("order 5");
        System.out.println(orders);
        orders.removeFirst();
        orders.removeLast();
        System.out.println(orders);
    }

    private static void arraysToLists() {
        String[] shapes = new String[]{"square", "circle", "triangle"};
        List shapeList = Arrays.asList(shapes);
        System.out.println(shapeList);
        System.out.println(shapeList.getClass().getName());

        List<String> colors = new ArrayList<>();
        System.out.println(colors.getClass().getName());

        List shapeList2 = List.of(shapes);
        //shapeList2.add("rectangle");

//        shapeList2 = List.copyOf(colors);
//        shapeList2.add("yellow");

        List<String> shapeList3 = new ArrayList<>();
        for(String shape: shapes){
            shapeList3.add(shape);
        }
        System.out.println(shapeList3);

        Object[] shapes2 = shapeList3.toArray();
    }

    private static void examplesListToArray() {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("blue");
        colors.add(1, "orange");

        Object[] colorObsArray = colors.toArray();
        System.out.println(Arrays.toString(colorObsArray));
        String[] colorArray = colors.toArray(new String[0]);
        System.out.println(Arrays.toString(colorObsArray));

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(96);
        intList.add(101);
        Integer[] intArray = intList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intArray));
    }

    private static void examplesWithArrayLists() {
        List arrayList4 = new ArrayList();
        Collection arrayList5 = new ArrayList();
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("blue");
        colors.add(1, "orange");
//
//        for( int i = 0; i < colors.size(); i++){
//            System.out.println(colors.get(i));
//        }
//
//        for(String color: colors){
//            System.out.println(color);
//        }

        colors.forEach( color -> {
            System.out.println(color);
        });

        System.out.println("removing items");
//        colors.remove("orange");
//        colors.remove(0);
//        colors.forEach(System.out::println);

        //compiles, runs but with unreliable results
//        for (int i = 0; i < colors.size(); i++) {
//            colors.remove(i);
//        }
//        System.out.println(colors);

        //compiles but throws errors!!
//        for(String color: colors){
//            colors.remove(color);
//        }
//
//        System.out.println(colors);
    }

    private static void joacaLaura() {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(96);
        intList.add(101);
        ArrayList<Double> doubleList = new ArrayList<>(100);
        doubleList.add(9.396);
        doubleList.add(101.96);
        ArrayList<Double> doubleList2 = new ArrayList<>();
        // doubleList2.add(doubleList); // eroare compilare -> e nevoie de addAll
        doubleList2.addAll(doubleList);
        // doubleList2.addAll(intList); //nu pot aduaga decat tot tip Double
        doubleList2.forEach(s -> System.out.println(s));
        doubleList2.forEach(System.out::println);

        System.out.println(doubleList.size());
        ArrayList<Object> objectList = new ArrayList<Object>(doubleList);

        objectList.add(Double.valueOf(3));
        objectList.add (Double.parseDouble("3.95"));
        objectList.add(Integer.valueOf(1));
        objectList.add("Anita s-a trezit");

        objectList.add(intList); //adauga un obiect de tip array [96,101]
        objectList.addAll(intList);

        objectList.forEach(s -> System.out.println(s));
    }
}
