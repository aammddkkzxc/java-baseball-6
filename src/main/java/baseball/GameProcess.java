package baseball;

import java.util.List;

public class GameProcess {
    public static void playGame() {
        InputView.printStartMessage();

        while (true) {
            List<Integer> computerNumber = ComputerNumber.makeComputerNumber();
            playRound(computerNumber);
            GameStatus gameStatus = InputView.inputGameStatusNumber();

            if (gameStatus.isEndState()) {
                break;
            }
        }
    }

    private static void playRound(List<Integer> computerNumber) {
        while(true) {
            UserNumber userNumber = InputView.inputUserNumber();
            int strike = userNumber.countStrike(computerNumber);
            int ball = userNumber.countBall(computerNumber);
            OutputView.printHintMessage(ball,strike);

            GameStatus gameStatus = new GameStatus();
            gameStatus.decideGamsStatus(strike);

            if (gameStatus.isSuccessState()) {
                OutputView.printSuccessMessage();
                break;
            }
        }
    }
}
