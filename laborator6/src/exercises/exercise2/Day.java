package exercises.exercise2;

public enum Day {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),

    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),

    SUNDAY(true);

    private final boolean weekend;

    Day(boolean weekend) {
        this.weekend = weekend;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public String describe() {
        return this.name() + (weekend ? " is weekend" : "is weekday");
    }
}
