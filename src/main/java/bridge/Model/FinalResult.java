package bridge.Model;

import java.util.ArrayList;
import java.util.List;

public class FinalResult {
    private static final String CAN_GO = " O ";
    private static final String CANNOT_GO = " X ";
    private static final String EMPTY = "   ";
    private List<String> upFinalResult;
    private List<String> downFinalResult;

    public FinalResult() {
        this.downFinalResult = new ArrayList<>();
        this.upFinalResult = new ArrayList<>();
    }

    public void addSuccessResult(String move) {
        if (move.equals("U")) {
            upFinalResult.add(CAN_GO);
            downFinalResult.add(EMPTY);
        }
        if (move.equals("D")) {
            downFinalResult.add(CAN_GO);
            upFinalResult.add(EMPTY);
        }
    }

    public void addFailResult(String move) {
        if (move.equals("U")) {
            upFinalResult.add(CANNOT_GO);
            downFinalResult.add(EMPTY);
        }
        if (move.equals("D")) {
            downFinalResult.add(CANNOT_GO);
            upFinalResult.add(EMPTY);
        }
    }

    public String getFinalResult() {
        return String.format("[" + getupFinalResult() + "]" + "\n" + "[" + getDownFinalResult() + "]");
    }

    private String getupFinalResult() {
        return String.join("|", upFinalResult);
    }

    private String getDownFinalResult() {
        return String.join("|", downFinalResult);
    }

}
