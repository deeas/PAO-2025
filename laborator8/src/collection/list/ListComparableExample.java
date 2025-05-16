package collection.list;

import commun.ComparableStudent;
import commun.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListComparableExample {

    public static void main(String[] args) {
        List<ComparableStudent> comparableStudentList = new ArrayList<>();
        comparableStudentList.add(new ComparableStudent("Popescu", "Andrei", 22L));
        comparableStudentList.add(new ComparableStudent("Ionescu", "Vlad", 21L));
        comparableStudentList.add(new ComparableStudent("Marinescu", "Diana", 20L));


        System.out.println(comparableStudentList);

        Collections.sort(comparableStudentList);

        System.out.println(comparableStudentList);

    }
}
