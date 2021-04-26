/*
24. 两两交换链表中的节点
给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。



示例 1：


输入：head = [1,2,3,4]
输出：[2,1,4,3]
示例 2：

输入：head = []
输出：[]
示例 3：

输入：head = [1]
输出：[1]


提示：

链表中节点的数目在范围 [0, 100] 内
0 <= Node.val <= 100
 */
package leetcode.linkedlist;

/**
 * description: xxx
 * date: 2020/10/17 17:27
 * auditor: wangliugang
 */
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        ListNode x, y;
        x = y = new ListNode();
        ListNode z = head;

        while (head != null && head.next != null) {
            x.next = head.next;
            x = x.next;
            head.next = head.next.next;
            head = head.next;
        }
        ListNode o = y.next;
        ListNode p, q;
        p = q = new ListNode();
        // 1 - 2 - 3
        // z = 1 - 3
        // o = 2
        // p = 0
        // 0 - 2 - 1
        while (o != null) {
            p.next = o;
            o = o.next;
            p = p.next;
            p.next = z;
            p = p.next;
            z = z.next;
        }
        return q.next;
    }
}
