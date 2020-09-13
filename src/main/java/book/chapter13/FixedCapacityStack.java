package book.chapter13;

/**
 * description: xxx
 * date: 2020/9/12 12:13
 * auditor: wangliugang
 */
public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;

    public FixedCapacityStack(int cap) {
//        a = new Item[cap];
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    public Item pop() {
        Item item = a[--N];
        a[N] = null;// 对象游离 不会再被访问到的对象任存在于数组，不会被垃圾回收
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return item;
    }

    public void resize(int max) {
        Item[] tmp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            tmp[i] = a[i];
        }
        a = tmp;
    }
}
