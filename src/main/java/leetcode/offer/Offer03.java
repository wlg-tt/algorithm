package leetcode.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 找出数组中重复的数字。
 * <p>
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * <p>
 * 限制：
 * <p>
 * 2 <= n <= 100000
 */
public class Offer03 {
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int num = findRepeatNumber(nums);
        System.out.println(num);
    }
}
