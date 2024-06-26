package JavaOOP.JavaCollectionFramework.MapPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx
{
    // Map 개념
    // key 와 value의 쌍으로 연관지어 이루어진 데이터 집합
    // 값은 중복되서 정장될 수 있지만 키(key)는 해당 Map에 고유해야만 한다
    // 만일 기존에 저장된 데이터와 중복된 카와 값을 저장하면  기존의 값은 없어지고 마지막에 값이 남게 된다
    // 저장 순서가 유지 되지 않다

    // Map Interface  함수
//    void clear() Map의 모든 객체를 삭제
//    boolean containsKey(Object key) 지정된 key 객체와 일치하는 객체가 있는지 확인
//    boolean containsValue(Object value) : 지정된 value객체와 일치하는 객체가 있는지 확인
//    Set entrySet()  : Map에 저장된 key-value쌍을 Map.Entry타입의 객체로저장한 Set을 반환
//    boolean equals(Object o) 동일한 Map인지 비교
//    Object get(Object key): 지정한 key객체에 대응하는 value객체를 반환
//    int hashCode() 해시코드를 반환
//    boolean isEmpty() : Map이 비어있는지 확인
//    Set keySet() : Map에 저장된 모든 key객체를 반환
//    Object put(Object key, Object value) : Map에 key객체와 value객체를 연결(mapping)하여 저장
//    void putAll(Map t): 지정된 Map의 모든 key-value쌍을 추가
//    Object remove(Object key) : 지정한 key객체와 일치하는 key-value객체를 삭제
//    int size() : Map에 저장된 key-value쌍의 개수를 반환
//    Collection values() : Map에 저장된 모든 value객체를 반환

//  주의
//    Map 인터페이스의 메소드를 보면, Key값을 반환할때 Set 인터페이스 타입으로 반환하고,
//    Value값을 반환할때 Collection 타입으로 반환하는걸 볼 수 있다.
//    Map 인터페이스에서 값(value)은 중복을 허용하기 때문에 Collection 타입으로 반환하고,
//    키(key)는 중복을 허용하지 않기 때문에 Set 타입으로 반환하는 것이다

//  Map.Entry 인터페이스
//  Map.Entry 인터페이스는 Map 인터페이스 안에 있는 내부 인터페이스이다.
//  Map 에 저장되는 key - value 쌍의 Node 내부 클래스가 이를 구현하고 있다.
//  Map 자료구조를 보다 객체지향적인 설계를 하도록 유도하기 위한 것이다.
//boolean equals(Object o): 동일한 Entry 인지 비교
//    Object getKey( ) : Entry 의 key 객체를 반환
//    Object getValue( ): Entry 의 value 객체를 반환
//    int hashCode( ) : Entry 의 해시코드 반환
//    Object setValue(Object value): Entry 의 value 객체를 지정된 객체로 바꾼다.

    public static void main(String[] args) {
        Map<String , Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        hashMap.put("c",3);


//        Map.Entry 인터페이스를 구현하고 있는 Key-Value 쌍을 가지고 있는 HashMap의 Node 객체들의 Set 집합을 반환
        Set<Map.Entry<String, Integer>> entry = hashMap.entrySet();
        System.out.println(entry);

        // // Set을 순회하면서 Map.Entry를 구현한 Node 객체에서 key와 value를 얻어 출력
        for(Map.Entry<String,Integer> e: entry){
            System.out.printf("{%s %d}\n",e.getKey(),e.getValue());
        }

    }
}
