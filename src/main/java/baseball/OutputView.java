package baseball;

public class OutputView {
    private static final String STRIKE_MESSAGE = "스트라이크";
    private static final String BALL_MESSAGE = "볼";
    private static final String BLANK = " ";

    public static String printHintMessage(int ball, int strike) {
        StringBuilder stringBuilder = new StringBuilder();
        if (ball != 0) {
            stringBuilder.append(ball).append(BALL_MESSAGE);
        }
        if (ball != 0 && strike != 0) {
            stringBuilder.append(BLANK);
        }
        if (strike != 0) {
            stringBuilder.append(strike).append(STRIKE_MESSAGE);
        }

        return stringBuilder.toString();
    }

    public static String printSuccessMessage() {
        return null;
    }
}
