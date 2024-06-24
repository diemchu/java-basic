package JavaOOP;
// là một loại đặc biệt của lớp, được sử dụng để khai báo một tập hợp các phuong thức
// mà các lớp khác phải tuân theo
// một interface không thể chứa các phương thức có phần thân body
// ngoại trừ các phương thức mạc định default method
//và các phương thức tĩnh static method. chi định nghĩa các phương thức trìu tượng
// abstract methods mà không cung cấp bất kì phần hiện thực nào
//Tất cả các phương thức trong interface mặc định là public và abstract:
// Các biến được khai báo trong interface mặc định là public, static, và final.
// nen k modifiers khi khai bao


interface  Animal1{
    int age = 10;
    void eat();
    void makeSound();
    default  void sleep(){
        System.out.println("Sleeping........");
    }
    static  void run(){
        System.out.println("Running");
    }
}

interface  Machine{
    void showAge(int age);
}
//Một lớp có thể thực hiện nhiều interface,
// khắc phục hạn chế của việc không thể kế thừa từ nhiều lớp trong Java.
class Lion implements  Animal1 , Machine{

    @Override
    public void eat() {
        System.out.println("nhoam nhoam!!!!!!!!!!!!!!!!");

    }
    @Override
    public void makeSound() {
        System.out.println("Grum Grum!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public void showAge(int age) {
        System.out.println("age = "+age);
    }
}



public class JavaInterface {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.makeSound();
        lion.sleep();
        lion.showAge(10);

        Animal1.run();
    }
}
