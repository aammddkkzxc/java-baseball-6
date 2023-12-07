package baseball;

public class OutputView {
    private static final String STRIKE_MESSAGE = "스트라이크";
    private static final String BALL_MESSAGE = "볼";
    private static final String NOTING_MESSAGE = "낫싱";
    private static final String BLANK = " ";
    private static final String SUCCESS_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public static void printHintMessage(int ball, int strike) {
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
        if (ball == 0 && strike == 0) {
            stringBuilder.append(NOTING_MESSAGE);
        }
        System.out.println(stringBuilder);
    }

    public static void printSuccessMessage() {
        System.out.println(SUCCESS_MESSAGE);
    }
}
