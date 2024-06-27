package JavaOOP;

import java.util.ArrayList;
import java.util.function.Predicate;


interface Calc {
    int sum(int a, int b);
}



interface Num<T>{
    boolean check(T t);
}

public class JavaLambda {

    //    Biểu thức lambda là một khối mã ngắn chứa tham số và trả về một giá trị.
//    Biểu thức Lambda tương tự như các phương thức<hàm>, nhưng chúng không cần tên và có thể được triển khai ngay trong phần nội dung của phương thức.
//    ( parameters ) -> expression body
//    ( parameters ) -> { expression body }
//() -> { expression body }
//() -> expression body
    public static void main(String[] args) {

        // khi khong dung lambda
        Calc calc = new Calc() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println("khong dung lambda: " + calc.sum(10, 20));

        // khi dung lambda
        Calc calc1 = (int a, int b) -> a + b;
        System.out.println("khi dung lambda : " + calc1.sum(10, 20));

        // tao ra 1 Thread dung Lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello word!!!!!!!!");
            }
        }).start();
        new Thread(() -> {
            System.out.println("Hello word!!!!!!!!");
        }).start();

        // viet ham lambda kiem tra xem co phai la so chan khong
        Num<Integer> t = n -> n % 2 == 0;
        Num<Integer> isGreaterThanTen = n -> n > 10;
        System.out.println("check = " + t.check(1));
        System.out.println(isGreaterThanTen.check(11));
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        Num<ArrayList<?>> checkLen =  a -> a.size()>10;
        // dau hoi cham the hien chap nhan bat cu phan tu nao
        System.out.println("checkLen = "+ checkLen.check(arrayList));

//        Predicate<T> được thiết kế để kiểm tra một điều kiện trên một đối tượng và trả về giá trị boolean
        Predicate<String> checkName =s ->  s.equalsIgnoreCase("Chu");
        System.out.println(checkName.test("chu"));


    }

}
