package baseball;

public class GameStatus {
    public static final String STATUS_NUMBER_RE_REQUEST_MESSAGE = "상태 번호를 다시 입력해 주십시오.";
    public static final int PROGRESS_STATE = 1;
    public static final int END_STATE = 2;

    private final int statusNumber;

    public GameStatus(int statusNumber) {
        validateNumber(statusNumber);
        this.statusNumber = statusNumber;
    }

    private void validateNumber(int statusNumber) {
        if ((statusNumber != PROGRESS_STATE) && (statusNumber != END_STATE)) {
            throw new IllegalArgumentException(STATUS_NUMBER_RE_REQUEST_MESSAGE);
        }
    }

    public boolean isEndState() {
        return statusNumber == 2;
    }
}
