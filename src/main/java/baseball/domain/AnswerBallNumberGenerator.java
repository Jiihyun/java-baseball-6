package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import static baseball.constant.NumberConst.*;

public class AnswerBallNumberGenerator {
    private int getRandomNumber1to9() {
        return Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
    }

    public BallNumbers generateAnswerNumbers() {
        Set<Integer> answer = new LinkedHashSet<>();
        while (answer.size() < NUMBER_SIZE) {
            answer.add(getRandomNumber1to9());
        }
        return BallNumbers.from(new ArrayList<>(answer));
    }
}
