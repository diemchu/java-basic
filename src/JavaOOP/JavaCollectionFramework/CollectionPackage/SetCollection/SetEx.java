package JavaOOP.JavaCollectionFramework.CollectionPackage.SetCollection;


import java.util.*;

public class SetEx
{
    public static void main(String[] args) {

//** Set Interface
//        데이터의 중복을 허용하지 않고 순서를 유지하지 않는 데이터의 집합 리스트
//        순서 자체가 없으므로 인덱스로 객체를 검색해서 가져오는 get(index) 메서드도 존재하지 않는다
//        중복 저장이 불가능하기 때문에 심지어 null값도 하나만 저장할 수 있다
// Set Interface method()
//boolean add(E e) : 주어진 객체를 저장 후 성공적이면 true를 중복 객체면 false를 리턴합니다.
//boolean contains(Object o): 주어진 객체가 저장되어있는지 여부를 리턴합니다.
//  Iterator<E> iterator() : 저장된 객체를 한번씩 가져오는 반복자를 리턴합니다.
//isEmpty(): 컬렉션이 비어있는지 조사합니다.
//int Size(): 저장되어 있는 전체 객체수를 리턴합니다.
//void clear(): 저장된 모든 객체를 삭제합니다.
//boolean remove(Object o): 주어진 객체를 삭제합니다.

/**
 * Linked Hashset Class
 *배열과 연결 노드를 결합한 자료구조 형태
 * 가장 빠른 임의 검색 접근 속도를 가진다
 * 추가, 삭제, 검색, 접근성이 모두 뛰어나다
 * 대신 순서를 전혀 예측할 수 없다
  */

        System.out.println("-----------HashSet Class------------------------");
        Set<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(10));
        System.out.println(hashSet.add(20));
        System.out.println(hashSet.add(30));
        System.out.println(hashSet.add(10)); // 중복 요소 추가 할 때 false 반환
        System.out.println(hashSet.size());
        System.out.println(hashSet);
        System.out.println("------------------------------------------");

        System.out.println("------------------------------------------");


// ======================================================================================================
// Linked HashSet
//        순서를 가지는 Set 자료
//        추가된 순서 또는 가장 최근에 접근한 순서대로 접근 가능
//        만일 중복을 제거하는 동시에 저장한 순서를 유지하고 싶다면, HashSet 대신 LinkedHashSet을 사용하면 된다
        System.out.println("---------------LinkedHashSet Class-----------------");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        System.out.println(linkedHashSet.add(100));
        System.out.println(linkedHashSet.add(200));
        System.out.println(linkedHashSet.add(300));
        System.out.println(linkedHashSet.add(100)); // 중복된 수 추가 할 경우
        System.out.println(linkedHashSet.size()); // 중복된 건 카운트 x
        System.out.println(linkedHashSet.remove(100));
        System.out.println(linkedHashSet);

        System.out.println("------------------------------------------");

// ======================================================================================================
        System.out.println("---------------TreeSet Class---------------");
//TreeSet
// 이진 트리 검색 트리 (binary search tree) 자료구조의 형태로 데이터 저장
// 중복을 허용하자 않고 . 순서를 가지지 않다
 //대신 테이터를  정령하여 저장하고 있다는 특징이다
 // 정령, 검색, 범위 검색에  높은 성능을 뽑는다

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(1);
        treeSet.add(5);

        System.out.println(treeSet);
        System.out.println("------------------------------------------");

        System.out.println("------------------EnumSet------------------");
        // EnumSet 추상 클래스
//        Enum 클래스와 함께 동작하는 Set 컬렉션이다
//        중복 되지 않은 상수 그룹을 나타내는데 사용된다
//        산술 비트 연산을 사용하여 구현되므로 HashSet 보다 훨씬 빠르며, 적은 메모리를 사용한다
//        단, enum 타입의 요소값만 저장할 수 있고, 모든 요소들은 동인한 enum 객체에 소속되어야 한다
//        EnumSet은 추상 클래스고 이를 상속한 RegularEnumSet 혹은 JumboEnumSet 객체를 사용하게 된다.

        // 정적 팩토리 메서드를 통해 RegularEnumSet 혹은 JumboEnumSet 을 반환
        // 만일 enum 상수 원소 갯수가 64개 이하면 RegularEnumSet, 이상이면 JumboEnumSet 객체를 반환
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
        for(Color color : enumSet){
            System.out.println(color);
        }
        enumSet.add(Color.RED);
        System.out.println(enumSet.size());
        System.out.println(enumSet);


    }
}

enum  Color{
    RED,YELLOW,GREEN,BLUE,BLACK,WHITE
}
