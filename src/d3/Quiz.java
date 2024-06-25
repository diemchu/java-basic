package d3;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Qa:  어떤 학생의 5과목에 대한 시험점수가 입력된다. 평균이 80점을 넘으면 "Good Job" 넘지 못하면 "Too Bad" 를 출력하여라.
        int total = 0;
        for (int i = 0; i  < 5; i++) {
            total +=  scanner.nextInt();
        }
        System.out.println( (double) (total/5)>80  ? "Good job" : "Too Bad" );


        //=======================================================================================================
//        Qb:치타는 엄청난 속도로 달리지만, 10초 밖에 달리지 못한다. 치타의 속도(m/s, 정수)와, 사냥감의 거리(m, 정수)와 속도(m/s, 정수)가
//        주어졌을 때 치타가 사냥에 성공하면 몇초가 걸려 잡았는지, 실패하면 "꼬르륵"을 출력하여라. 걸린 시간은 올림하여 정수로 표현한다.
//        단 치타와 사냥감은 같은 직선상에 움직이며, 치타와 사냥감 둘다 속도가 변하지 않는다


    }
}
