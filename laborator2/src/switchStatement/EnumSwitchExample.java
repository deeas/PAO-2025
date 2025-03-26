package switchStatement;

enum TrafficLight { RED, YELLOW, GREEN, TEST }

public class EnumSwitchExample {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;

        String action = switch (light) {
            case RED -> "Stop";
            case YELLOW -> "Get ready";
            case GREEN -> "Go";
            default -> "Unknown";
        };

        System.out.println(action); // Output: Stop
    }
}