package baseball.validator;

import java.util.List;

import static baseball.constant.MessageConst.*;
import static baseball.constant.NumberConst.*;

public class BallNumbersValidator {

    //인스턴스화 방지
    private BallNumbersValidator() {
        throw new AssertionError();
    }

    public static void validateNumberSize(List<Integer> numberList) {
        if (numberList.size() != NUMBER_SIZE) {
            throw new IllegalArgumentException(NUMBER_SIZE_EXCEPTION);
        }
    }

    public static void validateDuplicateNumber(List<Integer> numberList) {
        if (numberList.stream()
                .distinct()
                .count() != NUMBER_SIZE) {
            throw new IllegalArgumentException(NUMBER_DUPLICATION_EXCEPTION);
        }
    }

    public static void validateNumberRange(List<Integer> numberList) {
        for (Integer num : numberList) {
            if (num < START_INCLUSIVE || num > END_INCLUSIVE) {
                throw new IllegalArgumentException(NUMBER_RANGE_EXCEPTION);
            }
        }
    }

    public static void validateNumber(String ballNumbersStr) {
        for (int i = 0; i < ballNumbersStr.length(); i++) {
            if (!Character.isDigit(ballNumbersStr.charAt(i))) {
                throw new IllegalArgumentException(NUMBER_INPUT_FORMAT_EXCEPTION);
            }
        }
    }
}
