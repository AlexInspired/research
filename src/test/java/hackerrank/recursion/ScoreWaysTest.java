package hackerrank.recursion;

import com.practice.hackerrank.recursion.ScoreWays;
import com.practice.hackerrank.recursion.TilesPlot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreWaysTest {

    @Test
    public void testTilesPlot() {
        ScoreWays scoreWays = new ScoreWays();

        assertEquals(5 , scoreWays.countWays(13));

    }

}
