package bridge.Model;

import static bridge.Constants.ErrorMessages.INVALID_RESTART_MESSAGE;

public class Restart {

    private final String restart;

    public Restart(String restart) {
        validate(restart);
        this.restart = restart;
    }

    public boolean isRestart() {
        return restart.equals("R");
    }

    private void validate(String input) {
        checkMove(input);
    }

    private void checkMove(String input) {
        if (!validMove(input)) {
            throw new IllegalArgumentException(INVALID_RESTART_MESSAGE.getMessage());
        }
    }

    private boolean validMove(String input) {
        return input.equals("R") || input.equals("Q");
    }
}
