package bridge.Controller;

import static bridge.View.OutputView.printMap;

import bridge.Model.FinalResult;
import bridge.Model.Restart;
import bridge.Model.UpDown;
import java.util.List;

public class BridgeGame {
    private boolean gameResult;

    public void move(int size, List<String> answerBridge, FinalResult finalResult) {
        gameResult = true;

        for (int index = 0; index < size; index++) {
            UpDown move = UserInputHandler.getValidMove();

            if (!answerBridge.get(index).equals(move.getMove())) {
                finalResult.addFailResult(move.getMove());
                printMap(finalResult.getFinalResult());
                gameResult = false;
                break;
            }
            finalResult.addSuccessResult(move.getMove());
            printMap(finalResult.getFinalResult());
        }
    }

    public boolean retry() {
        Restart inputRestart = UserInputHandler.getValidRestart();
        return inputRestart.isRestart();
    }

    public boolean getGameResult() {
        return gameResult;
    }
}
