package JavaOOP.JavaCollectionFramework.CollectionPackage.ListCollection;

import java.util.*;

public class ListEx {
    public static void main(String[] args) {
//         collection get khong co  method() get
        Collection<Integer> col1 = new ArrayList<>();
        col1.add(1);
        col1.add(2);
        col1.add(2);
        col1.add(2);


        //==================================================
        System.out.println("-----------ArrayList 예제--------------------");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Diem");
        arrayList.add("Nam");
        arrayList.add("Linh");
        System.out.println("lastIndexOf method() " + arrayList.lastIndexOf("Diem"));
        System.out.println("subList method() <지정된 범위에 있는 객체를 반환 > "+arrayList.subList(0,1));
        System.out.println("---------------------------------------------");

        System.out.println("-----------LinkedList 예제--------------------");
        List<Integer>  linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(29);
        linkedList.add(30);
        linkedList.remove(1);
        System.out.println("linkedList = "+linkedList);
        System.out.println("---------------------------------------------");


        System.out.println("-----------Vector 예제--------------------");
        Vector<String> vector = new Vector<>();
        vector.add("홍길동");
        vector.add("홍길동1");
        vector.add("홍길동2");
        vector.add("홍길동3");
        System.out.println(vector);
        System.out.println("---------------------------------------------");



        // stack kế thưa Vector nên có nhiều lỗi không hay dùng !!!!!!!!
        System.out.println("-----------Stack 예제--------------------");
        Stack<Integer>stack = new Stack<>();
        stack.add(10);
        stack.add(11);
        stack.add(12);
        stack.add(13);
        System.out.println(stack.peek());
        stack.pop();
        stack.remove(1);
        System.out.println(stack);
        System.out.println("---------------------------------------------");


    }
}
