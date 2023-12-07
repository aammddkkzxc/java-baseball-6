package baseball;

public class GameStatus {
    private final int statusNumber;

    public GameStatus(int statusNumber) {
        this.statusNumber = statusNumber;
    }

    private void validateNumber() {

    }

    public boolean isEndState() {
        return statusNumber == 2;
    }
}
