import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BowlingGameTest {

    private int rollAGameAndScore(List<Integer> rolls) {
        BowlingGame bowlingGame = new BowlingGame();
        rolls.forEach(bowlingGame::roll);
        return bowlingGame.score();
    }

    @Test
    public void simpleTest() {

        List<Integer> rolls = List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        assertThat(rollAGameAndScore(rolls), is(0));
    }

    @Test
    public void simpleTestSecond() {
        List<Integer> rolls = List.of(3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6);

        assertThat(rollAGameAndScore(rolls), is(90));
    }
}
