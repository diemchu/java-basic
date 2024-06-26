package JavaOOP.JavaCollectionFramework.MapPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx
{
    //Hashtable을 보완한 컬렉션
    //배열과 연결이 결합된  hashing 형태로 , 키와 값을 묶어 하나의 데이터로 저장한다
    // 중복을 허용하지 않름
    // 키와 값으로 null
    // 추가, 삭제, 검색 접근성 모두 뛰어나다
    // HashMap 비동기로 작동하기 때문에 멀티  쓰레드 환경에서 어올리지 않는다
    // 대신 ConcurrentHashMap 사용

    //Entry là một giao diện bên trong của HashMap, đại diện cho một cặp khóa-giá trị đơn lẻ trong HashMap.
    // Mỗi mục nhập (entry) trong HashMap được biểu diễn bởi một đối tượng Map.Entry.

    public static void main(String[] args) {
        Map<String , String > hashMap = new HashMap<>();
        hashMap.put("love", "사랑");
        hashMap.put("apple","사과");
        hashMap.put("baby","아기");
        System.out.println(hashMap.get("baby"));

        // hashmap key 값들을 set 집합으로 반환하고 출력
        for(String key: hashMap.keySet()){
            System.out.println(key + "==>"+hashMap.get(key));
        }

        System.out.println(hashMap.containsKey("love"));
        System.out.println(hashMap.get("apple"));
        hashMap.remove("love");
        System.out.println(hashMap);

        for(Map.Entry<String, String> entry : hashMap.entrySet()){
            System.out.println(String.format("key = %s , value = %s ",entry.getKey(),entry.getValue()));
        }

    }

}
