package hackerrank.recursion;

import com.practice.hackerrank.recursion.ContiguousMaxSum;
import com.practice.hackerrank.recursion.ScoreWays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContiguousMaxSumTest {

    @Test
    public void testCMS() {
        ContiguousMaxSum contiguousMaxSumTest = new ContiguousMaxSum();
        int[] arr = {-1, 0, -2};
        assertEquals(0 , contiguousMaxSumTest.maxSubArray(arr));

    }

}
