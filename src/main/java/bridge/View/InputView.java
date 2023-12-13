package bridge.View;

import static bridge.Constants.InputMessages.ASK_RESTART;
import static bridge.Constants.InputMessages.INSERT_BRIDGE_LENGTH;
import static bridge.Constants.InputMessages.INSERT_MOVE;
import static bridge.View.InputValidator.checkBlack;
import static bridge.View.InputValidator.checkEmpty;
import static bridge.View.InputValidator.checkNumeric;

import camp.nextstep.edu.missionutils.Console;

public class InputView {


    public static int readBridgeSize() {
        System.out.println(INSERT_BRIDGE_LENGTH);
        String inputBridge = Console.readLine();
        bridgeValidate(inputBridge);
        return Integer.parseInt(inputBridge);
    }

    public static String readMoving() {
        System.out.println(INSERT_MOVE);
        String inputMoving = Console.readLine();
        validate(inputMoving);
        return inputMoving;
    }

    public static String readGameCommand() {
        System.out.println(ASK_RESTART);
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
