import java.util.Scanner;

public class D1VarAndTypes
{
    public static void main(String[] args) {
        // 변수를 선언하고
        int a = 2;
        int b = 3;
        // 사용한다.
        System.out.println(a + b);
        System.out.println(a);
        System.out.println(b);

        String line = "Hello Variables!";
        System.out.println(line);

        // 어떤 데이터를 담을지를 잘 정해주어야 한다.
        int thousand = 1000;
        // 다르면 오류가 발생
        // int ten = "10";

        // 변수를 먼저 만들고
        int date;
        // System.out.println(date); // 오류
        // 값은 나중에 할당할 수 있다.
        date = 10;
        // 단, 할당 전에 사용은 불가

        // 한줄에 두개 이상의 변수를 만들 수 있다.
        int month = 6, day = 20;
        System.out.println(month);
        System.out.println(day);


        // 문법적 변수 이름 규칙
        // 숫자로 시작할 수 없다.
        /* 오류
        int 1st = 10;
        int 2nd = 20;
         */

        // '_' 또는 '$' 외의 특수문자를 사용할 수 없다.
        int max_int = 10;
        int min$int = 20;
        /* 오류
        int sum# = 30;
        */

        // Java가 내부적으로 사용하는 단어는 사용할 수 없다.
        /* 오류
        int int = 10;
        int class = 20;
        int void = 100;
         */


        // 정수 자료형
        int integer = 10;
        long bigInteger = 1000000000;
        // 잘 안씀
        short smallInteger = 10000;
        byte reallySmall = 127;

        // long에 큰 데이터를 넣을때, L을 붙여줘야 큰 숫자가 된다.
        long longInt = 10000000000000L;

        // 실수 자료형
        // long에 L처럼 float는 F를 붙여줘야 한다.
        float floatPoint = 2.718281F;
        // 대부분의 상황에서 double을 쓴다.
        double doublePoint = 3.14159265359;

        // 문자(char) 자료형
        char alphabet = 'a';
        System.out.println(alphabet);
        // 특수 상황 제외, 두글자 이상 사용 불가
        // char alphabets = 'ab';
        // 글자 1
        char digit = '1';

        // 문자열(String) 자료형
        // 기술적으로는 char의 나열
        String word = "Hello";
        String world = "Hello World";
        String sentence = "this is a String variable";
        System.out.println(sentence.toUpperCase());

        // 문자와 문자열의 차이
        // String letter = 'a'; // 오류
        String letter = "a";
        // char charLetter = "a"; // 오류
        char charLetter = 'a';



        // Scanner 사용하기
        Scanner scanner = new Scanner(System.in);
        // scanner.nextLine()
        // 사용자의 다음 Enter 입력까지 String으로 받아온다.
        String inputLine = scanner.nextLine();
        System.out.println(inputLine);

        // 사용자한테 입력을 두번 받는다.
        String inputLine1 = scanner.nextLine();
        // Enter를 기준으로
        String inputLine2 = scanner.nextLine();

        System.out.println(inputLine2);
        System.out.println(inputLine1);

        // int를 받고싶으면 nextInt();
        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        System.out.println(inputA);
        System.out.println(inputB);
        System.out.println(inputA + inputB);

        // long을 받고싶으면 nextLong();
        long inputLong = scanner.nextLong();


    }
}
