package tree;

/**
 * description: 二叉树排序树节点定义
 * date: 2020/6/27 17:15
 * auditor: wangliugang
 */
public class BinaryTreeNode  {
    public int data; // 数据域
    public BinaryTreeNode left, right; // 指向左右子节点的指针
    public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
