package baseball;

import baseball.domain.BaseballGameApplication;

public class Application {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        BaseballGameApplication baseBallGameUserInterface = new BaseballGameApplication(appConfig.baseballViewer());
        baseBallGameUserInterface.run();
    }
}
