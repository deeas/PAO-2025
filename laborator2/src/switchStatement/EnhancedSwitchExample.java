package switchStatement;
/*Basic Example of Enhanced switch
Enhanced switch in Java

Starting from Java 12 (preview) and fully introduced in Java 14,
the switch statement was enhanced with switch expressions.
These improvements make the syntax more concise, flexible, and powerful.
- No break needed (reducing boilerplate code).
- Uses -> (arrow operator) for concise syntax.
- Allows multiple case labels in one line (case "SATURDAY", "SUNDAY" -> "Weekend";).
- Acts as an expression (returns a value).*/
public class EnhancedSwitchExample {
    public static void main(String[] args) {
        String day = "MONDAY";

        String type = switch (day) {
            case "SATURDAY", "SUNDAY" -> "Weekend";  // Multiple cases in one line
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            default -> "Invalid day";
        };

        System.out.println(type);  // Output: Weekday
    }
}