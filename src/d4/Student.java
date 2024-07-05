package d4;

class Person1 {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printInfo() {
//        System.out.println(String.format("name = %s , age = %d",this.name,this.age));
        return String.format("name = %s , age = %d", this.name, this.age);
    }
}


public class Student extends Person1 {
    private int id;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String printInfo() {
        return String.format("%s ,id = %d", super.printInfo(), this.id);
    }


    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setName("a");
        person1.setAge(10);
        System.out.println(person1.printInfo());


        Student student = new Student(100);
        student.setName("BBB");
        student.setAge(1000);
        student.printInfo();
        System.out.println(student.printInfo());


    }
}
