package collection.list;

import java.sql.SQLOutput;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();

        List<String> plants = new ArrayList<>(60);

        //plants.add(50, "planta1"); Index Out of Bound Exception
        System.out.println(plants.size() + " " + plants.isEmpty());

        plants.add(0, "plants2");
        System.out.println(plants + " " + plants.size());

        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Pear", "Orange"));

        fruits.add("Apple");

        fruits.add(0, "Strawberry");

        fruits.add(5, "Lemon");

        System.out.println(fruits);
        System.out.println(fruits.indexOf("lemon"));

        for (String fruit: fruits) {
            System.out.println(fruit + " Pozitia: " + fruits.indexOf(fruit));
        }

        fruits.remove("Apple");




        //fruits.removeAll(fruits);


        System.out.println("\nIterator iteration");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();

            if (fruit.equals("Apple")) {
                iterator.remove();
            }
        }

        System.out.println("Iterator backward: ");

        ListIterator<String> backwardIterator = fruits.listIterator();
        System.out.println("previous");
        while (backwardIterator.hasPrevious()) {
            System.out.println(backwardIterator.previousIndex() + " " + backwardIterator.previous());
        }

        System.out.println("next");
        while (backwardIterator.hasNext()) {
            System.out.println("Has previous: " + backwardIterator.hasPrevious());
            System.out.println(backwardIterator.nextIndex() + " " + backwardIterator.next());
        }

        fruits.add("Blackberry");
        System.out.println("\nPrint fruit list before sorting: "+ fruits);
        Collections.sort(fruits);

        System.out.println("\nPrint final fruit list: "+ fruits);

    }
}
