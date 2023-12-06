package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class UserNumber {
    public static final String USER_NUMBER_RE_REQUEST_MESSAGE = "사용자 번호를 다시 입력해 주십시오.";

    private final List<Integer> number;

    public UserNumber(List<Integer> number) {
        validateDuplication(number);
        validateNumberLength(number);

        this.number = number;
    }

    private void validateDuplication(List<Integer> number) {
        Set<Integer> duplicationChecker = new HashSet<>(number);
        if (duplicationChecker.size() != number.size()) {
            throw new IllegalArgumentException(USER_NUMBER_RE_REQUEST_MESSAGE);
        }
    }

    private void validateNumberLength(List<Integer> number) {
        if (number.size() != 3) {
            throw new IllegalArgumentException(USER_NUMBER_RE_REQUEST_MESSAGE);
        }
    }

    public int countStrike(List<Integer> computerNumber) {
        int strike = 0;

        for (int i = 0; i < number.size(); i++) {
            if (Objects.equals(number.get(i), computerNumber.get(i))) {
                strike++;
            }
        }

        return strike;
    }

    public int countBall(List<Integer> computerNumber) {
        int ball = 0;

        for (int i = 0; i < number.size(); i++) {
            if (computerNumber.contains(number.get(i)) && !Objects.equals(number.get(i), computerNumber.get(i))) {
                ball++;
            }
        }

        return ball;
    }
}