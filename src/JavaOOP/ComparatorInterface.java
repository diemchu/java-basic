package JavaOOP;


//두 매개변수 객체를 비교
// 자기 자신이 아니라 파라미터(매개 변수)로 들어오는 두 객체를 비교하는 것이다. 여기서 바로 Comparable과 차이가 발생하는 것이다.

import java.util.Comparator;

class  ComparatorTest implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.age > o2.age) return  1;
        else if(o1.age < o2.age) return  -1;
        else return  0;
    }
}
public class ComparatorInterface {
    public static void main(String[] args) {
       Person person1 = new Person("Diem",20);
       Person person2 = new Person("Nam",25);
       System.out.println("person1 vs person2: "+ new ComparatorTest().compare(person1,person2));
    }
}
