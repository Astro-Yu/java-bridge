package bridge.View;

import static bridge.Constants.ErrorMessages.INVALID_BLANK_MESSAGE;
import static bridge.Constants.ErrorMessages.INVALID_EMPTY_MESSAGE;
import static bridge.Constants.ErrorMessages.INVALID_INPUT_MESSAGE;

public class InputValidator {

    public static void checkEmpty(String input) {
        if (isEmpty(input)) {
            throw new IllegalArgumentException(INVALID_EMPTY_MESSAGE.getMessage());
        }
    }

    public static void checkBlack(String input) {
        if (isBlank(input)) {
            throw new IllegalArgumentException(INVALID_BLANK_MESSAGE.getMessage());
        }
    }

    public static void checkNumeric(String input) {
        if (!isNumeric(input)) {
            throw new IllegalArgumentException(INVALID_INPUT_MESSAGE.getMessage());
        }
    }

    private static boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private static boolean isBlank(String input) {
        return input.isBlank();
    }

    // 문자 자체에 숫자가 들어있나 체크하는 함수. 1000 -> true, 1000j -> false
    private static boolean isNumeric(String input) {
        return input.chars().allMatch(Character::isDigit);
    }

}
