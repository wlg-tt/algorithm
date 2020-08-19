package search;

import java.util.Arrays;

/**
 * description: 斐波那契查找
 * date: 2020/6/27 14:52
 * auditor: wangliugang
 */
public class FibonacciSearch {
    public static int Search(int[] list, int[] F, int n, int key) {
        int low, high, mid, i, k;
        low = 1;
        high = n;
        k = 0;
        while (n > F[k] - 1) {
            k++;
        }
        for (i = n; i < F[k] - 1; i++) {
            list[i] = list[n];
        }
        System.out.println(Arrays.toString(list));
        while (low <= high) {
            mid = low + F[k - 1] - 1;
            if (key < list[mid]) {
                high = mid - 1;
                k = k - 1;
            } else if (key > list[mid]) {
                low = mid + 1;
                k = k - 2;
            } else {
                if (mid <= n) {
                    return mid;
                } else {
                    return n;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] list = new int[]{0, 1, 16, 24, 35, 47, 59, 62, 73, 88, 99, 0};
        int n = 10;
        int key = 59;
        int[] F = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int position = FibonacciSearch.Search(list, F, n, key);
        System.out.println(position);
    }
}
