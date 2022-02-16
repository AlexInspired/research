package hackerrank.recursion;

import com.practice.hackerrank.recursion.KnapSackProblem;
import org.junit.Test;

public class KnapSackProblemTest {
    @Test
    public void testKnapSackProblem() {
        int[] weight = {6, 4, 3, 2};
        int[] value = {5, 3, 1, 3};
        int c = 10;

        KnapSackProblem knapSackProblem = new KnapSackProblem();

//        assertEquals(10, knapSackProblem.knapSack(weight, value, c, 4));
        int result = knapSackProblem.knapSack(weight, value, c, 4);
        System.out.println("Done : " + result);

    }
}
