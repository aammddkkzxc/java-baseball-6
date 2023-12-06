package baseball;

import static baseball.UserNumber.USER_NUMBER_RE_REQUEST_MESSAGE;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static List<Integer> convertUserNumber(String userNumber) {
        List<Character> separatedUserNumber = separateUserNumber(userNumber);
        List<Integer> convertedUserNumber = new ArrayList<>();

        try {
            for (char number : separatedUserNumber) {
                convertedUserNumber.add(Integer.parseInt(String.valueOf(number)));
            }
            return convertedUserNumber;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(USER_NUMBER_RE_REQUEST_MESSAGE);
        }
    }

    private static List<Character> separateUserNumber(String userNumber) {
        List<Character> separatedUserNumber = new ArrayList<>();
        for (int i = 0; i < userNumber.length(); i++) {
            separatedUserNumber.add(userNumber.charAt(i));
        }

        return separatedUserNumber;
    }
}
