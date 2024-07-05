package d8;


//
//엔터로 구분된 누군가의 이름 입력이 임의의 횟수만큼 이뤄진다.
//q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
//여태까지 입력된 이름을 중복없이 알파벳 순서데로 출력하시오.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        String condition ="";
        while (true){
            condition = new Scanner(System.in).nextLine();
            if(condition.equals("q")) break;
            arrayList.add(condition);
        }
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println(arrayList);
    }
}
