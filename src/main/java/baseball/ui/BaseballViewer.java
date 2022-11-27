package baseball.ui;

import baseball.domain.Score;

public interface BaseballViewer {
    void showStartText();

    void showInputText();

    void showWinText();

    void showRestartGameText();

    void showScore(Score score);

}
