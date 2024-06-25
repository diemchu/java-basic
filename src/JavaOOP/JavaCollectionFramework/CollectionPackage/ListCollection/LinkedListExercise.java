package JavaOOP.JavaCollectionFramework.CollectionPackage.ListCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExercise {
    public static void main(String[] args) {
//        Bài tập 2:
//        Tạo và thao tác với LinkedList
//        Tạo một LinkedList chứa các chuỗi (String).
//        Thêm 5 tên vào danh sách.
//        In ra các phần tử trong danh sách.
//        Thêm một tên vào đầu danh sách và một tên vào cuối danh sách.
//        Lấy phần tử ở vị trí thứ 2 và in ra.
//        Xóa phần tử đầu tiên và phần tử cuối cùng.
//        In ra các phần tử trong danh sách sau khi xóa.
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("박지훈");
        linkedList.add("박지훈1");
        linkedList.add("박지훈2");
        linkedList.add("박지훈3");
        linkedList.add("박지훈4");
        linkedList.add("박지훈5");
        for(String element: linkedList){
            System.out.println(element);
        }
        linkedList.addFirst("박지훈0");
        System.out.println(linkedList.get(2));
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
