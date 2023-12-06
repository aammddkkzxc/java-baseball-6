package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserNumber {
    public static final String USER_NUMBER_RE_REQUEST_MESSAGE = "사용자 번호를 다시 입력해 주십시오.";

    private final List<Integer> number;

    public UserNumber(List<Integer> number) {
        validateDuplication(number);

        this.number = number;
    }

    private void validateDuplication(List<Integer> number) {
        Set<Integer> duplicationChecker = new HashSet<>(number);
        if(duplicationChecker.size() != number.size()) {
            throw new IllegalArgumentException(USER_NUMBER_RE_REQUEST_MESSAGE);
        }
    }

    private void validateNumberLength() {

    }
}
