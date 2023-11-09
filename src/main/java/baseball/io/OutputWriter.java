package baseball.io;

import static baseball.constant.MessageConst.*;

public class OutputWriter {
    public void writeGameStartMsg() {
        System.out.println(GAME_START_MSG);
    }

    public void writeInputNumberMsg() {
        System.out.print(INPUT_NUMBER_MSG);
    }

    public void writeGameOverMsg() {
        System.out.println(GAME_OVER_MSG);
        System.out.println(RESTART_OR_NOT_MSG);
    }
}
