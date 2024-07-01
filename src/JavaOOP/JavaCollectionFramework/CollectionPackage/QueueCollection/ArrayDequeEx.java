package JavaOOP.JavaCollectionFramework.CollectionPackage.QueueCollection;

import java.util.ArrayDeque;
import java.util.Deque;



// Queue method()
// boolean add(Object o) : 지정된 객체를 Queue에 추가저장공간 부족 시 IllegalStateException 발생
//Object remove() :  Queue에서 객체를 꺼내 반환비어있을 경우 NoSuchElementException 발생
//Object element(): 삭제없이 요소를 읽어온다비어있을 경우 NosuchElementException 발생
//boolean offer(Object o) : Queue에 객체를 저장
//Object poll() : Queue에서 객체를 꺼내서 반환비어있을 경우 null을 반환
//Object peek() :  삭제없이 요소를 읽어온다비어있을 경우 null을 반환


// offer() neu them vao hang doi thanh con se da ve true , hoac false
// add() khong tra ve gia tri nao . neu k them dc se tra ve ngoai le

public class ArrayDequeEx
{
    public static void main(String[] args) {
        Deque<Integer> deque  = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.addFirst(11);
        deque.addFirst(12);

//        deque.remove();
//        System.out.println(deque.element());
        deque.offer(30);
        deque.offerFirst(1);
        deque.offerLast(100);

        System.out.println(deque);
        System.out.println("첫번째 요소 값: "+deque.peekFirst());
        System.out.println("마지막 요소 값: "+deque.peekLast());

        System.out.println("첫번째 요소 삭제: "+deque.pollFirst());
        System.out.println("마직막 요소 삭제: "+deque.pollFirst());
        System.out.println(deque);


    }
}
