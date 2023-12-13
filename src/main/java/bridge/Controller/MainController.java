package bridge.Controller;

import static bridge.View.OutputView.printResult;
import static bridge.View.OutputView.printStartMessage;

import bridge.Model.BridgeMaker;
import bridge.Model.BridgeRandomNumberGenerator;
import bridge.Model.FinalResult;
import bridge.Model.RetryCounter;
import java.util.List;

public class MainController {

    public void runGame() {
        printStartMessage();
        int size = UserInputHandler.getValidSize();
        boolean isContinue = true;
        BridgeGame bridgeGame = new BridgeGame();
        RetryCounter retryCounter = new RetryCounter();
        BridgeMaker bridgeMaker = new BridgeMaker(new BridgeRandomNumberGenerator());
        List<String> answerBridge = bridgeMaker.makeBridge(size);
        FinalResult finalResult = new FinalResult();

        while (isContinue) {
            retryCounter.addOne();
            bridgeGame.move(size, answerBridge, finalResult);
            if (!bridgeGame.getGameResult()) { // 재시작 물어보기
                isContinue = bridgeGame.retry();
            }
            if (bridgeGame.getGameResult()) { // 게임이 끝났으면 종료
                isContinue = false;
            }
        }

        printResult(resultController(bridgeGame.getGameResult()), retryCounter.getRetryCounter(),
                finalResult.getFinalResult());
    }

    private String resultController(boolean result) {
        if (result) {
            return "성공";
        }
        return "실패";
    }
}
