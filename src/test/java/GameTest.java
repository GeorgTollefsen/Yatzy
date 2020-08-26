import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    void isOne() {
        assertEquals(1,1);
    }

    @Test
    void canScoreMax() {
        assertEquals(30, new Yatzy.score(new int[] {6, 6, 6, 6, 6}));
    }
}
