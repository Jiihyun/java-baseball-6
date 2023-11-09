package baseball.domain;

import baseball.domain.dto.output.BallResult;

import static baseball.constant.NumberConst.NUMBER_SIZE;

public class BaseballGame {
    private final BallNumbers answer;

    public BaseballGame(final BallNumbers answer) {
        this.answer = answer;
    }

    public BallResult referee(final BallNumbers guess) {
        return new BallResult(getBallCount(guess),
                getStrikeCount(guess));
    }

    private int getBallCount(final BallNumbers guess) {
        int ballCount = 0;
        for (int i = 0; i < NUMBER_SIZE; i++) {
            final boolean isBall = answer.isBall(guess, i);
            if (isBall) {
                ballCount++;
            }
        }
        return ballCount;
    }

    private int getStrikeCount(final BallNumbers guess) {
        int strikeCount = 0;
        for (int i = 0; i < NUMBER_SIZE; i++) {
            final boolean isStrike = answer.isStrike(guess, i);
            if (isStrike) {
                strikeCount++;
            }
        }
        return strikeCount;
    }
}
