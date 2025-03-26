package switchStatement;
//Using yield for Multi-Line Expressions
// If a case requires more than one statement, use yield to return a value:
public class YieldExample {
    public static void main(String[] args) {
        int number = 2;

        String result = switch (number) {
            case 1 -> "One";
            case 2 -> {
                System.out.println("Processing case 2...");
                yield "Two"; // Return value from the case
            }
            default -> "Unknown";
        };

        System.out.println(result);
    }
}