package baseball.view;

import baseball.domain.dto.output.BallResult;

import static baseball.constant.MessageConst.*;

public class OutputView {
    public void printGameStartMsg() {
        System.out.println(GAME_START_MSG);
    }

    public void printGameResult(final BallResult ballResult) {
        if (ballResult.ballCount() == 0 && ballResult.strikeCount() == 0) {
            System.out.print(NOTHING);
        }
        if (ballResult.ballCount() > 0) {
            System.out.printf("%d%s ", ballResult.ballCount(), BALL);
        }
        if (ballResult.strikeCount() > 0) {
            System.out.printf("%d%s", ballResult.strikeCount(), STRIKE);
        }
        System.out.println();
    }
}
