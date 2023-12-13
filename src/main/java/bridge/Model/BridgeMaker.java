package bridge.Model;

import java.util.List;

/**
 * 다리의 길이를 입력 받아서 다리를 생성해주는 역할을 한다.
 */
public class BridgeMaker {

    private static final String UP = "U";
    private static final String DOWN = "D";

    private final BridgeNumberGenerator bridgeNumberGenerator;

    public BridgeMaker(BridgeNumberGenerator bridgeNumberGenerator) {
        this.bridgeNumberGenerator = bridgeNumberGenerator;
    }

    /**
     * @param size 다리의 길이
     * @return 입력받은 길이에 해당하는 다리 모양. 위 칸이면 "U", 아래 칸이면 "D"로 표현해야 한다.
     */
    public List<String> makeBridge(int size) {
        Bridge bridge = new Bridge(size);
        for (int index = 0; index < size; index++) {
            String upDown = upDownChanger(bridgeNumberGenerator.generate());
            bridge.addBridge(upDown);
        }
        return bridge.getBridge();
    }

    private String upDownChanger(int number) {
        if (number == 1) {
            return UP;
        }
        return DOWN;
    }
}
