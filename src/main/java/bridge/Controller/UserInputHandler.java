package bridge.Controller;

import static bridge.View.InputView.readBridgeSize;
import static bridge.View.InputView.readGameCommand;
import static bridge.View.InputView.readMoving;

import bridge.Model.Restart;
import bridge.Model.UpDown;

public class UserInputHandler {

    public static int getValidSize() {
        while (true) {
            try {
                return readBridgeSize();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static UpDown getValidMove() {
        while (true) {
            try {
                String move = readMoving();
                return new UpDown(move);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }
        }
    }

    public static Restart getValidRestart() {
        while (true) {
            try {
                String restart = readGameCommand();
                return new Restart(restart);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }
        }
    }
}
