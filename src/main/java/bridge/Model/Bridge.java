package bridge.Model;

import static bridge.Constants.ErrorMessages.INVALID_BRIDGE_SIZE_MESSAGE;

import java.util.ArrayList;
import java.util.List;

public class Bridge {
    private static final int MIN_BRIDGE_SIZE = 3;
    private static final int MAX_BRIDGE_SIZE = 20;
    private final int size;
    private final List<String> bridge;

    public Bridge(int size) {
        validate(size);
        this.size = size;
        this.bridge = new ArrayList<>();
    }

    public void addBridge(String move) {
        this.bridge.add(move);
    }

    public List<String> getBridge() {
        return bridge;
    }

    private void validate(int size) {
        checkSize(size);
    }

    private void checkSize(int size) {
        if (!properSize(size)) {
            throw new IllegalArgumentException(INVALID_BRIDGE_SIZE_MESSAGE.getMessage());
        }
    }

    private boolean properSize(int size) {
        return size >= MIN_BRIDGE_SIZE && size <= MAX_BRIDGE_SIZE;
    }
}
