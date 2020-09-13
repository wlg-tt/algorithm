package book.chapter13;

/**
 * description: 定容栈
 * date: 2020/9/12 12:13
 * auditor: wangliugang
 */
public class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;

    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public int sized() {
        return a.length;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }
}
