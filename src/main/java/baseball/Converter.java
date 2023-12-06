package baseball;

public class Converter {
    private static final String USER_NUMBER_RE_REQUEST_MESSAGE = "사용자 번호를 다시 입력해 주십시오.";

    public static int convertUserNumber(String inputUserNumber) {
        try {
            return Integer.parseInt(inputUserNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(USER_NUMBER_RE_REQUEST_MESSAGE);
        }
    }
}
