package leetcode.recursion;

import com.practice.leetcode.recursion.PermutationInString;
import com.practice.leetcode.string.PermutationInStringHashMap;
import com.practice.leetcode.string.PermutationInStringSorting;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PermutationInStringTest {
    PermutationInString permutationInString;
    PermutationInStringSorting permutationInStringSorting;
    PermutationInStringHashMap permutationInStringHashMap;
    @Before
    public void init(){
        permutationInString = new PermutationInString();
        permutationInStringSorting = new PermutationInStringSorting();
        permutationInStringHashMap = new PermutationInStringHashMap();
    }

    @Test
    public void testFalsePermutationInStringHashMap() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        assertFalse("false", permutationInStringHashMap.checkInclusion(s1,s2));
    }

    //@Test
    public void testFalsePermutationInStringSorting() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        assertFalse("false", permutationInStringSorting.checkInclusion(s1,s2));
    }

//    @Test
//    public void testStringPermutationSorting() {
//        String s1 = "ab";
//        String s2 = "eidboaoo";
//        assertTrue("true", permutationInStringSorting.checkInclusion(s1,s2));
//
//    }

    //@Test
    public void testStringPermutation() {
        String s1 = "adc";
        String s2 = "dcda";
        permutationInString.checkInclusion(s1,s2);
        assertTrue("true", permutationInString.checkInclusion(s1,s2));
    }

   // @Test
    public void testStringPermutation2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        permutationInString.checkInclusion(s1,s2);
        assertFalse("false", permutationInString.checkInclusion(s1,s2));
    }

}
