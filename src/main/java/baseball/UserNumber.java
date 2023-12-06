package baseball;

import java.util.List;

public class UserNumber {
    public static final String USER_NUMBER_RE_REQUEST_MESSAGE = "사용자 번호를 다시 입력해 주십시오.";

    private final List<Integer> number;

    public UserNumber(List<Integer> number) {
        this.number = number;
    }

    private void validateDuplication() {
    }

    private void validateNumberLength() {

    }
}
