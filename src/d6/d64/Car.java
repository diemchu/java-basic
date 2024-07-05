package d6.d64;

public class Car implements  Beeper , Drivable{
    @Override
    public void beep() {
        System.out.println("빵빵");
    }

    @Override
    public void drive() {
        System.out.println("drive!!!!!!!!!!!!!!!!!!");
    }
}
