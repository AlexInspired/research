package com.practice.leetcode.binarysearch;

public class FindMinimumInRotatedSortedArray {

    // 3,4,5,1,2
    // 4,5,1,2,3
    // 5,1,2,3,4
    // 3,4,5,1,2

    // Не важно работать с головой или с хвостом.  Если приглядеться, мы идем влево в обоих случаях -
    // если середина меньше хвоста или головы.
    // И наоборот, вправо, если середина больше хвоста или головы.
    // Разница лишь в этом случае, когда if (nums[r] >= nums[l]) return nums[l]- мы проскочили минимум,
    // и нам надо идти вправо, потому что середина больше хвоста.
    // Но в этом случае при работе с хвостом - этот кейс не надо обрабатывать, тк он будет сравниваться с хвостом,
    // который больше(тк минимум уже слева) - и мы пойдем влево к минимуму.
    public int findMin(int[] nums) {

        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = (r + l) / 2;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l];
    }

    public int findMin3(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[r] >= nums[l]) return nums[l];
            if (nums[mid] >= nums[l]) l = mid + 1;
            else r = mid;
        }
        return nums[l];
    }
    public int findMin4(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l+r)/2;
            // если все отсортировано, то возвращем левый элемент
            // равенство необходимо, чтобы избежать бесконечного цикла для [2,1], когда l = r = 0
            if (nums[l] <= nums[r]) {
                return nums[l];
            }
            // идем вправо
            // равенство необходимо, чтобы пойти вправо для [2,1], когда l = mid = 0
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                // идем влево
                r = mid;
            }
        }
        return nums[l];
    }
}
