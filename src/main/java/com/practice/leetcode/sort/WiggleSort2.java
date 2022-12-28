package com.practice.leetcode.sort;

import com.practice.leetcode.array.KthLargestElementInAnArray;
// EXPLANATION
// https://leetcode.com/problems/wiggle-sort-ii/solutions/234290/c-76-ms-100-solution-using-quick-select-and-virtual-index-w-explanation/
public class WiggleSort2 {
    int size,mid;

    public void wiggleSort(int[] nums){
        size = nums.length;
        mid = (size-1)/2;
        if(size < 2) return;
        int m = 0, i = 0, j = size-1;
        KthLargestElementInAnArray kthLargestElementInAnArray = new KthLargestElementInAnArray();
        int median = kthLargestElementInAnArray.findKthLargest(nums, (nums.length + 1) / 2);

        while(m <= j){
            int m_ = virtualIndex(m), i_ = virtualIndex(i), j_ = virtualIndex(j);
            if(nums[m_] < median) {
                swap(nums, i_ ,m_);
                ++i; ++m; // Algorithm runs in virtual index, so we work with the virtual index iterators.
            }
            else if(nums[m_] > median) {
                swap(nums, m_, j_);
                --j; // Algorithm runs in virtual index, so we work with the virtual index iterators.
            }
            else ++m; // Algorithm runs in virtual index, so we work with the virtual index iterators.
        }

    }

    int virtualIndex(int i) {
        if(i <= mid) return (mid-i)*2;
        return 1 + 2*(size - i - 1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
//    Part 3: Virtual Indexing
//
//    Once we have the median, we know how to split the vector into the two sets. However, we must do it in place. Furthermore, we also need to get the medians together.
//    To do that, we can apply the 3-way partition algorithm from earlier. This turns the vector into three coherent parts: nums = [elements less than median, medians,
//    elements greater than median]. We know we have at least 1 median, so we know that the even set will be [0, first median]. The odd set will thus be (first median,
//    last index].
//
//            This however, does not put the elements in the right places. To do this in place, we can use virtual indexing.
//
//            Virtual indexing is basically adding an extra level of indirection to the indices. We will see how this will be useful for solving this problem.
//
//            Say we have the vector [4, 5, 5, 6]. By following our solution, we know that we should end up with [5, 6, 4, 5]. However, after doing the 3-way partition,
//            we are still at [4, 5, 5, 6]. If we map the indices, we can see the following:
//
//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      Original Mapping: (0, 1, 2, 3) --> [4, 5, 5, 6]
//
//    Solution Mapping: (1, 3, 0, 2) --> [5, 6, 4, 5]
//
//    This means if we have the virtual mapping: (0 -> 1, 1->3, 2 ->0, 3 ->2), we will end up with the solution simply by 3-way partition on the virtual indices:
//
//    Initially we have (virtual) (0, 1, 2, 3) --> (actual) (1, 3, 0, 2) --> (5, 6, 4, 5).
//
//    After 3 way partition, we have: (virtual) (0, 1, 2, 3) --> (actual) (1, 3, 0, 2) --> (4, 5, 5, 6).
//
//    What this means is that we have completed 3-way partition with respect to the virtual index. But, what about the actual vector now?
//
//    If we sub back the numbers from virtual to actual, we get: 4 at index 2, 5 at 0, 5 at 3, and 6 at 1.
//
//    This is the solution vector [5, 6, 4, 5].
//
//    This works because we are simply modifying how the partition algorithm sees the numbers from the matrix. The 0 index number it sees is actually the number at index 2,
//    and so on. But the algorithm is doing the same thing. We are simply manipulating each number from the algorithm to fall into the right places, given that it is in the
//    right place in virtual indices. Since the manipulation is in place, the space complexity is O(1).
//
//    Now that we know this method will work, we need to find the mapping. In order to keep the medians on the opposite sides, we can simply insert the odd and even set in
//    reverse order. This way, even indices start with the median, and odd end with possibly repeated medians. For a vector with say 9 elements, we would have the following:
//
//            (0, 1, 2, 3, 4, 5, 6, 7, 8) --> (4, 8, 3, 7, 2, 6, 1, 5, 0).
//
//    This means the odd set (5, 6, 7, 8) maps to (7, 5, 3, 1), and the even set (0, 1, 2, 3, 4) maps to (8, 6, 4, 2, 0). I think you can see the pattern now.
//
//    This is pattern is described by the following in the code:
//
//            if(i <= mid) return (mid - i)*2; // Even set
//return 1 + 2*(size - i - 1); // Odd set
//    With this mapping, we simply need to plug it into the partition algorithm whenever it references the actual vector, and we are done. It is important to remember to work
//    with virtual index iterators in the partition algorithm, since it is solving the problem with respect to the virtual indices.
//
//    The algorithm runs in average O(n) time, and uses O(1) space.
}
