package ex2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        TwoFactorFunction obj = new Multiply();
        System.out.println(obj.calculate(2,3));
//instantiate class implementing interface as anonymous class
        TwoFactorFunction multiply2 = new TwoFactorFunction() {
            @Override
            public int calculate(int x, int y) {
                return x * y;
            }
        };

        TwoFactorFunction multiply3 = (x, y) -> x * y;
        System.out.println(multiply3.calculate(2,3));

        System.out.println(multiply2.calculate(2,3));


        Runnable runnable = () -> {
            System.out.println("Hello from lambda expression");
            System.out.println("it works");
        };

        runnable.run();
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        Comparable compHash = o -> o.hashCode();

        Comparator comparator = (o1, o2) -> o1.hashCode() - o2.hashCode();

        System.out.println(compareUsing((o1,o2) -> o1.hashCode() - o2.hashCode()));
        System.out.println(compareUsing(comparator));
    }
    static int compareUsing(Comparator comparator) {
        return comparator.compare(new Object(), new Object());
    }
}
