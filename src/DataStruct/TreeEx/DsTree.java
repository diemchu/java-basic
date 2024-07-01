package DataStruct.TreeEx;

public class DsTree {
    public static void main(String[] args) {
        // 이진트리
        //트리중에서 가장 많이 쓰는 트리가 이진트리이다. 모든 노드가 2개의 서버트리를 가지고 있는 트리를 이진 트리(binary tree) 라고한다.
        // 서브 트리는 공집합일 수도 있다
        // 따라서 이진트리의 노드에 최대 2개까지의 자식 노드 존재할 수 있고 모두 노드의 차수가 2이어야함
        // 왼쪽 서버트리 와 오른쪽 서버트리를 구분한다
        // n개의 노드 가지는 트리 n-1개의 간선을 가진다.
        // 높이가 h인 이진트리의 경우 최소 h개의 노드 가지며 최대 2^h - 1 개의 노드를 가질 수 있다.
        // 이진 트리 분류 :
        // 1> 포화이진트리 (full binary tree): 각 레벨에 노드가 꽉 차는 이진트리
        //2> 완전 이진트리 (complete binary tree):높이가 k일 때 레벨 1부터 k-1까지는
        // 노드가 모두 채워져 있고 마지막 레벨 k에서 왼쪽부터 오른쪽으로 노드가 순서대로 채워져 있어야함


        // 링크로 저장하는 방법
        TreeNode n1, n2, n3;
        n1 = new TreeNode();
        n2 = new TreeNode();
        n3 = new TreeNode();

        n1.data = 10;
        n1.left = n2;
        n1.right = n3;

        n2.data = 20;
        n2.left = null;
        n2.right = null;

        n3.data = 30;
        n3.left = null;
        n3.right = null;

        System.out.println(String.format("n1 = %d , n2 = %d , n3 = %d ",n1.data,n1.left.data,n1.right.data));
    }
}


