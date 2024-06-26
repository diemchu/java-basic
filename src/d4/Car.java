package d4;

// 차동자 설계도
public class Car {
    // 이름
    public String name;
    // 브랜드
    public String brand;
    //연료 상태
    public  int fuel;

    public void addFuel(int moreFuel){
        this.fuel += moreFuel;
    }
    @Override
    public String toString() {
        return String.format("Car: %s %s %d \n",name,brand,fuel);
    }
}
//public class Car {
//    // private이 붙으면 Car 클래스 외부에서 접근이 불가하다.
//    // public, private 등을 접근 제어자라고 한다.
//    private String name;
//    private int fuel;
//
//    // 생성자: 객체를 만들때 사용하는 메서드
//    // => 새로운 객체를 만드는 방법
//    public Car() {
//        name = "K5";
//        fuel = 100;
//    }
//
//    // Getter & Setter
//    public int getFuel() {
//        return fuel;
//    }
//
//    public void setFuel(int moreFuel) {
//        if (!(fuel > moreFuel)) {
//            fuel = moreFuel;
//        }
//    }
//    public String getName() {
//        // private이어도 클래스 안에서는 사용 가능
//        return name;
//    }
//}