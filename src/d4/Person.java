package d4;
/**
 * 이름,나이
 * 이름은 마음대로 정한다
 * 기본적으로 나이는 25살. 마음대로 변화시키지 못한다
 * */
public class Person {
    //name은  이름을 담기 위한 속성
    private  String name;
    private  int age;
    public Person(){
        age = 25;
    }
    // 이름을 넣어주는 메서드
    public String getName(){
        return  this.name;
    }
    // 이름 설정하는 함수
    public void setName(String name) {
        this.name = name;
    }
    //age 알려주는 메서드
    public int getAge(){
        return  this.age;
    }
    public static void main(String[] args) {
        Person alex = new Person();
        alex.setName("alex");
        System.out.println(String.format("name = %s , age = %d ",alex.getName(), alex.getAge()));
        Person brand = new Person();
        brand.setName("brand");

    }
}
