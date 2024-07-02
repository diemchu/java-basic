package DataStruct.TreeEx;

import com.sun.source.tree.Tree;

public class BinarySearchTree
{
    // 이진 트리 탐색
    public static void main(String[] args) {
//        TreeNode n1 =   new TreeNode(3,null,null);
//        TreeNode n2 =   new TreeNode(12,null,null);
//        TreeNode n3 =   new TreeNode(27,null,null);
//        TreeNode n4 =   new TreeNode(31,n3,null);
//        TreeNode n5 =   new TreeNode(7,n1,n2);
//        TreeNode n6 =   new TreeNode(26,null,n4);
//        TreeNode root = new TreeNode(18,n5,n6);
//        System.out.println(search(root,12));
//        System.out.println(loop_search(root,27));
//        root = insert(root,9);
//        printTree(root);
//
//        System.out.println();
//        root =delete(root,26);
//        printTree(root);

        TreeNode  root = new TreeNode(20,null,null);
        insert(root,10);
        insert(root,11);
        insert(root,14);
        insert(root,30);
        insert(root,40);
        insert(root,19);
        insert(root,42);
        insert(root,2);
        insert(root,3);
        printTree(root);
        root = delete(root,310);
        System.out.println();
        printTree(root);
        System.out.println();
        System.out.println("max = "+find_max(root));
        System.out.println("min = "+find_min(root));


    }

    //순환적으로 탐색 함수
    public  static  TreeNode search(TreeNode root , int key){
        if(root == null) return  null;
        if(key  == root.data ) return  root;
        else  if(key < root.data) return  search(root.left, key);
        else return  search(root.right , key);
    }

    // 반복적인 탐색연산
    public static  TreeNode loop_search(TreeNode root , int key){
        if(root == null) return  null;
        while (root != null){
            if(root.data == key) return  root;
            else if(key < root.data )   root = root.left;
            else root = root.right;
        }
        return null;
    }
    // 이진탐색트리에서 삽입연산
    public static TreeNode insert(TreeNode root, int data){
       // 트리가 공백이면 새로운 노드를 반환한다
        if(root == null) return new TreeNode(data,null,null);
        // 그렇지 많으면
        if( data <  root.data ){
            root.left = insert(root.left ,data );
        }else if(data > root.data) {
            root.right = insert(root.right , data);
        }
        return  root;
    }


    //=================================================================
    //삭제하려는 경우 3가지 있다
    // 삭제하는 노드가 단말 노드
    //삭제하는 노드 하나의 왼쪽이나 오른쪽 서브 트리중 하나만 가지고 있는 경우
    //삭제하는 노드 하나의 왼쪽과 오른쪽 서브트리 다 있다.

    // Hàm xóa một nút trong cây BST
    public static TreeNode delete(TreeNode root, int key) {
        if (root == null) return root;
        // Nếu key nhỏ hơn giá trị của nút gốc, tìm và xóa trong cây con bên trái
        if (key < root.data)
            root.left = delete(root.left, key);
            // Nếu key lớn hơn giá trị của nút gốc, tìm và xóa trong cây con bên phải
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // Tìm thấy nút cần xóa
            // Trường hợp 1: Nút không có con trái
            if (root.left == null) {
                TreeNode tmp = root.right;
                root.right = null;
                return tmp;
            }
            // Trường hợp 2: Nút không có con phải
            else if (root.right == null) {
                TreeNode tmp = root.left;
                root.left = null;
                return tmp;
            }

            // Trường hợp 3: Nút có hai con
            // Tìm nút nhỏ nhất trong cây con bên phải (nút kế nhiệm trong thứ tự trung vị)
            TreeNode tmp = min_value_node(root.right);
            // Sao chép giá trị của nút kế nhiệm vào nút hiện tại
            root.data = tmp.data;
            // Xóa nút kế nhiệm trong cây con bên phải
            root.right = delete(root.right, tmp.data);
        }
        return root;
    }

    // Hàm tìm giá trị nhỏ nhất trong cây con
    public static TreeNode min_value_node(TreeNode node) {
        TreeNode current = node;
        // Đi đến nút ngoài cùng bên trái
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    //==================================================================
    public static int find_max(TreeNode root) {
        if(root == null){
            throw new IllegalArgumentException("Tree is empty");
        }
        while (root.right != null) {
            root = root.right;
        }
        return  root.data;
    }
    //=======================================================================
    public  static int find_min(TreeNode root){
        if(root == null){
            throw new IllegalArgumentException("Tree is empty");
        }
        while (root.left != null) root = root.left;
        return  root.data;
    }




    public  static  void printTree(TreeNode root){
        if(root != null){
            printTree(root.left);
            System.out.print(String.format(" [%d]",root.data));
            printTree(root.right);
        }
    }
}
