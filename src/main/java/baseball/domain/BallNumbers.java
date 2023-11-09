package baseball.domain;

import baseball.validator.BallNumbersValidator;

import java.util.List;

public class BallNumbers {
    private final List<Integer> numberList;

    public BallNumbers(List<Integer> numberList) {
        BallNumbersValidator.validateNumberRange(numberList);
        BallNumbersValidator.validateNumberSize(numberList);
        BallNumbersValidator.validateDuplicateNumber(numberList);
        this.numberList = numberList;
    }

    public static BallNumbers from(List<Integer> numberList) {
        return new BallNumbers(numberList);
    }

    public boolean isStrike(BallNumbers userNumbers, int index) {
        Integer userNumber = userNumbers.numberList
                .get(index);
        Integer answerNumber = numberList.get(index);
        return answerNumber.equals(userNumber);
    }

    public boolean isBall(BallNumbers userNumbers, int index) {
        return !isStrike(userNumbers, index) && numberList.contains(userNumbers.numberList.get(index));
    }

}
