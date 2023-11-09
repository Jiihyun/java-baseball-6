package baseball.controller;

import baseball.domain.AnswerBallNumberGenerator;
import baseball.domain.BallNumbers;
import baseball.domain.BaseballGame;
import baseball.domain.GameStatus;
import baseball.domain.dto.output.BallResult;
import baseball.view.InputView;
import baseball.view.OutputView;

import static baseball.constant.NumberConst.THREE_STRIKE;

public class GameController {
    private final OutputView outputView;
    private final InputView inputView;
    private final AnswerBallNumberGenerator answerBallNumberGenerator;

    public GameController(OutputView outputView, InputView inputView, AnswerBallNumberGenerator answerBallNumberGenerator) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.answerBallNumberGenerator = answerBallNumberGenerator;
    }

    public void start() {
        outputView.printGameStartMsg();
        do {
            final BaseballGame game = createGame();
            play(game);
        } while (keepGame());
    }

    private BaseballGame createGame() {
        BallNumbers answerBallNumbers = answerBallNumberGenerator.generateAnswerNumbers();
        return new BaseballGame(answerBallNumbers);
    }

    private boolean keepGame() {
        GameStatus gameStatus = inputView.replayGame();
        return GameStatus.RESTART == gameStatus;
    }

    private void play(final BaseballGame game) {
        while (true) {
            BallNumbers userBallNumbers = inputView.getUserBallNumbers();
            final BallResult result = game.referee(userBallNumbers);
            outputView.printGameResult(result);
            if (result.strikeCount() == THREE_STRIKE) {
                break;
            }
        }
    }
}
