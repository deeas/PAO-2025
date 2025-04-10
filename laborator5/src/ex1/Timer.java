public interface Timer {

    long start();
    long stop();

    default long getDuration() {
        return stop() - start();
    }
}
