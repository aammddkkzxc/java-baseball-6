package baseball;

import java.util.List;

public class GameProcess {
    public static void playGame() {
        InputView.printStartMessage();
        do{
            playRound();
            GameStatus gameStatus = new GameStatus();
        }while (){
        }
    }

    private static void playRound() {
        while(true) {
            List<Integer> computerNumber = ComputerNumber.makeComputerNumber();
            UserNumber userNumber = InputView.inputUserNumber();
            int strike = userNumber.countStrike(computerNumber);
            int ball = userNumber.countBall(computerNumber);

            if (strike == 3) {
                break;
            }
        }
    }
}
