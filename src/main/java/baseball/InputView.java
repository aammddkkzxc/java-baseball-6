package baseball;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public static final String USER_NUMBER_REQUEST_MESSAGE = "숫자를 입력해주세요 : ";

    public static int inputUserNumber() {
        return 0;
    }

    private static int readUserNumber() {
        System.out.println(USER_NUMBER_REQUEST_MESSAGE);
        String userNumber = Console.readLine();

        return Converter.convertUserNumber(userNumber);
    }

    public static int inputStatusNumber() {
        return 0;
    }
}
