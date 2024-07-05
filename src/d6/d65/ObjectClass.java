package d6.d65;

public class ObjectClass
{
    public static void main(String[] args) {
        // 모든 것은 object
        Object object = new String("aaaaaaa");
        System.out.println(object.getClass());
        // Java 내부에서 클래스 및 객체를 편하게 쓰기 위해
        // Object에 여러 메서드를 미리 만들어 둔 것
        System.out.println(object.toString());

        Person alex = new Student();
        alex.setName("alex");
        alex.setAge(26);
        if(alex instanceof  Student student){
            student.setMajor("Cse");
        }

        // 임의의 객체를 println에 전달하면
        // println(Object o)가 호출된다.
        System.out.println(alex);

        // Object는 모든 Java 클래스가 상속받는 클래스
        Object something = new Student();
        if(something instanceof  Student student){
            student.setName("bard");
            student.setAge(20);
            student.setMajor("CSE");
        }
        System.out.println(something);

        // 객체들의 비교는 주소값을 비교하게 된다.
        System.out.println(alex == something);
        System.out.println(alex.equals(something));
        System.out.println(alex.equals(alex));

        //=================================
        // So sanh 2 doi tuong giong nhau
        Student alex2 = new Student();
        alex2.setName("alex");
        alex2.setAge(25);
        alex2.setMajor("CSE");
        System.out.println(alex.equals(alex2));
        //==========================================
        Person noName = new Student();
        System.out.println(noName.getAge());
        System.out.println(noName.getName());

        try {
            if(noName.getName() == null){
                System.out.println(noName.getName().equals("alex"));
            }else System.out.println(false);
        }catch (NullPointerException e){
            System.out.println("alex notFound");
        }
        //============================================
        // khi 2 đối tượng bằng nhau thì trả về mã băm bằng nhau
        System.out.println(alex.hashCode());
        System.out.println(alex2.hashCode());
        System.out.println(alex.equals(alex2));

    }
}
