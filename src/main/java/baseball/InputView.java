package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {
    public static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public static final String USER_NUMBER_REQUEST_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String GAME_STATUS_NUMBER_REQUEST_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public static UserNumber inputUserNumber() {
        try {
            return new UserNumber(readUserNumber());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputUserNumber();
        }
    }

    private static List<Integer> readUserNumber() {
        System.out.print(USER_NUMBER_REQUEST_MESSAGE);
        String userNumber = Console.readLine();

        return Converter.convertUserNumber(userNumber);
    }

    public static GameStatus inputGameStatusNumber() {
        try {
            return new GameStatus(readGameStatusNumber());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputGameStatusNumber();
        }
    }

    private static int readGameStatusNumber() {
        System.out.println(GAME_STATUS_NUMBER_REQUEST_MESSAGE);
        String gameStatusNumber = Console.readLine();

        return Converter.convertGameStatusNumber(gameStatusNumber);
    }
}
