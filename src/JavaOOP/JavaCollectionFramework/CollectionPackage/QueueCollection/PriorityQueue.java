package JavaOOP.JavaCollectionFramework.CollectionPackage.QueueCollection;


import java.util.Queue;

// 우선순쉬 큐에 저장할 객체는 필수적으로 Comparable를 구현
class  Student implements  Comparable<Student>{
    public  String name;
    public  int score;
    public  int priority; // 우선순위 값

    public Student(String name, int score, int priority) {
        this.name = name;
        this.score = score;
        this.priority = priority;
    }

    @Override
    public int compareTo(Student user) {
        // Student의 priority 팔드값을 비교하여 우선순위를
        // 결정하여  정렬
        // 오름차순 정령
        if (this.priority < user.priority) return  -1;
        else if(this.priority == user.priority) return  0;
        else return  1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", priority=" + priority +
                '}';
    }
}


public class PriorityQueue
{
    public static void main(String[] args) {
        //오름차순 우선순위 퀴
        Queue<Student> priorityQueue = new java.util.PriorityQueue<>();


        priorityQueue.add(new Student("홍길동",100,10));
        priorityQueue.add(new Student("홍길동1",90,10));
        priorityQueue.add(new Student("홍길동2",80,12));
        priorityQueue.add(new Student("홍길동3",800,3));
        System.out.println("element : " + priorityQueue.element());
        // 우선순위가 가장 높은 값을 참조
//        System.out.println(priorityQueue.peek());
        // Queue에서 객체를 꺼내서 반환
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());



    }
}
