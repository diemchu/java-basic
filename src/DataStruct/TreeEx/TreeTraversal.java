package DataStruct.TreeEx;

import java.util.*;

public class TreeTraversal {
    //이진 트리를 순환 (traversal) 한다는 것은 이진트리에 속하는 모든 노르를  한번씩 방문하여
    // 노드가 가지고 있는 데이터를 목적에 맞게 처리하는 것을 의마한다
    // 이진 트리 순회 방법
    // 1> 전위 순회(preorder traversal) : VLR
    // 루트를 먼저 방문하공 그다음에 왼쪽 서브트리를 방문하고 오른쪽  서브트리를 마지막으로 하는 것이다
    // 2> 중위 순회(inorder traversal):LVR
    // 먼저 외쪽 서브트리 , 루트 , 오른쪽 서브트리 방문
    // 3> 후위 순회(postorder traversal):LRV
    // 외쪽서브트리 , 오른쪽 서브트리 , 루트 순으로 방문한다

    public static void main(String[] args) {
        // binary tree
        //               10
        //    2(n1)              4(n2)
        //1(n3)     3(n4)   6(n5)       7(n6)

        TreeNode node6 = new TreeNode(7, null, null);
        TreeNode node5 = new TreeNode(6, null, null);
        TreeNode node4 = new TreeNode(3, null, null);
        TreeNode node3 = new TreeNode(1, null, null);
        TreeNode node2 = new TreeNode(4, node5, node6);
        TreeNode node1 = new TreeNode(2, node3, node4);
        TreeNode root = new TreeNode(10, node1, node2);
//
//        System.out.print("중위순회: ");
//        inorder(root);
//        System.out.println();
//        System.out.print("전위순회: ");
//        preorder(root);
//        System.out.println();
//        System.out.print("후위순회: ");
//        postorder(root);

//        inorder_iter(root);
        level_order(root);
    }
    // 중위순회
    public  static void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.printf("[%2d] ",root.data);
            inorder(root.right);
        }
    }
    // 전위 순회
    public static  void preorder(TreeNode root){
        if(root != null){
            System.out.printf("[%2d] ",root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    // 후위순회
    public static void postorder(TreeNode root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.printf("[%2d] ",root.data);
        }
    }

    // 반복적 순회 Stack 이용하여 순회
    public  static void  inorder_iter(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        System.out.print("stack로 순회 = ");
        while (true){
            for(;root != null ; root = root.left){
                stack.push(root);
            }
            try {
                root = stack.pop();
            }catch (EmptyStackException e){
                break;
            }
            System.out.print(root.data+" ");
            root = root.right;
        }

    }

    // 레벨 순회
    // 동일한 레벨의 경우  좌에서 우로 방문한다
    public  static void level_order(TreeNode root){
        Deque<TreeNode> queue = new ArrayDeque<>();
        System.out.println();
        System.out.print("lever order(Deque) = ");
        if(root == null) return;
        queue.offer(root);
        while (!queue.isEmpty()){
            root = queue.pop();
            System.out.print(root.data+" ");
            if(root.left != null){
                queue.offer(root.left);
            }
            if(root.right != null){
                queue.offer(root.right);
            }
        }

    }
}
