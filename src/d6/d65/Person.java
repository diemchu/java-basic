package d6.d65;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;

    // 내가 만든 클래스도 Java내부의 기능들(println)에 대하여
    // 동작하는 방식을 정하고 싶다면 만들 수 있는 메서드들

    @Override
    public String toString() {
        return String.format("{Person[name = %s, age = %d]", this.name, this.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return  age == person.age && Objects.equals(name , person.name);
    }


//    Mục đích của phương thức này là cung cấp một giá trị băm (hash code) cho đối tượng
//    giúp các cấu trúc dữ liệu như HashMap, HashSet, và Hashtable hoạt động hiệu quả.

    @Override
    public int hashCode() {
//        return Objects.hash(name, age);
        int result = name.hashCode();
//        31 là một số nguyên tố thường được sử dụng trong việc tính toán giá trị băm để giảm thiểu xung đột băm (hash collisions).
        result = 31 * result + age;
        return result;
    }

    public String getName() throws  NullPointerException{
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
}
