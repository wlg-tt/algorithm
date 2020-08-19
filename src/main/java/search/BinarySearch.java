package search;

/**
 * description: 二分查找
 * date: 2020/6/26 17:51
 * auditor: wangliugang
 */
class BinarySearch {
    public static int search(int[] list, int key, int n) {
        int low, high, mid;
        low = 1;
        high = n;
        while (low <= high) {
            mid = (low + high) / 2;
            // 插值查找
//            mid = low + ((key - list[low]) / (list[high] - list[low])) / (high - low);
            System.out.println(mid);
            if (key == list[mid]) {
                return mid;
            } else if (key > list[mid]) {
                low = mid + 1;
            } else if (key < list[mid]) {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] list = new int[]{0, 1, 16, 24, 35, 47, 59, 62, 73, 88, 99};
        int key = 87;
        int n = 10;
        int position = BinarySearch.search(list, key, n);
        System.out.println(position);
    }
}