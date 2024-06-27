package JavaOOP.JavaCollectionFramework.CollectionPackage;



import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// 이 클래스는  컬렉션에서 작동하거나 반환하는 정적 메서드로만 구성된다
// 여기서 컬렉션에서 작동하는 다형성 알고리즘이  포함되어 있다
// Collections는  Collection와 다르다
// Collections는 클래스이다. 이 클래스 안에 있는 매서드는 static이 기때문에 인스턴스를 생성하지않고
//바로 사용할 수 있다


class Student implements Comparable<Student>{
    private final   int id;
    private  final String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return Integer.compare(this.id,o.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(60);
        arrayList.add(10);
        arrayList.add(2);
        //
        // sort an arrayList
        Collections.sort(arrayList);
        System.out.println("sort an array: "+arrayList);
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("reverseOeder an array: "+arrayList);
        //
        System.out.println("Sort object ArrayList");
        List<Student> students =  new LinkedList<>();
        students.add(new Student(11,"박지훈1"));
        students.add(new Student(10,"박지훈2"));
        students.add(new Student(111,"박지훈3"));
        students.add(new Student(131,"박지훈4"));
        students.add(new Student(115,"박지훈5"));
        System.out.println("before sort inkedList");
        for (Student s : students){
            System.out.println(s);
        }
        Collections.sort(students);
        System.out.println("after sort inkedList");
        for (Student s : students){
            System.out.println(s);
        }

    }
}
