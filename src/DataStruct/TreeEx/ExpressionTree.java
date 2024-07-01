package DataStruct.TreeEx;

public class ExpressionTree
{
    //이진 트리는 수식 트리(expression tree)를 처리하는데 사용된다.
    //수식 트리 전위,중위,후위의 순회 방법으로 읽으면 각각 전위  표기 수식, 중위 표기 수식, 후위 표기 수식이 된다
    // 예를 들어  a-(b*c)
    // 전위 표기: -a*bc
    // 중위 : a  -(b*c)
    // 후위:  abc*-


    public static void main(String[] args) {
        // 수식
        //        +
        //   *          +
        //1     4    16   25
        TreeNode n1 = new TreeNode(1,null,null);
        TreeNode n2 = new TreeNode(4,null,null);
        TreeNode n3 = new TreeNode(16,null,null);
        TreeNode n4 = new TreeNode(25,null,null);
        TreeNode n5 = new TreeNode('*',n1,n2);
        TreeNode n6 = new TreeNode('+',n3,n4);
        TreeNode root = new TreeNode('+',n5,n6);
        System.out.println(String.format("수식의 값은 %d",evaluate(root)));
    }
    public static  int evaluate (TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.data;
        else{
            int op1 = evaluate(root.left);
            int op2= evaluate(root.right);
            System.out.println(String.format("%d %c %d을 계산한다",op1,(char)root.data,op2));
            switch ((char)root.data){
                case '+': return op1 + op2;
                case '-': return op1 - op2;
                case '*': return op1 * op2;
                case '/': return op1 / op2;
            }
        }
        return 0;
    }
}
