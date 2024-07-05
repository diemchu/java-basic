package d7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

// 예외처리 조상 클래스는 Throwable
// Throwable 상속받은 Exception vs Error
// Error는 개발자 처리 불가능한 에러
// Exception : 기대하지 않는 상황에 대한 , 처리 가능
public class ExceptionHandling {
    public static void main(String[] args){
//        System.out.println(safeFace(51));

        Scanner scanner  = new Scanner(System.in);
        String filename = scanner.nextLine();
        readFileContents(filename);

        //
        try {
            readFileContents2(filename);
        }catch (FileNotFoundException e){
            System.out.println(filename+" not Found");
        }

        //
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Integer c = null;
            // RuntimeException
            //코드를 꼼꼼히 짜면 방지가 가능 하다
            if(b!=0){
                System.out.println(divide(a,b));
            }
            System.out.println(divide(a,c));
        }
//        catch (InputMismatchException e){ // 잘 못입력했을 경우 예외처리
//            System.out.println("please input integer");
//        }
        catch (ArithmeticException exception){
            System.out.println("sorry , i can`t do that");
            System.out.println(exception.getClass());
            System.out.println(exception.getMessage());
        }catch (InputMismatchException | NullPointerException ignored){
            System.out.println("Some thing bad has happened");
            System.out.println(ignored.getMessage());
            System.out.println(ignored.getClass());
        }finally {
            System.out.println("Bye!!");
        }

    }

    //==========================================
    public static int safeFace(long n){
//         만약  너무 큰 굿자를 방지하고 싶다면
        if(n>50){
//            RuntimeException  e = new RuntimeException("좀 작은 숫자 넣어주세요");
            // 직접 예외를 발생 시킬 수 있다. 안쪽에 작성한 내용 getMessage()를 확인
            // ngoai le nay duoc nem ra khi truong trinh dang chay
            throw new RuntimeException("too big input");
        }
        if(n == 0 ) return  1;
        return safeFace(n-1);
    }

    // ============================================================
    // checked Exception
    // code 외적인 상황으로 발생할 수 있는 예외
    public  static  void readFileContents(String filename){
        try {
            File file = new File(filename);
            Scanner scanner  = new Scanner(file);
            System.out.println(scanner.nextLine());
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
    }
    //được sử dụng trong khai báo phương thức để chỉ ra rằng phương thức đó có thể ném (throw) ngoại lệ.
    // Nó chỉ rõ các loại ngoại lệ mà phương thức có thể ném.
    public  static void readFileContents2(String filename) throws FileNotFoundException {
        //발생 가능성을 명세하야 한다
        File file = new File(filename);
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
    }
    //
    public  static  int divide(int a,int b){
        return  a/b;
    }


}
