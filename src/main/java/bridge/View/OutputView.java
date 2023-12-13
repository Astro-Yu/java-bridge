package bridge.View;

import static bridge.Constants.OutputMessages.FINAL_RESULT;
import static bridge.Constants.OutputMessages.GAME_RESULT;
import static bridge.Constants.OutputMessages.START_GAME;
import static bridge.Constants.OutputMessages.TRY_COUNT;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    public static void printStartMessage() {
        System.out.println(START_GAME);
    }

    public static void printMap(String map) {
        System.out.println(map);
    }

    public static void printResult(String result, int count, String map) {
        System.out.println(FINAL_RESULT);
        System.out.println(map);
        System.out.println(String.format(GAME_RESULT, result));
        System.out.println(String.format(TRY_COUNT, count));
    }
}
