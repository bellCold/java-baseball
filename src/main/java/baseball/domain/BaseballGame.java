package baseball.domain;

import baseball.AppConfig;
import baseball.utils.BaseballGameScoreCounter;

public class BaseballGame {

    private String computerAnswer;

    public BaseballGame() {
        this.computerAnswer = new AppConfig().generator().generateNumber();
    }

    public Score compareNumber(String userAnswer) {
        return BaseballGameScoreCounter.checkScore(this.computerAnswer, userAnswer);
    }
}
