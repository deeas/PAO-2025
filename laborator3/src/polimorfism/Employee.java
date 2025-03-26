package polimorfism;

import mostenire.Manager;

public class Employee {
    public static final int base = 10000;

    int salary() {
        return base;
    }
}

    class Clerk extends Employee {
       int salary(){
           return base + 10000;
       }

    }

    class AnotherClerk extends Manager {
    @Override
    int salary() {
            return base + 10000;
        }
    }

    class DynamicMethodBindgs {
        static void printSalary(Employee e) {
            System.out.println(e.salary());
        }

        public static void main(String[] args) {
            Employee obj1 = new Manager();
            printSalary(obj1);

            Employee obj2 = new Clerk();
            printSalary(obj2);

            Employee obj3 = new AnotherClerk();
            printSalary(obj3);

        }
    }


