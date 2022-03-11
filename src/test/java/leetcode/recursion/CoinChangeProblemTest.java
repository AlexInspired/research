package leetcode.recursion;

import com.practice.leetcode.recursion.CoinChangeProblem;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CoinChangeProblemTest {
    //    List<Integer> coins = Arrays.asList(1, 2, 5, 10, 12, 20, 50);

    @Test
    public void testCoinChangeProblem() {
        List<Integer> coins = Arrays.asList(1, 5, 6, 9);
        int sum = 11;

        CoinChangeProblem coinChangeProblem = new CoinChangeProblem();

        assertEquals(2, coinChangeProblem.minCoins(coins, coins.size(), sum));

    }
}
