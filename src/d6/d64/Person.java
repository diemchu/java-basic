package d6.d64;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Person  implements  Comparable
{

    private  String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public  void printInfo(){
        System.out.println(String.format("%s , %d",name,age));
    }

    @Override
    public int compareTo(@NotNull Object o) {
        Person other = (Person) o;
        int nameOrder = name.compareTo(other.name);
        if(nameOrder == 0){
            return  age - other.age;
        }
        return  nameOrder;

//        return  this.age - ((Person)o).age;
    }


}
