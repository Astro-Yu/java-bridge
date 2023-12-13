package bridge.View;

import static bridge.View.InputValidator.checkBlack;
import static bridge.View.InputValidator.checkEmpty;
import static bridge.View.InputValidator.checkNumeric;

import camp.nextstep.edu.missionutils.Console;

public class InputView {


    public int readBridgeSize() {
        String inputBridge = Console.readLine();
        bridgeValidate(inputBridge);
        return Integer.parseInt(inputBridge);
    }

    public String readMoving() {
        String inputMoving = Console.readLine();
        validate(inputMoving);
        return inputMoving;
    }

    public String readGameCommand() {
        String inputRestart = Console.readLine();
        validate(inputRestart);
        return inputRestart;
    }

    private static void bridgeValidate(String input) {
        checkEmpty(input);
        checkBlack(input);
        checkNumeric(input);

    }

    private static void validate(String input) {
        checkEmpty(input);
        checkBlack(input);
    }
}
