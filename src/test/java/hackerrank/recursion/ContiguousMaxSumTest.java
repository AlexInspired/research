package hackerrank.recursion;

import com.practice.hackerrank.recursion.ContiguousMaxSum;
import com.practice.hackerrank.recursion.ScoreWays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContiguousMaxSumTest {

    @Test
    public void testCMS() {
        ContiguousMaxSum contiguousMaxSumTest = new ContiguousMaxSum();
//        int[] arr = {-1, 0, -2};
//        2, 3, 4, -1
        int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6 , contiguousMaxSumTest.maxSubArray3(a));

    }

}
