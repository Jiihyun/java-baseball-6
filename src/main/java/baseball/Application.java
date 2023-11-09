package baseball;

import baseball.controller.GameController;
import baseball.domain.AnswerBallNumberGenerator;
import baseball.io.InputReader;
import baseball.io.OutputWriter;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        OutputView outputView = new OutputView();
        InputView inputView = new InputView(new InputReader(), new OutputWriter());
        AnswerBallNumberGenerator answerBallNumberGenerator = new AnswerBallNumberGenerator();
        GameController gameController = new GameController(outputView, inputView, answerBallNumberGenerator);
        gameController.start();
    }
}
