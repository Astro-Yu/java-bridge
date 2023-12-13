package bridge.Model;

public class RetryCounter {

    private final static int INITIAL_COUNT = 0;
    private int retryCounter;

    public RetryCounter() {
        this.retryCounter = INITIAL_COUNT;
    }

    public void addOne() {
        retryCounter += 1;
    }

    public int getRetryCounter() {
        return retryCounter;
    }
}
