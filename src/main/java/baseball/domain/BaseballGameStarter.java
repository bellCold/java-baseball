package baseball.domain;

public enum BaseballGameStarter {
    RESTART("1"),
    STOP("0");

    private final String starter;

    BaseballGameStarter(String starter) {
        this.starter = starter;
    }

    private String getStarter() {
        return starter;
    }

    public static boolean checkRestart(String readRestartAnswer) {
        return BaseballGameStarter.RESTART.getStarter().equals(readRestartAnswer);
    }
}
