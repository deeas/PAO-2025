package switchStatement;
/*Using Enhanced switch with Pattern Matching (Java 17+)
Pattern Matching Benefits

- Avoids explicit type casting.
- Cleaner and safer code.*/
public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello, World!";

        String result = switch (obj) {
            case Integer i -> "It's an integer: " + i;
            case String s -> "It's a string: " + s;
            case null -> "It's null";
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}
