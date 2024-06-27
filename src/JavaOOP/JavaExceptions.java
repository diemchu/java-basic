package JavaOOP;

public class JavaExceptions

{
    // khi thưc thi các đọa mã java có rất nhiều lỗi có thể sãy ra
    // lỗi nhập sai, lỗi do lập trình vvv...
    // khi xảy ra lỗi java sẽ dừng trương trình lại để báo lỗi
    // sử dụng ngoại lệ java sẽ ném ra 1 ngoại lạ và trương trình java vẫn chạy
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        try {
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("The try catch is finished");
        }

        /// The throw keyword
        // The throw statement allows you to create a custom error.
        // There are many exception types available in Java:
        // ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException
        checkAge(20);
    }

    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("ban chua du 18 tuoi");
        }else{
            System.out.println("ban da du 18 tuoi");
        }
    }
}
