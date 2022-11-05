package baseball.controller;

import baseball.model.Score;
import baseball.service.BaseballService;
import baseball.util.BaseballNumber;
import baseball.view.BaseballView;
import camp.nextstep.edu.missionutils.Console;

public class BaseballController {
    private final BaseballView baseballView;
    private final BaseballService baseballService;
    private static final String THREE_STRIKE = "3스트라이크";

    public BaseballController(BaseballView baseballView, BaseballService baseballService) {
        this.baseballView = baseballView;
        this.baseballService = baseballService;
    }

    public void run() {
        baseballView.showStart();
        do {
            gameProcess(BaseballNumber.generateNumber());
            baseballView.showContinueOrStop();
        } while (baseballService.restartCheck(Console.readLine()));
    }

    private void gameProcess(String baseballNumber) {
        String strike = "";
        while (!strike.equals(THREE_STRIKE)) {
            baseballView.showInput();
            Score score = baseballService.compareNumber(baseballNumber, Console.readLine());
            strike = baseballView.showScore(score);
        }
    }

}
