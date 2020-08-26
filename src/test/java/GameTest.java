import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void isOne() {
        assertEquals(1, Game.makeNumber(new int[] {1,2,3,4,5}));
    }

    @Test
    public void countTwos() {
        assertEquals(4, Game.makeNumber(new int[] {2,2,1,2,4}));
    }
}
