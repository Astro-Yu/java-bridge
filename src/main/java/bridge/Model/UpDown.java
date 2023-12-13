package bridge.Model;

import static bridge.Constants.ErrorMessages.INVALID_MOVE_MESSAGE;

public class UpDown {

    private final String move;

    public UpDown(String move) {
        validate(move);
        this.move = move;
    }

    public String getMove() {
        return move;
    }

    private void validate(String move) {
        checkMove(move);
    }

    private void checkMove(String move) {
        if (!validMove(move)) {
            throw new IllegalArgumentException(INVALID_MOVE_MESSAGE.getMessage());
        }
    }

    private boolean validMove(String move) {
        return move.equals("U") || move.equals("D");
    }
}
