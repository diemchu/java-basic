package JavaOOP;


import java.util.Scanner;

// Java Inheritance(subclass and supperclass)
//Trong Java, có thể kế thừa các thuộc tính và phương thức từ lớp này sang lớp khác
// to inherit from a class use the extends keywork


class Vehicle {
    protected  String brand = "Ford";
    public  void honk(){
        System.out.println("Tuuuu, tuuuuu");
    }
}
class Car extends  Vehicle{
    private static String modelName = "Mustang";
    public void  getInfo(){
        System.out.println(String.format("brand = %s , modelName = %s",brand,modelName));
    }

}


public class JavaInheritance
{

    public static void main(String[] args) {
        Car car = new Car();
        car.honk();
        car.getInfo();
    }
}
