package d6.d64;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
//        Car car = new Car();
//        makeBeepSound(car);
//        drive(car);
//        Ship ship = new Ship();
//        ship.beep();

        Person person  = new Person("alex",40);
        Person person1  = new Person("jhon",50);
        Person person2  = new Person("conan",20);
        Person person3  = new Person("peter",30);
        Person[] persons = new Person[]{person,person1,person2,person3};
        Arrays.sort(persons);
        for(Person p : persons){
            p.printInfo();
        }
    }

    public static  void makeBeepSound(Beeper beeper){
        beeper.beep();
    }
    public  static  void drive(Drivable drivable){
        drivable.drive();
    }
}
