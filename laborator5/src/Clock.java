public class Clock implements TimeKeeper {

    @Override
    public float getTime() {
        return System.currentTimeMillis();
    }
}
