package d8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Integer number, sum = 0;
        while (true) {
            try {
                String s = new Scanner(System.in).nextLine();
                if (s.equals("q")) break;
                number = Integer.parseInt(s);
            } catch (NumberFormatException exception) {
                System.out.println("숫자가 아님");
                continue;
            }
            list.add(number);
            sum += number;
        }
        System.out.println(list.size());
        System.out.println(sum);
    }
}
