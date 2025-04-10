public class Smartphone implements Timer, TimeKeeper {
    @Override
    public float getTime() {
        return System.currentTimeMillis();
    }

    @Override
    public long start() {
        return System.currentTimeMillis() - 1000;
    }

    @Override
    public long stop() {
        return System.currentTimeMillis() + 1000;
    }
}
