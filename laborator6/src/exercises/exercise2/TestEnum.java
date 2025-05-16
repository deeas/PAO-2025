package exercises.exercise2;

public class TestEnum {
    public static void main(String[] args) {
        for (Day day: Day.values()) {
            System.out.println(day.describe());
        }
    }
}
