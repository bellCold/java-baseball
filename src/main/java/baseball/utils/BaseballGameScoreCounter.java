package baseball.util;

import baseball.model.Score;

import java.util.stream.IntStream;

public class BaseBallGameScoreCounter {

    public static Score checkScore(String baseballNumber, String userNumber) {
        int strikeCount = (int) IntStream.range(0, baseballNumber.length())
                .filter(index -> baseballNumber.toCharArray()[index] == userNumber.toCharArray()[index])
                .count();

        int ballCount = (int) userNumber.chars()
                .flatMap(userBall -> baseballNumber.chars().filter(baseBall -> baseBall == userBall))
                .count() - strikeCount;

        return new Score(ballCount, strikeCount);
    }

}