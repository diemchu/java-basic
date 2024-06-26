package d4;

import java.util.Scanner;

public class D4Class {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.name  = "내 차동자";
        myCar.brand = "현대";
        myCar.fuel = 2022;
        System.out.println(myCar.name);
        System.out.println(myCar.brand);
        System.out.println(myCar.fuel);
//         배열로 Car 객체 저장





        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            cars[i].name = String.format("내 차동자 %d",i);
            cars[i].brand = "Benz";
            cars[i].fuel = i+2000;


            // 연료 추가하는 함수를 실행한다
            cars[i].addFuel(100);
        }
        for (Car car: cars){
            System.out.println(car);
        }




    }

}
