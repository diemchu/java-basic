package JavaOOP.JavaCollectionFramework.CollectionPackage.ListCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args) {
//              Bài tập 1
//        Tạo và thao tác với ArrayList
//        Tạo một ArrayList chứa các số nguyên.
//        Thêm các số từ 1 đến 10 vào danh sách.
//        In ra các phần tử trong danh sách.
//        Xóa phần tử ở vị trí thứ 5.
//        Kiểm tra xem số 3 có trong danh sách không.
//        In ra kích thước của danh sách.

        List<Integer> arrayList =  new ArrayList<>();
        for(int i = 0 ; i<10;i++){
            arrayList.add(i);
        }
        System.out.println("element of arrayList:  "+arrayList);
        arrayList.remove(5);
        System.out.println("arrayList sau khi xóa phần tử thứ 5: "+arrayList);
        System.out.println(String.format("so 3 co trong arrayList khong?  %s",arrayList.contains(3) ? "yes" :"no"));
        System.out.println("size of arrayList = "+arrayList.size());
    }
}
