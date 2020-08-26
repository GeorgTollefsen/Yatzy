import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void isOne() {
        assertEquals(1, Game.makeNumber(new int[] {1,2,3,4,5}));
    }

    @Test
    public void countTwos() {
        assertEquals(3, Game.checkForTwos(new int[] {2,2,1,2,4}));
    }

    @Test
    public void countThrees() {
        assertEquals(2, Game.countThrees(new int[] {1, 4, 3, 2, 3}));
    }
    @Test
    public void countFours() {
        assertEquals(5, Game.countThrees(new int[] {4, 4, 4, 4, 4}));
    }


}
