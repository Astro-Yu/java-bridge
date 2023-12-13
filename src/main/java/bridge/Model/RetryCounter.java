package bridge.Model;

public class RetryCounter {

    private int retryCounter;

    public RetryCounter(int retryCounter) {
        this.retryCounter = retryCounter;
    }

    public void addOne() {
        retryCounter += 1;
    }

    public int getRetryCounter() {
        return retryCounter;
    }
}
