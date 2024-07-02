package d6;

public class Person
{

    private int age;
    private  String name;

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getOld(){
        this.age++;
    }

    public  void printInfo(){
        System.out.println("Person -> %s ,%d");
    }
}
