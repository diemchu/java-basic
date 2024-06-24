package d3;

public class D31Conditional {
    public static void main(String[] args) {
        // 나이가 20 미만인 경우 입장 불가
//        int age = 19;
//        // if (<boolean data>) {
//        //     <boolean data>가 true일 때 실행할 코드
//        // }
//        if (age < 20) {
//            System.out.println("You cannot enter");
//        }
//        // 비교, 논리 연산자가 많이 활용되며,
//        // 최종적으로 boolean이면 된다.
//        if (true) System.out.println("always run");
//
//
//        // 4의 배수인지 확인한 다음
//        // 4의 배수가 맞으면 100의 배수인지
//        // 100의 배수가 맞으면 400의 배수인지
//        int year = 2001;
//        if (year % 4 == 0) {
//            System.out.println("4의 배수");
//            // 4의 배수일때만 실행되는 코드
//            if (year % 100 == 0) {
//                // 4의 배수이면서 100의 배수일때만 실행되는 코드
//                System.out.println("100의 배수");
//            }
//            if (year % 400 == 0) {
//                // 4의 배수이면서 400의 배수일때만 실행되는 코드
//                System.out.println("400의 배수");
//            }
//        }

        int num = 7;
        // num이 짝수이면 even이라고 출력하고 싶다.
        if (num % 2 == 0) {
            System.out.println("even");
        }
        // num이 홀수라면 odd이라고 출력하고 싶다.
        else {
            System.out.println("odd");
        }





        // 나이가 20 미만인 경우 입장 불가
        int age = 19;
        // if (<boolean data>) {
        //     <boolean data>가 true일 때 실행할 코드
        // }
        if (age < 20) {
            System.out.println("You cannot enter");
        }
        // 비교, 논리 연산자가 많이 활용되며,
        // 최종적으로 boolean이면 된다.
        if (true) System.out.println("always run");


        // 4의 배수인지 확인한 다음
        // 4의 배수가 맞으면 100의 배수인지
        // 100의 배수가 맞으면 400의 배수인지
        int year = 2001;
        if (year % 4 == 0) {
            System.out.println("4의 배수");
            // 4의 배수일때만 실행되는 코드
            if (year % 100 == 0) {
                // 4의 배수이면서 100의 배수일때만 실행되는 코드
                System.out.println("100의 배수");
            }
            if (year % 400 == 0) {
                // 4의 배수이면서 400의 배수일때만 실행되는 코드
                System.out.println("400의 배수");
            }
        }

//        int num = 7;
        // num이 짝수이면 even이라고 출력하고 싶다.
        if (num % 2 == 0) {
            System.out.println("even");
        }
        // num이 홀수라면 odd이라고 출력하고 싶다.
        else {
            System.out.println("odd");
        }


        // 느긋하면(남은시간 1시간 이상) 버스, 급하면 택시
        int current = 8;
        int goal = 9;
        if (goal - current >= 2) {
            System.out.println("Take Bus");
        }
        else if (goal - current >= 1) {
            System.out.println("Take Subway");
        }
        else {
            System.out.println("Take Cab");
        }

        // 미세먼지 농도에 따른 메시지 변경
        int dust = 62;
        if (dust <= 30) {
            System.out.println("Good");
        }
        else if(dust <= 80) {
            System.out.println("Normal");
        }
        else if (dust <= 150) {
            System.out.println("Bad");
        }
        else {
            System.out.println("Very Bad");
        }

    }
}
