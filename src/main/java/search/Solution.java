package search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> list = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (list.containsKey(target - nums[i])) {
                return new int[]{list.get(target - nums[i]), i};
            }
            list.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,3,7,19};
        System.out.println(Arrays.toString(twoSum(a, 10)));
    }
}