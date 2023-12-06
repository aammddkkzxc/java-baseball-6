package baseball;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    private static final String USER_NUMBER_RE_REQUEST_MESSAGE = "사용자 번호를 다시 입력해 주십시오.";

    public static List<Integer> convertUserNumber(List<Character> separatedUserNumber) {
        List<Integer> convertedUserNumber = new ArrayList<>();
        try {
            for(char number : separatedUserNumber) {
                convertedUserNumber.add(Integer.parseInt(String.valueOf(number)));
            }
            return convertedUserNumber;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(USER_NUMBER_RE_REQUEST_MESSAGE);
        }
    }

    public static List<Character> separateUserNumber(String userNumber) {
        List<Character> separatedUserNumber = new ArrayList<>();
        for(int i = 0; i<userNumber.length(); i++) {
            separatedUserNumber.add(userNumber.charAt(i));
        }

        return separatedUserNumber;
    }
}
