package baseball.domain;

import static baseball.constant.MessageConst.*;

public enum GameStatus {
    RESTART("1"),
    EXIT("2");

    private final String input;

    GameStatus(String input) {
        this.input = input;
    }

    public static GameStatus from(final String input) {
        if (RESTART_FORMAT.equals(input)) {
            return RESTART;
        }
        if (EXIT_FORMAT.equals(input)) {
            return EXIT;
        }
        throw new IllegalArgumentException(RESTART_FORMAT_EXCEPTION);
    }
}
