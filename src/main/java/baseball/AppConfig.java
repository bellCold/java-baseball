package baseball;

import baseball.ui.BaseballViewer;
import baseball.ui.BaseballViewerImpl;

public class AppConfig {

    public BaseballViewer baseballViewer() {
        return new BaseballViewerImpl();
    }
}
