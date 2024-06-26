package JavaOOP.JavaCollectionFramework.MapPackage;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx
{

    // TreeMap
//    이진 검색 트리의 형태로 키와 값의 쌍으로 이루어진 데이터를 저장 (TreeSet 과 같은 원리)
//    TreeMap은 SortedMap 인터페이스를 구현하고 있어 Key 값을 기준으로 정렬되는 특징을 가지고 있다.
//    정렬된 순서로 키/값 쌍을 저장하므로 빠른 검색(특히 범위 검색)이 가능하다
//    단, 키와 값을 저장하는 동시에 정렬을 행하기 때문에 저장시간이 다소 오래 걸리다
//    정렬되는 순서는 숫자 → 알파벳 대문자 → 알파벳 소문자 → 한글 순이다.
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"Toby");
        treeMap.put(10,"Boby");
        treeMap.put(12,"Voby");
        treeMap.put(11,"Coby");
        treeMap.put(5,"Roby");
        for (Map.Entry<Integer,String>entry : treeMap.entrySet()){
            System.out.println(String.format("key = %s , value = %s",entry.getKey(),entry.getValue()));
        }

    }
}
