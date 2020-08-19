package tree;

/**
 * description: 二叉查找树实现类
 * date: 2020/6/27 17:23
 * auditor: wangliugang
 */
public class BinaryTreeBuilder {

    public BinaryTreeNode root;
    public BinaryTreeNode parent = null;

    public void insertBinaryTree(int[] datas) {

        if(datas.length < 1) {
            System.out.println("the datas Array length small zero!");
            return;
        }
        this.root = new BinaryTreeNode(datas[0], null, null);

        for (int i = 1; i < datas.length; i++) {
            this.insert(this.root, datas[i]);
        }
    }

    private void insert(BinaryTreeNode root, int data) {
        if(data > root.data) {
            if(root.right == null)
                root.right = new BinaryTreeNode(data, null, null);
            else
                this.insert(root.right, data);
        }
        else {
            if(root.left == null)
                root.left = new BinaryTreeNode(data, null, null);
            else
                this.insert(root.left, data);
        }
    }

    public void inOrder(BinaryTreeNode root) {
        if(root != null) {
            this.inOrder(root.left);
            System.out.print(root.data + "-");
            this.inOrder(root.right);
        }
    }


    public boolean SearchBST(BinaryTreeNode root, int key) {
        if(root == null) {
            return false;
        }
        else if(key == root.data) {
            return true;
        }
        else if(key < root.data) {
            return this.SearchBST(root.left, key);
        }
        else {
            return this.SearchBST(root.right, key);
        }
    }

    public boolean SearchBST2(BinaryTreeNode root, BinaryTreeNode parent, int key) {
        if(root == null) {
            this.parent = parent;
            return false;
        }
        else if(key == root.data) {
            this.parent = root;
            return true;
        }
        else if(key < root.data) {
            return this.SearchBST2(root.left, root, key);
        }
        else {
            return this.SearchBST2(root.right, root, key);
        }
    }



    public boolean InsertBST(BinaryTreeNode root, int key) {
        if(!this.SearchBST(root, key)) {
            this.insert(root, key);
            return true;
        }
        else {
            System.out.println("the key existence in BinaryTree");
            return false;
        }
    }


    public boolean InsertBST2(BinaryTreeNode root, int key) {
        if(!this.SearchBST2(root, this.parent, key)) {
            BinaryTreeNode keyNode = new BinaryTreeNode(key, null, null);
            if(this.parent == null) {
                root = keyNode;
            }
            else if(key < this.parent.data) {
                this.parent.left = keyNode;
            }
            else this.parent.left = keyNode;
            return true;
        }
        else {
            System.out.println("the key existence in BinaryTree");
            return false;
        }
    }

    public boolean DeleteBST(BinaryTreeNode root, int key) {

        if(root == null) {
            System.out.println("the root node is null");
            return false;
        }
        else {
            if(key == root.data) {
                return this.delete(root);
            }
            else if(key < root.data) {
                return this.DeleteBST(root.left, key);
            }
            else {
                return this.DeleteBST(root.right, key);
            }
        }
    }

    public boolean delete(BinaryTreeNode root) {
        BinaryTreeNode q, s;
        if(root.right == null) {
            root = root.left;
        }
        else if(root.left == null) {
            root = root.right;
        }
        else {
            q = root;
            s = root.left;
            while(s.right != null) {
                q = s;
                s = s.right;
            }
            root.data = s.data;
            if(q != root) {
                q.right = s.left;
            }
            else {
                q.left = s.left;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] datas = {62, 88, 58, 47, 35, 73, 51, 99, 37, 93};

        BinaryTreeBuilder b = new BinaryTreeBuilder();
        b.insertBinaryTree(datas);

        b.inOrder(b.root);
        b.InsertBST(b.root, 1);
        System.out.println();
        b.inOrder(b.root);
    }
}
