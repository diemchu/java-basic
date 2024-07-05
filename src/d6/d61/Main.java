package d6.d61;

public class Main {

    public static void main(String[] args) {
        Person s = new Student();
        s.setAge(20);
        s.setName("alex");
        if(s instanceof  Student){
            ((Student) s).setMajor("컴퓨터 학과");
            ((Student) s).setGrades(4.5);
            ((Student) s).printInfo();
        }
        s = new Lecturer();
        s.setName("alex");
        s.setAge(20);
        for(int i = 0 ; i<=20; i++)s.getOld();
        if(s instanceof  Lecturer){
            ((Lecturer)s).setPapers(10);
            ((Lecturer)s).setMajor("컴퓨터 공학");
            ((Lecturer) s).printInfo();
        }
    }
}
