package collection.list;

import commun.Student;

import java.util.Iterator;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Student> students = new java.util.LinkedList<>();

        students.add(new Student("Popescu", "Andrei", 22L));
        students.add(new  Student("Ionescu", "Vlad", 21L));
        students.add(new Student("Marinescu", "Diana", 20L));

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("first student: " +students.getFirst());
        System.out.println("lats student: " + students.getLast());
    }
}
