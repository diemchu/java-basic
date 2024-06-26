package JavaOOP.JavaCollectionFramework.MapPackage;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    // HashMap을 상속하기 때문에 흡사하지만, Entry들이 연결 리스트를 구성하여 데이터의 순서를 보장한다.\
    // 일반적으로 Map 자료구조는 순서를 가지지 않지만, LinkedHashMap은 들어온 순서대로 순서를 가진다.
    // khác với HashMap thứ tự các phần tử được thêm vào sẽ được giữ thứ tự không bị đảo lộn

    public static void main(String[] args) {
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10,"Java");
        linkedHashMap.put(20,"Kotlin");
        linkedHashMap.put(30,"Dart");
        linkedHashMap.put(5,"JavaScript");

        System.out.println(linkedHashMap.isEmpty());
        for(Integer key : linkedHashMap.keySet()){
            System.out.println(String.format("key = %s, value = %s ",key,linkedHashMap.get(key)));
        }
    }
}