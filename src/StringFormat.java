public class StringFormat
{
    public static void main(String[] args) {
        // String Formatting
        int dust = 10;
        String status = "좋음";
// 변수에 저장된 값을 문자열에 표현하고 싶다면?
        System.out.println("미세먼지 농도: dust (status)");
// String.format을 사용
// 문자열을 템플릿처럼 사용하기
        String message = String.format("미세먼지 농도: %d, (%s)", dust, status);
        System.out.println(message);
        System.out.printf("미세먼지 농도: %d, (%s)\n",dust,status);

// %d: 정수, %s: 문자열
        System.out.println(String.format("미세먼지 농도: %d, (%s)", dust, status));
// %c: 문자
        System.out.println(String.format("코드: %c", 'B'));
// %f: 실수
        System.out.println(String.format("오존: %f", 0.022));
        System.out.println(String.format("오존: %.4f", 0.022));
// % 갯수 보다 값이 적으면 오류
//        System.out.println(String.format("%d, %d, %d", 1, 2));
// % 갯수 보다 값이 많으면 뒤의 값은 활용하지 않는다.
//        System.out.println(String.format("%d, %d, %d", 1, 2, 3, 4));
    }

}
