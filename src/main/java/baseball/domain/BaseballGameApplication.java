package baseball.domain;

import baseball.ui.BaseballViewer;
import baseball.utils.UserInputUtil;

public class BaseballGameApplication {

    private final BaseballViewer baseballViewer;

    public BaseballGameApplication(BaseballViewer baseballViewer) {
        this.baseballViewer = baseballViewer;
    }

    public void run() {
        baseballViewer.showStartText();
        do {
            gameProcess(new BaseballGame());
        } while (BaseballGameStarter.checkRestart(UserInputUtil.readRestartAnswer()));
    }

    private void gameProcess(BaseballGame baseballGame) {
        while (true) {
            baseballViewer.showInputText();
            Score score = baseballGame.compareNumber(UserInputUtil.readUserAnswer());
            baseballViewer.showScore(score);
            if (score.isThreeStrike()) {
                baseballViewer.showWinText();
                baseballViewer.showRestartGameText();
                break;
            }
        }
    }
}
