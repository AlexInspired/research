package leetcode.warmup;

import com.practice.leetcode.warmup.GZSolution;
import org.junit.Assert;
import org.junit.Test;

public class GZSolutionTest {
    @Test
    public void test() {

        GZSolution gzSolution = new GZSolution();

        Assert.assertEquals(2 ,gzSolution.indexOfFirstUnique("abcfabe"));
    }
}
