package baseball.view;

import baseball.domain.BallNumbers;
import baseball.domain.GameStatus;
import baseball.domain.dto.input.BallNumbersDto;
import baseball.io.InputReader;
import baseball.io.OutputWriter;

public class InputView {
    private final InputReader reader;
    private final OutputWriter writer;

    public InputView(InputReader reader, OutputWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public BallNumbers getUserBallNumbers() {
        writer.writeInputNumberMsg();
        String ballNumbersStr = reader.readLine();
        BallNumbersDto ballNumbersDto = new BallNumbersDto(ballNumbersStr);
        return ballNumbersDto.toBallNumbers();
    }

    public GameStatus replayGame() {
        writer.writeGameOverMsg();

        String input = reader.readLine();
        return GameStatus.from(input);
    }
}
