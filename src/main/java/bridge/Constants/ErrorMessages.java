package bridge.Constants;

public enum ErrorMessages {
    ERROR_PREFIX("[ERROR] "),
    INVALID_BLANK_MESSAGE("공백은 입력할 수 없습니다."),
    INVALID_EMPTY_MESSAGE("아무 값도 입력하지 않았습니다."),
    INVALID_BRIDGE_SIZE_MESSAGE("적절한 다리 길이가 아닙니다."),
    INVALID_MOVE_MESSAGE("U 혹은 D만 입력할 수 있습니다."),
    INVALID_RESTART_MESSAGE("R 혹은 Q만 입력할 수 있습니다."),
    INVALID_INPUT_MESSAGE("숫자만 입력할 수 있습니다.");

    private String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_PREFIX.message + message;
    }
}
