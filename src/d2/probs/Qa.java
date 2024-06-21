package d2.probs;

import java.util.Scanner;

public class Qa
{
    public static void main(String[] args) {
        // 사용자 두개의 단어를 입력 받고
        // 두개의 단어를 붙어서 출력하 코드를 작성
        Scanner scanner = new Scanner(System.in);
        String first =  scanner.nextLine();
        String second = scanner.nextLine();
        System.out.println(first+second);
        System.out.println(String.format("%s%s",first,second));
    }
}
