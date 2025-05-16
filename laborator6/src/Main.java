import record.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Adrian", 10);
        System.out.println(person1);

        Person person2 = new Person("Marius", 16);
        System.out.println(person2);

        Person person3 = person1;

        System.out.println("person1 equals person3" + person1.equals(person3));

        Person person4 = new Person(67);
        System.out.println(person4);

        System.out.println(person4.age());
    }
}