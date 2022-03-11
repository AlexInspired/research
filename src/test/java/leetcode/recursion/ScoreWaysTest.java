package leetcode.recursion;

import com.practice.leetcode.recursion.ScoreWays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreWaysTest {

    @Test
    public void testTilesPlot() {
        ScoreWays scoreWays = new ScoreWays();

        assertEquals(5 , scoreWays.countWays(13));

    }

}
