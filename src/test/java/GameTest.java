import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void isOne() {
        assertEquals(1, Game.makeNumber(1));
    }

}
