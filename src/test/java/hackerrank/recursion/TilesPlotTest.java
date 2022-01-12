package hackerrank.recursion;

import com.practice.hackerrank.recursion.TilesPlot;
import com.practice.hackerrank.warmup.AddTwoLongNumbers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TilesPlotTest {

    @Test
    public void testTilesPlot() {
        TilesPlot tilesPlot = new TilesPlot();

        assertEquals(89 , tilesPlot.countWays(10));

    }

}
