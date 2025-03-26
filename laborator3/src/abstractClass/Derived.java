package abstractClass;

public class Derived extends  MyAbstractClass {

    @Override
    public void test() {
        System.out.println("Hello from derived class");
    }

    @Override
    public void test2() {

    }

    public static void main(String[] args) {
        MyAbstractClass m1 = new Derived();

        m1.test();
    }

}
