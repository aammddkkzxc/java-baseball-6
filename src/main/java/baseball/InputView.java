package baseball;

import static baseball.UserNumber.USER_NUMBER_RE_REQUEST_MESSAGE;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {
    public static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public static final String USER_NUMBER_REQUEST_MESSAGE = "숫자를 입력해주세요 : ";

    public static void printStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public static UserNumber inputUserNumber() {
        try {
            UserNumber userNumber = new UserNumber(readUserNumber());
        } catch (IllegalArgumentException e) {
            System.out.println(USER_NUMBER_RE_REQUEST_MESSAGE);
        }

        return inputUserNumber();
    }

    private static List<Integer> readUserNumber() {
        System.out.print(USER_NUMBER_REQUEST_MESSAGE);
        String userNumber = Console.readLine();

        return Converter.convertUserNumber(userNumber);
    }

    public static int inputStatusNumber() {
        return 0;
    }
}
