package baseball.domain.dto.input;

import baseball.domain.BallNumbers;
import baseball.validator.BallNumbersValidator;

import java.util.Arrays;
import java.util.List;

public record BallNumbersDto(String ballNumbersStr) {
    public BallNumbersDto {
        BallNumbersValidator.validateNumber(ballNumbersStr);
    }

    public BallNumbers toBallNumbers() {
        List<Integer> userNumbers = Arrays.stream(ballNumbersStr.split(""))
                .map(Integer::parseInt)
                .toList();
        return BallNumbers.from(userNumbers);
    }
}
