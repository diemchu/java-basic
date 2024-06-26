package JavaOOP;


//객체와 객체를 비교할 수 있도록  만든 interfaces
//  Comparable은  자기 자신과 매개변수 객체를 비교


class Person  implements  Comparable<Person>{
    String name;
    int age ;


    Person(String name,int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Person person) {
        //자가 자신의 age가  person의 age 보가 크면  return 1
//        if(this.age > person.age) return  1;
        // 작으면 return -1
//        else  if (this.age < person.age) return -1;
        // 같으면 return 0
//        else return 0;
        return  this.age > person.age ? 1 : (this.age < person.age ? -1 : 0);
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        Person me = new Person("Diem",45);
        Person friend = new Person("Nam",30);
        System.out.println(me.compareTo(friend));
    }
}
