package DataStruct.TreeEx;


public  class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(){
    }
    public TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}