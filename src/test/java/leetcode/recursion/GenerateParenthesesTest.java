package leetcode.recursion;

import com.practice.leetcode.recursion.GenerateParentheses;
import com.practice.leetcode.warmup.Solution;
import org.junit.Test;

import java.util.List;

public class GenerateParenthesesTest {

    @Test
    public void test() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(4);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
