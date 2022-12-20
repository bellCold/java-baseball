package baseball;

import baseball.ui.BaseballViewer;
import baseball.ui.BaseballViewerImpl;
import baseball.utils.BaseballNumberGenerator;
import baseball.utils.Generator;

public class AppConfig {

    public BaseballViewer baseballViewer() {
        return new BaseballViewerImpl();
    }

    public Generator generator() {
        return new BaseballNumberGenerator();
    }

}
